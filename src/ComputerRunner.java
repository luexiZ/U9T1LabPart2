public class ComputerRunner {
    public static void main(String[] args)
    {
        // ----------- TEST CODE! ------------
        // Uncomment when you are ready to test

        Computer computer1 = new Computer(12, 256);
        System.out.println(computer1 instanceof Computer);
        Desktop desktop1 = new Desktop(18, 512, true);
        System.out.println(desktop1 instanceof Desktop);
        Laptop laptop1 = new Laptop(14, 128);
        System.out.println(laptop1 instanceof Laptop);
        Tablet tablet1 = new Tablet(9, 64, false);
        System.out.println(tablet1 instanceof Tablet);

        System.out.println(desktop1 instanceof Computer);
        System.out.println(laptop1 instanceof Computer);
        System.out.println(tablet1 instanceof Computer);

        System.out.println(computer1 instanceof Desktop);
        System.out.println(computer1 instanceof Laptop);
        System.out.println(computer1 instanceof Tablet);


    }
}
