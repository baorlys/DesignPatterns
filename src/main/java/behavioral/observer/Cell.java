package behavioral.observer;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Cell implements EventListener {
    private String name;

    public Cell(String name) {
        this.name = name;
    }

    @Override
    public void update(String eventType, Object source) {
        System.out.println("Cell " + name + " received event: " + eventType + " from " + source);
    }
}
