import transport.Bus;
import transport.Car;

import transport.Car.Key;

public class Main {
    public static void main(String[] args) {

        Key keyUnlimited = new Key ("Удаленный запуск двигателя", "Бесключевой доступ");
        Key remoteEngStart = new Key("Удаленный запуск двигателя", "");
        Key keylessAccess = new Key("", "Бесключевой доступ");

        Car car1 = new Car("Lada", "Granta","жёлтый", 2015, "Россия", 180);
        Car car2 = new Car("Audi","A8 50 L TDI quattro", "черный", 2020, "Германия", -250);
        Car car3 = new Car("BMW", "Z8", "черный", 2021, "Германия", 3700);
        Car car4 = new Car("УАЗ", "Патриот");

        Bus bus1 = new Bus("Нефаз", "5299-0000030-51");
        Bus bus2 = new Bus("ПАЗ", "1234", "жёлтый", 1999, " ", 3700, 30);
        Bus bus3 = new Bus("Камаз", "5299‑40‑57", "голубой", 2019, "Россия", 140, -15);

        Car.AddInfo car1info = new Car.AddInfo(1.7, "АКП", "седан", "A567AA102RUS", 5, "?");
        Car.AddInfo car4info = new Car.AddInfo(0, "", "", "ss", 100, "");

        car1.setAddInfo(car1info);
        car4.setAddInfo(car4info);

        car2.setKey(keyUnlimited);
        car3.setKey(remoteEngStart);
        car1.setKey(keylessAccess);
        car4.setKey(keyUnlimited);
        car4.setMaxSpeed(150);
        car4.getAddInfo().setEngineVolume(4);
        bus2.setPassengerPlaces(32);

        System.out.println(car3);
        car2.printKeyFunctions();
        System.out.println(car4);
        car4.printKeyFunctions();
        car1.printAddInfo();
        car4.printAddInfo();
        car2.printAddInfo();
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(car2.getMaximumSpeed());





//        Car car1 = new Car("Lada", "Granta", 1.7, "жёлтый", 2015, "Россия", "АКП", "sedan", "A567AA102RUS", 5);
//        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "АКП", "sedan", "A567AA102RUS", 5);
//        Car car3 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия","АКП", "sedan", "A567AA102RUS", 5);
//        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", "АКП", "sedan", "A567AA102RUS", 5);
//        Car car5 = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "АКП", "sedan", "A567AA102RUS", 5);
//        Car car6 = new Car("Pazik", " ", -2, "", -100, null, "", " ", "А111АА", 29);
//        Car car7 = new Car("Renault", "Logan");

    }
}