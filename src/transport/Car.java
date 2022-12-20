package transport;

import java.time.LocalDate;
import java.util.Objects;

public class Car extends Transport {

    private Key key;
    private AddInfo addInfo;

    public Car (String brand, String model) {
        super(brand, model);
    }

    public Car(String brand, String model, String color, int year, String country, int maximumSpeed) {

        super(brand, model, year, country, color, maximumSpeed);
    }

    public static class AddInfo {
        private double engineVolume;
        private String transmission;
        private final String bodyType;
        private String registrationNumber;
        private final int capacity;
        private final String tiresType;

        public AddInfo(double engineVolume, String transmission, String bodyType, String registrationNumber, int capacity, String tiresType) {

            if (engineVolume <= 0) {
                this.engineVolume = 1.5;
            } else {
                this.engineVolume = engineVolume;
            }

            if (Objects.isNull(transmission) || transmission.isBlank()) {
                this.transmission = "нет данных";
            } else {
                this.transmission = transmission;
            }

            if (Objects.isNull(bodyType) || bodyType.isBlank()) {
                this.bodyType = "нет данных";
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

            if (month >= 4 && month <= 10) {
                this.tiresType = "летние";
            } else {
                this.tiresType = "зимние";
            }
        }

            public double getEngineVolume () {
                return engineVolume;
            }

            public void setEngineVolume ( double engineVolume){
                this.engineVolume = engineVolume;
            }

            public String getTransmission () {
                return transmission;
            }

            public void setTransmission (String transmission){
                this.transmission = transmission;
            }

            public String getRegistrationNumber () {
                return registrationNumber;
            }

            public void setRegistrationNumber (String registrationNumber){
                this.registrationNumber = registrationNumber;
            }


            public String getBodyType () {
                return bodyType;
            }

            public int getCapacity () {
                return capacity;
            }

            public String getTiresType () {
                return tiresType;
            }

    }

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

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setAddInfo(AddInfo addInfo) {
        this.addInfo = addInfo;
    }

    public AddInfo getAddInfo() {
        return addInfo;
    }


    public void printAddInfo() {
        if (Objects.isNull(getAddInfo())) {
            System.out.println("\nУ автомобиля " + getBrand() + " " + getModel() + " нет дополнительной информации");
        } else {
            System.out.println("\nДополнительная информация по машине " + getBrand() + " " + getModel() + ": объём двигателя -  " + getAddInfo().getEngineVolume() + " л." + " Необходимо установить следующие шины: " + getAddInfo().tiresType + ".\n"
                    + "Тип кузова: " + getAddInfo().bodyType + ", тип трансмиссии: " + getAddInfo().getTransmission() + ", кол-во мест: " + getAddInfo().capacity + ", регистрационный номер: " + getAddInfo().getRegistrationNumber());
        }
    }

    public void printKeyFunctions () {
        if (!Objects.isNull(getKey())) {
            System.out.println("\nУ машины " + getBrand() + " " + getModel() + " есть возможности: " + getKey().getKeylessAccess() + " " + getKey().getRemoteEngineStart());
        } else {
            System.out.println("\nУ машины " + getBrand() + " " + getModel() + " нет данных по функционалу ключа");
        }
    }
}

