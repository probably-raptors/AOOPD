public abstract class ToppingDecorator implements Hamburger {
    Hamburger _hamburger;

    ToppingDecorator(Hamburger hamburger) {
        _hamburger = hamburger;
    }
}
