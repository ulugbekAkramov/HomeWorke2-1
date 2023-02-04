public class AutomobileTransport extends Transport {
    private String model;
    private double FuelConsumption;

    public AutomobileTransport(String name, int year, double volume, Color color,  double fuelConsumption,String model) {
        super(name, year, volume, color);
        this.model = model;
        this.FuelConsumption = fuelConsumption;
    }






    public String getModel() {
        return model;
    }

    public double getFuelConsumption() {
        return FuelConsumption;
    }

    public void drive() {
        System.out.println(getName() + "Драйвит");
    }

    public void drive(String stopped) {
        System.out.println(getName() + "Тормозит");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nModel: " + model +
                "\n fuelConsumption: " + getFuelConsumption();
    }
}
