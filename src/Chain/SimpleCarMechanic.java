package Chain;


import Chain.Cars.Vehicle;



public class SimpleCarMechanic extends Mechanic{

    public SimpleCarMechanic(Mechanic next) {
        super(next);
    }

    @Override
    public void handle(Vehicle vehicle) {
        if(vehicle.getDifficulty() <= 4) {

            double engine = 0, wheel = 0, gear = 0, chair = 0;
            if (vehicle.isEngineBroken()){engine = 1000;}
            if (vehicle.isWheelBroken()){wheel = 300;}
            if (vehicle.isGearBroken()){gear = 1000;}
            if (vehicle.isChairBroken()){chair= 500;}
            System.out.println(engine += wheel += gear += chair);
        }
        else {
            System.out.println("it's to hard");
            next.handle(vehicle);
        }

    }


}
