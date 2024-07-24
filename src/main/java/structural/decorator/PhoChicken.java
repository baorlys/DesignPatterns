package structural.decorator;

public class PhoChicken implements IPho {
    @Override
    public String serve() {
        return "Serving Pho with chicken";
    }
}
