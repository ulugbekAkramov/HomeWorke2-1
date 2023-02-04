public class Salon {
    private int seatCount;
    private String material;
    private boolean isClimateControl;

    public Salon(int seatCount, String material, boolean isClimateControl) {
        this.seatCount = seatCount;
        this.material = material;
        this.isClimateControl = isClimateControl;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isClimateControl() {
        return isClimateControl;
    }
}
