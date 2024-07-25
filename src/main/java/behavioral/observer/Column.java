package behavioral.observer;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Column {
    private String name;
    private boolean isHidden = false;
}
