package animalkingdom;

public abstract class AbstractAnimal
{
    int maxId = 0;
    int id;
    String name;
    int yearNamed;

    public AbstractAnimal(String name, int yearNamed)
    {
        maxId++;
        id=maxId;
        this.name = name;
        this.yearNamed = yearNamed;
    }

    public String consume()
    {
        return "Food";
    }

    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }

    public getYearNamed()
    {
        return yearNamed;
    }

    @Override
    public String toString()
    {
        return "Name: " + getName() + "Year Named: " +  getYearNamed() + "\n"; 
    }

    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();
}