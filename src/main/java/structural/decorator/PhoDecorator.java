package structural.decorator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PhoDecorator implements IPho {
    protected IPho wrapper;
    public PhoDecorator(IPho pho) {
        this.wrapper = pho;
    }

    @Override
    public String serve() {
        return wrapper.serve();
    }
}
