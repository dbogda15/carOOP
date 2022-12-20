package transport;

import java.time.LocalDate;
import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int capacity;
    private final String tiresType;
    private Key key;

    public static class Key {
        private String remoteEngineStart;
        private String keylessAccess;

        public Key (String remoteEngineStart, String keylessAccess) {

            if (Objects.isNull(remoteEngineStart) || remoteEngineStart.isBlank()) {
                this.remoteEngineStart = "";
            } else {
                this.remoteEngineStart = remoteEngineStart;
            }

            if (Objects.isNull(keylessAccess) || keylessAccess.isBlank()) {
                this.keylessAccess = "";
            } else {
                this.keylessAccess = keylessAccess;
            }
        }

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public void setRemoteEngineStart(String remoteEngineStart) {
            this.remoteEngineStart = remoteEngineStart;
        }

        public String getKeylessAccess() {
            return keylessAccess;
        }

        public void setKeylessAccess(String keylessAccess) {
            this.keylessAccess = keylessAccess;
        }
    }

    public Car (String brand, String model) {
        this(brand, model, 1.5, "белый", 2000, null, null, null, null, 5);
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission,
               String bodyType, String registrationNumber, int capacity) {

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

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
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

        if(Objects.isNull(transmission) || transmission.isBlank()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }

        if (Objects.isNull(bodyType) || bodyType.isBlank()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }

        if (Objects.isNull(registrationNumber) || registrationNumber.isBlank() || registrationNumber.length() <= 12) {
            this.registrationNumber = "Внимание! Проверьте правильность написания регистрационного номера!";
        } else {
            this.registrationNumber = registrationNumber;
        }

        if (capacity <= 0) {
            this.capacity = 5;
        } else {
            this.capacity = capacity;
        }
        int month = LocalDate.now().getMonthValue();
        if (month >= 4 && month <= 10 ) {
            this.tiresType = "летние";
        } else {
            this.tiresType = "зимние";
        }
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

    public void setEngineVolume(double engineVolume) {
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

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }


    public String getBodyType() {
        return bodyType;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getTiresType() {
        return tiresType;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + year + " года выпуска, страна сборки: " + country + ", цвет кузова: "
                + getColor() + ", объём двигателя -  " + getEngineVolume() + " л." + " Необходимо установить следующие шины: " + tiresType + "\n"
                + "тип кузова: " + bodyType + ", тип трансмиссии: " + getTransmission() + ", кол-во мест: " + capacity + ", регистрационный номер: " + getRegistrationNumber()
                + "\n______________";
    }

    public void printKeyFunctions () {
        if (!Objects.isNull(getKey())) {
            System.out.println("У машины " + getBrand() + " " + getModel() + " есть возможности: " + getKey().getKeylessAccess() + " " + getKey().getRemoteEngineStart());
        } else {
            System.out.println("У машины " + getBrand() + " " + getModel() + " нет данных по функционалу ключа");
        }
    }
}

