public class OnionRingsDecorator extends ToppingDecorator {
    OnionRingsDecorator(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public String serve() {
        return _hamburger.serve() + " with onion rings";
    }
}