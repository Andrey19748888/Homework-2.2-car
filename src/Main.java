import transport.Car;

public class Main {
    public static void main(String[] args) {

        Car granta = new Car("Lada","Granta",2015,"Россия","желтый",1.7);
        granta.setTransmission("автомат");
        System.out.println( "Марка автомобиля " + granta.getBrand() +
                ", модель " + granta.getModel() +
                ", год выпуска " + granta.getYear() +
                ", сборка в " + granta.getCountry() +
                ", цвет " + granta.color +
                ", обьем двигателя " + granta.engineVolume + " литра " +
                ", коробка передач " + granta.transmission +
                ", тип кузова " + granta.getTypeOfCar() +
                ", номер автомобиля " + granta.carNumber +
                ", колличество мест " + granta.getSeatsCount() +
                ", тип шин: " + (granta.isSummerTyres() ? "летняя" : "зимняя") + " резина");


        Car audi = new Car("Audi","A8 50 L TDI quattro",2020,"Германии","черный",3.0);
        audi.setSummerTyres(false);
        System.out.println( "Марка автомобиля " + audi.getBrand() +
                ", модель " + audi.getModel() +
                ", год выпуска " + audi.getYear() +
                ", сборка в " + audi.getCountry() +
                ", цвет " + audi.color +
                ", обьем двигателя " + audi.engineVolume + " литра " +
                ", коробка передач " + audi.transmission +
                ", тип кузова " + audi.getTypeOfCar() +
                ", номер автомобиля " + audi.carNumber +
                ", колличество мест " + audi.getSeatsCount() +
                ", тип шин: " + (audi.isSummerTyres() ? "летняя" : "зимняя") + " резина");


        Car bmw = new Car("BMW","Z8",2021,"Германии","черный",3.0);

        System.out.println( "Марка автомобиля " + bmw.getBrand() +
                ", модель " + bmw.getModel() +
                ", год выпуска " + bmw.getYear() +
                ", сборка в " + bmw.getCountry() +
                ", цвет " + bmw.color +
                ", обьем двигателя " + bmw.engineVolume + " литра " +
                ", коробка передач " + audi.transmission +
                ", тип кузова " + audi.getTypeOfCar() +
                ", номер автомобиля " + audi.carNumber +
                ", колличество мест " + audi.getSeatsCount() +
                ", тип шин: " + (bmw.isSummerTyres() ? "летняя" : "зимняя") + " резина");


        Car kia = new Car("Kia","Sportage 4-го поколения",2018,"Южной Корее","красный",2.4);

        System.out.println( "Марка автомобиля " + kia.getBrand() +
                ", модель " + kia.getModel() +
                ", год выпуска " + kia.getYear() +
                ", сборка в " + kia.getCountry() +
                ", цвет " + kia.color +
                ", обьем двигателя " + kia.engineVolume + " литра " +
                ", коробка передач " + kia.transmission +
                ", тип кузова " + kia.getTypeOfCar() +
                ", номер автомобиля " + kia.carNumber +
                ", колличество мест " + kia.getSeatsCount() +
                ", тип шин: " + (kia.isSummerTyres() ? "летняя" : "зимняя") + " резина");


        Car hyndai = new Car("Hyundai","Avante",2016,"Южной Корее","оранжевый",1.6);

        System.out.println( "Марка автомобиля " + hyndai.getBrand() +
                ", модель " + hyndai.getModel() +
                ", год выпуска " + hyndai.getYear() +
                ", сборка в " + hyndai.getCountry() +
                ", цвет " + hyndai.color +
                ", обьем двигателя " + hyndai.engineVolume + " литра " +
                ", коробка передач " + hyndai.transmission +
                ", тип кузова " + hyndai.getTypeOfCar() +
                ", номер автомобиля " + hyndai.carNumber +
                ", колличество мест " + hyndai.getSeatsCount() +
                ", тип шин: " + (hyndai.isSummerTyres() ? "летняя" : "зимняя") + " резина");
        hyndai.setCarNumber("r667j434");
        System.out.println("номер: " + hyndai.isCorrectCarNumber());


    }
}