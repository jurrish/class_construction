package dogs;

public class Dog
{
    //fields
    public String name;
    public String breed;
    public boolean domesticated;
    public double weight;

    //parameterized constructor
    public Dog(String name, String breed,
               boolean domesticated, double weight)
    {
        this.name = name;
        this.breed = breed;
        this.domesticated = domesticated;
        this.weight = weight;
    }

    //default constructor(no params)
    public Dog()
    {
        name = "fluffy";
        breed = "boxer";
        domesticated = true;
        weight = 60;
    }


    //getters
    public String getName()
    {
        //we control how to return a value
        return name.toUpperCase();
    }

    public double getWeight()
    {
        return weight;
    }

    public String getBreed()
    {
        return breed;
    }

    public boolean isDomesticated()
    {
        return domesticated;
    }

    //setters
    public void setName(String newName)
    {
        if(newName != null && !newName.equals(""))
        {
            this.name = newName;
        }
    }

    public void setBreed(String newBreed)
    {
        if(newBreed != null && !newBreed.equals(""))
        this.breed = newBreed;
    }

    public void setDomesticated(boolean domesticated)
    {
        this.domesticated = domesticated;
    }

    public void setWeight(double weight)
    {
        if(weight > 0)
        {
            this.weight = weight;
        }
    }

    //methods


    public void makeNoise()
    {
        System.out.println("Rufff");
    }

    public void makeNoise(String noise)
    {
        System.out.println(noise);
    }

    public boolean isPopularBreed()
    {
        if(breed.equals("Pug") || breed.equals("Boxer"))
        {
            return true;
        }
        return false;
    }

//    public String toString()
//    {
//        return "Name: " + name;
//    }
}
