package Chain;

import Chain.Cars.Vehicle;

public class ProffesionalCarMechanic extends Mechanic{

    public ProffesionalCarMechanic(Mechanic next) {
        super(next);
    }

    @Override
    public void handle(Vehicle vehicle) {
        if(vehicle.getDifficulty() > 4) {

            double engine = 0, wheel = 0, gear = 0, chair = 0;
            if (vehicle.isEngineBroken()){engine = 1500;}
            if (vehicle.isWheelBroken()){wheel = 500;}
            if (vehicle.isGearBroken()){gear = 1500;}
            if (vehicle.isChairBroken()){chair= 800;}
            System.out.println("car is repaired cost is: " + (engine += wheel += gear += chair));
        }
        else {
            System.out.println("it's to hard");
            next.handle(vehicle);
        }

    }


}
