package structural.decorator;

public class PepperDecorator extends PhoDecorator {

    public PepperDecorator(IPho pho) {
        super(pho);
    }

    @Override
    public String serve() {
        return super.serve() + " with pepper";
    }
}
