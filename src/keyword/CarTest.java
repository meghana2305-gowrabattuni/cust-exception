package keyword;
class CarStopped extends Exception {
    public CarStopped(String message) {
        super(message);
    }
}

class CarPuncture extends Exception {
    public CarPuncture(String message) {
        super(message);
    }
}

class CarHeat extends Exception {
    public CarHeat(String message) {
        super(message);
    }
}

public class CarTest {

    public static void Stop(String status) throws CarStopped {
        if (status.equalsIgnoreCase("stop")) {
            throw new CarStopped("Carstopped: Car is stopped");
        } else {
            System.out.println("Car not stalled");
        }
    }

    public static void puncture(String status) throws CarPuncture {
        if (status.equalsIgnoreCase("puncture")) {
            throw new CarPuncture("CarPuncture: Car is Punctured");
        } else {
            System.out.println("Car not punctured");
        }
    }

    public static void carHeat(int temp) throws CarHeat {
        if (temp > 50) {
            throw new CarHeat("Car is heated more than 50 degrees");
        } else {
            System.out.println("Car not stalled");
        }
    }

    public static void main(String[] args) {
        try {
            Stop("stop");
        } catch (CarStopped e) {
            System.out.println(e.getMessage());
        }

        try {
            puncture("puncture");
        } catch (CarPuncture e) {
            System.out.println(e.getMessage());
        }
    }
}

