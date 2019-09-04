package animalkingdom;

import java.util.ArrayList;

public class Main 
{
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
        ArrayList<AbstractAnimal> kingdom = new ArrayList<AbstractAnimal>();

        //Mammals
        kingdom.add(new Mammals("Panda", 1869));
        kingdom.add(new Mammals("Zebra", 1778));
        kingdom.add(new Mammals("Koala", 1816));
        kingdom.add(new Mammals("Sloth", 1804));
        kingdom.add(new Mammals("Armadillo", 1758));
        kingdom.add(new Mammals("Raccoon", 1758));
        kingdom.add(new Mammals("Bigfoot", 2021));

        //Birds
        kingdom.add(new Birds("Pigeon", 1837));
        kingdom.add(new Birds("Peacock", 1821));
        kingdom.add(new Birds("Toucan", 1758));
        kingdom.add(new Birds("Parrot", 1824));
        kingdom.add(new Birds("Swan", 1758));

        //Fish
        kingdom.add(new Fish("Salmon", 1758));
        kingdom.add(new Fish("Catfish", 1817));
        kingdom.add(new Fish("Perch", 1758));

        //Lambda Functions

        //1.
        System.out.println();
        System.out.println("Printing animals by discovery year");
        kingdom.sort((a1, a2) -> a1.getYearNamed() - a2.getYearNamed());
        kingdom.forEach(animal -> System.out.println(animal.getName() + ": " + animal.getYearNamed()));

        //2.
        System.out.println();
        System.out.println("Printing Animals Alphabetically");
        kingdom.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        kingdom.forEach(animal -> System.out.println(animal.getName()));

        //3.
        System.out.println();
        System.out.println("Printing Animals by how they move");
        kingdom.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        kingdom.forEach(animal -> System.out.println(animal.getName() + ": " + animal.move()));

        //4.
        System.out.println();
        System.out.println("Printing Animals that breathe with lungs");
        printAnimals(kingdom, a -> a.breath() == "lungs");

        //.5
        System.out.println();
        System.out.println("Printing Animals that breathe with lungs & named in 1758");
        printAnimals(kingdom, animal -> animal.breath().equals("lungs") && animal.getYearNamed() == 1758);

        //6.
        System.out.println();
        System.out.println("Printing Animals that lay eggs and breathe with lungs");
        printAnimals(kingdom, animal -> animal.breath().equals("lungs") && animal.reproduce().equals("eggs"));

        //.7
        System.out.println();
        System.out.println("Printing Animals that were named in 1758 alphabetically.");
        kingdom.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(kingdom, animal -> animal.getYearNamed() ==1758);
    }

}
