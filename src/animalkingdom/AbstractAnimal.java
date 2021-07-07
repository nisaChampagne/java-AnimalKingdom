package animalkingdom;

public abstract class AbstractAnimal
{
    ///blueprint for animal
    static int maxId = 0;
    private int id;
    private String name;
    private int yearNamed;

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
///getters
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }


    public int getYearNamed()
    {
        return yearNamed;
    }
//setters
    public void setYearNamed(int yearNamed)
    {
        this.yearNamed = yearNamed;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    ///override because they already exist

    @Override
    public String toString()
    {
        return "Name: " + getName() + "Year Named: " +  getYearNamed() + "\n"; 
    }

    //abstract methods
    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();
}