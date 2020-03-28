public class Main
{
    public static void main(String [] args)
    {
        Hamburger hamburger = new Hamburger("Bobs", "wheat", "beef", 5.50);
        hamburger.addHamburger1("lettuce", 1);
        hamburger.addHamburger2("tomato", 1);
        hamburger.addHamburger3("cheese",1.50);
        hamburger.addHamburger4("onions", 1);
        System.out.println(hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("salmon", 5.00);
        healthyBurger.addHealthAddition1("spinach", 2.50);
        healthyBurger.addHealthAddition2("olives", 2.75);
        System.out.println(healthyBurger.itemizeHamburger());

    }
}
