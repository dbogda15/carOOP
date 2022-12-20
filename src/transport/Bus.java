package transport;

import java.util.Objects;

public class Bus extends Transport {

    private Integer passengerPlaces = null;

    public Bus(String brand, String model) {
        super(brand, model);
        if (maximumSpeed > 160) {
            this.maximumSpeed = 160;
        }

        if (passengerPlaces == null ) {
            this.passengerPlaces = 10;
        }

    }

    public Bus(String brand, String model, String color, int year, String country, int maximumSpeed, int passengerPlaces) {
        super(brand, model, year, country, color, maximumSpeed);

        this.maximumSpeed = Math.min(maximumSpeed, 160);

        if (passengerPlaces < 9 || passengerPlaces > 100) {
            this.passengerPlaces = 10;
        } else {
            this.passengerPlaces = passengerPlaces;
        }

    }

        public int getPassengerPlaces () {
            return passengerPlaces;
        }

        public void setPassengerPlaces ( int passengerPlaces){
            this.passengerPlaces = passengerPlaces;
        }

        @Override
        public String toString () {
            return "\n" + getBrand() + " " + getModel() + ", " + getYear() + " года выпуска, страна сборки: " + getCountry() + ", цвет кузова: "
                    + getColor() + ". Максимальная скорость: " + getMaximumSpeed() + " км/ч." + " Вместительность автобуса: " + getPassengerPlaces();
        }
    }

