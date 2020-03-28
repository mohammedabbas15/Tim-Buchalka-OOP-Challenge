public class Hamburger
{
    private String name;
    private String rollType;
    private String meat;
    private double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String rollType, String meat, double price)
    {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
    }

    public void addHamburger1(String name, double price)
    {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburger2(String name, double price)
    {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburger3(String name, double price)
    {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburger4(String name, double price)
    {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger()
    {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " Hamburger on a " + this.rollType + " roll, price is: " + this.price);
        if (this.addition1Name != null)
        {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for " + this.addition1Price);
        }
        if (this.addition2Name != null)
        {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for " + this.addition2Price);
        }
        if (this.addition3Name != null)
        {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for " + this.addition3Price);
        }
        if (this.addition4Name != null)
        {
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for " + this.addition4Price);
        }
        return hamburgerPrice;
    }
}
