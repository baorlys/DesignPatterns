package structural.decorator;

public class OnionDecorator extends PhoDecorator {
    public OnionDecorator(IPho pho) {
        super(pho);
    }

    @Override
    public String serve() {
        return super.serve() + " with onion";
    }
}
