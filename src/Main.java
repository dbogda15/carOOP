import transport.Car;

import transport.Car.Key;

public class Main {
    public static void main(String[] args) {

        Key keyUnlimited = new Key ("Удаленный запуск двигателя", "Бесключевой доступ");
        Key remoteEngStart = new Key("Удаленный запуск двигателя", "");
        Key keylessAccess = new Key("", "Бесключевой доступ");

        Car car1 = new Car("Lada", "Granta", 1.7, "жёлтый", 2015, "Россия", "АКП", "sedan", "A567AA102RUS", 5);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "АКП", "sedan", "A567AA102RUS", 5);
        Car car3 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия","АКП", "sedan", "A567AA102RUS", 5);
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", "АКП", "sedan", "A567AA102RUS", 5);
        Car car5 = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "АКП", "sedan", "A567AA102RUS", 5);
        Car car6 = new Car("Pazik", " ", -2, "", -100, null, "", " ", "А111АА", 29);
        Car car7 = new Car("Renault", "Logan");

        car2.setKey(keyUnlimited);
        car3.setKey(remoteEngStart);
        car5.setKey(keylessAccess);
        car2.setColor("голубой");
        car3.setTransmission("automatic transmission");
        car4.setEngineVolume(3.01);
        car5.setRegistrationNumber("A101AAARUS102");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        System.out.println(car6);
        System.out.println(car7);

        car5.printKeyFunctions();
        car1.printKeyFunctions();
        car2.printKeyFunctions();
        car3.printKeyFunctions();


    }
}