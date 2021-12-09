public class ChipsDecorator extends ToppingDecorator {
    ChipsDecorator(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public String serve() {
        return _hamburger.serve() + " with chips";
    }
}