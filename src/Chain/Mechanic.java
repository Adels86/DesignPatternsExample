package Chain;


import Chain.Cars.Vehicle;



public abstract class Mechanic {
    protected Mechanic next;

    public Mechanic(Mechanic next) {
        this.next = next;
    }

    public abstract void handle(Vehicle vehicle);

}
