package Builder;

public class CarRepairBuilder {
    private double wheel;
    private double engine;
    private double gear;
    private double chair;

    CarRepairBuilder repair() {
        return new CarRepairBuilder();

    }

    CarRepairBuilder addWheel(double wheel) {
        this.wheel = wheel;
        return this;
    }

    CarRepairBuilder addEngine(double engine) {
        this.engine = engine;
        return this;
    }

    CarRepairBuilder addGear(double gear) {
        this.gear = gear;
        return this;
    }

    CarRepairBuilder addChair(double chair) {
        this.chair = chair;
        return this;
    }

    CarRepair build() {
        return new CarRepair(wheel, engine, gear, chair);
    }


}
