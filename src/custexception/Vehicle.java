package custexception;
class InvalidAgeOfVehicleException extends Exception {
    public InvalidAgeOfVehicleException(String message) {
        super(message);
    }
}

class InvalidAgeOfTireException extends Exception {
    public InvalidAgeOfTireException(String message) {
        super(message);
    }
}

class InvalidAgeOfEngineException extends Exception {
    public InvalidAgeOfEngineException(String message) {
        super(message);
    }
}

public class Vehicle {

    public void checkage(int ageOfVehicle, int ageOfTire, int ageOfEngine) 
            throws InvalidAgeOfVehicleException, InvalidAgeOfTireException, InvalidAgeOfEngineException {
        
        if (ageOfVehicle > 10) {
            throw new InvalidAgeOfVehicleException("greater than 10 years vehicles are not allowed.");
        }
        if (ageOfTire > 2) {
            throw new InvalidAgeOfTireException("greater than 2 years tires are not allowed.");
        }
        if (ageOfEngine > 15) {
            throw new InvalidAgeOfEngineException("greater than 15 years engines are not allowed.");
        }
        
        System.out.println("Vehicle age parameters are valid.");
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        try {
            vehicle.checkage(5, 1, 10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            vehicle.checkage(12, 1, 10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            vehicle.checkage(5, 4, 10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            vehicle.checkage(5, 1, 20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
