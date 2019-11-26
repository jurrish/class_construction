package writing_utensils;

public class Program
{
    public static void main(String[] args)
    {
        //instantiate a new pencil object
        Pencil myPencil = new Pencil("mechanical", "gray", true, 0.7);

        myPencil.size = 0.5;
        System.out.println(myPencil.color.toUpperCase());

        Pencil pencil = new Pencil();
        System.out.println(pencil);
    }
}
