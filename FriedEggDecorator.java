public class FriedEggDecorator extends ToppingDecorator {
    FriedEggDecorator(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public String serve() {
        return _hamburger.serve() + " with fried egg";
    }
}