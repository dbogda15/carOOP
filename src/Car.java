import java.util.Objects;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    // я подразумеваю, что цвет авто и объём двигателя в целом когда-то можно будет поменять)))
    int year;
    String country;

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

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {

        if (Objects.isNull(brand) || Objects.equals(brand, "") || Objects.equals(brand, " ")){
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (Objects.isNull(model) || Objects.equals(model, "") || Objects.equals(model, " ")){
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume <=0 ) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (Objects.isNull(color) || Objects.equals(color, "") || Objects.equals(color, " ")) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (year <= 0 ) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (Objects.isNull(country) || Objects.equals(country, "") || Objects.equals(country, " ")) {
            this.country = "default";
        } else {
            this.country = country;
        }
    }
}

