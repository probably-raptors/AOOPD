public class SaladDecorator extends ToppingDecorator {
    SaladDecorator(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public String serve() {
        return _hamburger.serve() + " with salad";
    }
}