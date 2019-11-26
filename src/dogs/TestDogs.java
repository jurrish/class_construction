package dogs;

public class TestDogs
{
    public static void main(String[] args)
    {
        //instantiate the Dog class
        Dog sparky = new Dog("Sparky", "Pug", true, 4.5);
        Dog beauregard = new Dog("Beauregard", "Golden Retriever", true, 30.5);

        //dot-notation accesses or changes field data
        System.out.println(beauregard.getName() + " jumps");

        sparky.breed = "puggle";

        System.out.println("Sparky is now a " + sparky.getBreed());

        sparky.makeNoise();
        sparky.makeNoise("MEOW");

        sparky.setWeight(-10);
        System.out.println(sparky.getWeight());
    }

}
