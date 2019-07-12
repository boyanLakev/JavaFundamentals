import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {
    public static class Car {
        String model;
        String color;
        int horsePower;

        public Car(String model, String color, int horsePower) {
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public int getHorsePower() {
            return horsePower;
        }

        public String getColor() {
            return color;
        }

        public String getModel() {
            return model;
        }
    }

    public static class Truck {
        String model;
        String color;
        int horsePower;

        public Truck(String model, String color, int horsePower) {
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public int getHorsePower() {
            return horsePower;
        }

        public String getColor() {
            return color;
        }

        public String getModel() {
            return model;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();
        List<Truck> trucks = new ArrayList<>();
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("End")) {
                break;
            }
            String[] data = line.split("\\s+");
            String type = data[0];
            String model = data[1];
            String colot = data[2];
            int horsePower = Integer.parseInt(data[3]);
            if (type.equals("car")) {
                Car car = new Car(model, colot, horsePower);
                cars.add(car);
            } else {
                Truck truck = new Truck(model, colot, horsePower);
                trucks.add(truck);

            }


        }

        //catalog
        while (true) {
            String catalog = scanner.nextLine();
            if (catalog.equals("Close the Catalogue")) {
                break;
            }
            for (Car car:cars ) {
                if(catalog.equals(car.getModel())){
                    System.out.printf("Type: Car%n" +
                            "Model: %s%n" +
                            "Color: %s%n" +
                            "Horsepower: %d%n",
                            car.getModel(),
                            car.getColor(),
                            car.getHorsePower()
                    );
                }
            }
            for (Truck truck:trucks ) {
                if(catalog.equals(truck.getModel())){
                    System.out.printf("Type: Truck%n" +
                                    "Model: %s%n" +
                                    "Color: %s%n" +
                                    "Horsepower: %d%n",
                            truck.getModel(),
                            truck.getColor(),
                            truck.getHorsePower()
                    );
                }
            }


        }
        //avr
        double avrCar = calculateAvgHorsePower(cars);
        double avrTruck = calculateAvgTruckHorsePower(trucks);
        if (cars.size() == 0) {
            avrCar = 0;
        }
        if (trucks.size() == 0) {
            avrTruck = 0;
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", avrCar);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", avrTruck);
    }

    private static double calculateAvgTruckHorsePower(List<Truck> trucks) {
        int sum = 0;
        for (Truck truck : trucks) {
            sum += truck.getHorsePower();
        }
        double avr = ((sum * 1.0) / trucks.size());
        return avr;
    }

    private static double calculateAvgHorsePower(List<Car> cars) {
        int sum = 0;
        for (Car car : cars) {
            sum += car.getHorsePower();
        }
        double avr = ((sum * 1.0) / cars.size());
        return avr;
    }

}
