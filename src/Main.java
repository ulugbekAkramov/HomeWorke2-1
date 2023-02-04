public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        AutomobileTransport automobileTransport = new AutomobileTransport("Toyota", 2005, 3.5, Color.BLACK,
                2.5, "Sienta");


        AirTransport airTransport = new AirTransport("Bayraktar", 2022, 8.8, Color.BROWN, 5.5, "TB2",
                1000, new Salon(100, "Koja", true));


        AirTransport airTransport1 = new AirTransport("Boing", 2010, 9.9,
                Color.BLACK, 5.7, "Пасажирский", 5000, new Salon(150, "Velyur", false));

        System.out.println(airTransport1.getInfo());

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println(airTransport.getInfo());
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println(automobileTransport.getInfo());

    }
}