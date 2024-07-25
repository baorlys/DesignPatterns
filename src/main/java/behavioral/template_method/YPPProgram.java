package behavioral.template_method;

public abstract class YPPProgram {
    public final void run() {
        System.out.println("YPP Program started");
        start();
        System.out.println("YPP Program ended");
    }

    protected abstract void start();
}
