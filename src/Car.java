public class Car {
    final String brand;
    final String model;
    double engineVolume;
    String color;
    // я подразумеваю, что цвет авто и объём двигателя в целом когда-то можно будет поменять)))
    final int year;
    final String country;

    public Car (String brand, String model, double engineVolume, String color, int year, String country) {
    this.brand = brand;
    this.model = model;
    this.engineVolume = engineVolume;
    this.color = color;
    this.year = year;
    this.country = country;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + year + " года выпуска, страна сборки: " + country + ", цвет кузова: " + color + ", объём двигателя -  " + engineVolume + " л.";
    }
}
