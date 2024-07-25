package behavioral.observer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ColumnHandler {
    private EventManager events;
    private Column column;

    public ColumnHandler() {
        this.events = new EventManager("create","delete","update");
    }

    public void createColumn(String name) {
        this.column = new Column();
        this.column.setName(name);
        events.notify("create", this.column);
    }

    public void deleteColumn() {
        events.notify("delete", this.column);
        this.column = null;
    }

    public void updateColumn() {
        this.column.setHidden(!this.column.isHidden());
        events.notify("update", this.column);
    }


}
