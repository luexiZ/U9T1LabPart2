public class Computer {
    private int screenSize; // in inches
    private int memory; // in gigabytes (GB)


    public Computer(int screenSize, int memory){
        this.memory = memory;
        this.screenSize = screenSize;
    }

    public int getMemory(){
        return memory;
    }
    public int getScreenSize(){
        return screenSize;
    }

    public void installOperatingSystem()
    {
        System.out.println("installing OS...");
    }
}
