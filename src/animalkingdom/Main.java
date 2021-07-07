package animalkingdom;

import java.util.ArrayList;

interface CheckAnimals
{
    boolean test (AbstractAnimal a);
}

public class Main 
{

    ////for 
    public static void printAnimals(ArrayList<AbstractAnimal> animal, CheckAnimals tester)
    {
        for (AbstractAnimal a : animal)
        {
            if (tester.test(a))
            {
                System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getYearNamed());
            }
        }
    }
    public static void main(String[] args)
    {

        ///making my arraylist so I can add animals where needed
        ArrayList<AbstractAnimal> kingdom = new ArrayList<AbstractAnimal>();

        //adding Mammals
        kingdom.add(new Mammals("Panda", 1869));
        kingdom.add(new Mammals("Zebra", 1778));
        kingdom.add(new Mammals("Koala", 1816));
        kingdom.add(new Mammals("Sloth", 1804));
        kingdom.add(new Mammals("Armadillo", 1758));
        kingdom.add(new Mammals("Raccoon", 1758));
        kingdom.add(new Mammals("Bigfoot", 2021));

        //adding Birds
        kingdom.add(new Birds("Pigeon", 1837));
        kingdom.add(new Birds("Peacock", 1821));
        kingdom.add(new Birds("Toucan", 1758));
        kingdom.add(new Birds("Parrot", 1824));
        kingdom.add(new Birds("Swan", 1758));

        //adding Fish
        kingdom.add(new Fish("Salmon", 1758));
        kingdom.add(new Fish("Catfish", 1817));
        kingdom.add(new Fish("Perch", 1758));

        //using lambda expressions


        ///descending order by year named 
        System.out.println();
        System.out.println("Printing animals by discovery year");
        kingdom.sort((a1, a2) -> a2.getYearNamed() - a1.getYearNamed());
        kingdom.forEach(animal -> System.out.println(animal.getName() + ": " + animal.getYearNamed()));


        //all animals alphabetically
        System.out.println();
        System.out.println("Printing Animals Alphabetically");
        kingdom.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        kingdom.forEach(animal -> System.out.println(animal.getName()));


        ///how sort by how they move
        System.out.println();
        System.out.println("Printing Animals by how they move");
        kingdom.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        kingdom.forEach(animal -> System.out.println(animal.getName() + ": " + animal.move()));


        ///only breath with lungs
        System.out.println();
        System.out.println("Printing Animals that breathe with lungs");
        printAnimals(kingdom, a -> a.breath() == "lungs");


        ///only breath with lungs and named in 1758
        System.out.println();
        System.out.println("Printing Animals that breathe with lungs & named in 1758");
        printAnimals(kingdom, animal -> animal.breath().equals("lungs") && animal.getYearNamed() == 1758);


        ///lay eggs and breath with lungs
        System.out.println();
        System.out.println("Printing Animals that lay eggs and breathe with lungs");
        printAnimals(kingdom, animal -> animal.breath().equals("lungs") && animal.reproduce().equals("eggs"));


        //alphabetically only animals named in 1758
        System.out.println();
        System.out.println("Printing Animals that were named in 1758 alphabetically.");
        kingdom.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(kingdom, animal -> animal.getYearNamed() ==1758);
    }

}
