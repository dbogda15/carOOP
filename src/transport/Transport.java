package transport;

import java.util.Objects;

public abstract class Transport {

    public final String brand;
    public final String model;
    public final int year;
    public final String country;
    public String color;
    public int maximumSpeed;

    public Transport(String brand, String model) {
        this (brand, model, 2000, "нет данных", "белый", 200);
    }

    public Transport(String brand, String model, int year, String country, String color, int maximumSpeed) {

        if (Objects.isNull(brand) || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (Objects.isNull(model) || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }


        if (Objects.isNull(color) || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (Objects.isNull(country) || country.isBlank()) {
            this.country = "default";
        } else {
            this.country = country;
        }

        if (maximumSpeed <= 0) {
            this.maximumSpeed = Math.abs(maximumSpeed);
        } else if (maximumSpeed > 3600) {
            this.maximumSpeed = 190;
            // System.out.println("\nМаксимальная скорость истребителя 3600 км/ч, если в пакет Транспорт добавили что-то быстрее него - исправь условия!" + "\nОшибка в " + getClass() + ", автомобиль " + getBrand() + " " + getModel());
        } else {
            this.maximumSpeed = maximumSpeed;
        }
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaxSpeed(int maximumSpeed) {
       this.maximumSpeed = maximumSpeed;
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", " + getYear() + " года выпуска, страна сборки: " + getCountry() + ", цвет кузова: "
                + getColor() + ". Максимальная скорость: " + getMaximumSpeed() + " км/ч.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return year == transport.year && maximumSpeed == transport.maximumSpeed && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(country, transport.country) && Objects.equals(color, transport.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, country, color, maximumSpeed);
    }
}
