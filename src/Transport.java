public class Transport {
    private String name;
    private int year;
    private double volume;
    private Color color;

    public Transport(String name, int year, double volume, Color color) {
        this.name = name;
        this.year = year;
        this.volume = volume;
        this.color = color;
    }



    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getVolume() {
        return volume;
    }

    public Color getColor() {
        return color;
    }
    public String getInfo(){
        return "\nName: " + name +
                "\nYear: " + year +
                "\nVolume: " + volume +
                "\nColor: " + color;
    }
}
