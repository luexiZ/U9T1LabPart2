public class Tablet extends Computer
{

    private boolean stylusIncluded;

    public Tablet(int screenSize, int memory, boolean stylusIncluded)
    {
        super(screenSize, memory);
        this.stylusIncluded = stylusIncluded;
    }


}

