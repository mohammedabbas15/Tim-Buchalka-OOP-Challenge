public class DeluxeBurger extends Hamburger
{
    public DeluxeBurger()
    {
        super("Deluxe", "White", "Beef", 14.54);
        super.addHamburger1("chips", 275);
        super.addHamburger2("drink", 3.00);
    }

    @Override
    public void addHamburger1(String name, double price) {
        System.out.println("cannot add additional to deluxe burger");
    }

    @Override
    public void addHamburger2(String name, double price) {
        System.out.println("cannot add additional to deluxe burger");
    }

    @Override
    public void addHamburger3(String name, double price) {
        System.out.println("cannot add additional to deluxe burger");
    }

    @Override
    public void addHamburger4(String name, double price) {
        System.out.println("cannot add additional to deluxe burger");
    }
}
