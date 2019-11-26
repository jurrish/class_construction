package bicycle;

import org.w3c.dom.ls.LSOutput;

public class BikeDriver
{
    public static void main(String[] args)
    {
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle("Green", 10,10);

        System.out.println(bike1);
        System.out.println(bike2);
    }
}
