final class AirTransport extends AutomobileTransport {
    private int weight;
    private Salon salon;

    public AirTransport(String name, int year, double volume, Color color, double fuelConsumption, String model, int weight, Salon salon) {
        super(name, year, volume, color, fuelConsumption, model);
        this.weight = weight;
        this.salon = salon;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nWeight: " +
                getWeight() + "\nseatCount:" +
                salon.getSeatCount() +
                "\nMaterial:" + salon.getMaterial()+
                "\nIsClimateControl" + salon.isClimateControl();
    }
}
