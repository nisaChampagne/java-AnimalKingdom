package animalkingdom;

import java.util.*;

public class Main {
    {
        public static void main(String[] args)       
        {
            //ArrayList to make kingdomList so I can add animals
            ArrayList<AbstractAnimal> kingdomList= new ArrayList<AbstractAnimal>();

            //mammals
            kingdomList.add(new Mammals("Panda", 1869));
            kingdomList.add(new Mammals("Zebra", 1778));
            kingdomList.add(new Mammals("Koala", 1816));
            kingdomList.add(new Mammals("Sloth", 1804));
            kingdomList.add(new Mammals("Armadillo", 1758));
            kingdomList.add(new Mammals("Raccoon", 1758));
            kingdomList.add(new Mammals("Bigfoot", 2021));


            ///Birds
            kingdomList.add(new Birds("Pigeon", 1837));
            kingdomList.add(new Birds("Peacock", 1821));
            kingdomList.add(new Birds("Toucan", 1758));
            kingdomList.add(new Birds("Parrot", 1824));
            kingdomList.add(new Birds("SWan", 1758));

            ///Fish
            kingdomList.add(new Fish("Salmon", 1758));
            kingdomList.add(new Fish("Catfish", 1817));
            kingdomList.add(new Fish("Perch", 1758));


        }
    }
}