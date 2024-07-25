package behavioral.observer;

import org.junit.jupiter.api.Test;


class ColumnHandlerTest {
    @Test
    void testCreateColumn() {
        ColumnHandler columnHandler = new ColumnHandler();
        Cell cell = new Cell("1");
        Cell cell2 = new Cell("2");
        columnHandler.getEvents().subscribeAll(cell);
        columnHandler.getEvents().subscribe("create", cell2);
        columnHandler.createColumn("Column 1");
        columnHandler.updateColumn();


    }

}