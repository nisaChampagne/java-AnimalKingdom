package animalkingdom;

public class Mammals extends AbstractAnimal
{
    ///constructor
    public Mammals(String name, int yearNamed)
    {
        super(name, yearNamed);
    }

    @Override
    public String move()
    {
        return "walk";
    }

    @Override
    public String breath()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "live birth";
    }
}