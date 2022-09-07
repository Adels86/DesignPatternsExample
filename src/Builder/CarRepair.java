package Builder;

public class CarRepair {
    private double wheel;
    private double engine;
    private double gear;
    private double chair;

    public CarRepair(double wheel, double engine, double gear, double chair) {
        this.wheel = wheel;
        this.engine = engine;
        this.gear = gear;
        this.chair = chair;
    }

    public double repairCost(){
        return wheel + engine + gear + chair;
    }




}
