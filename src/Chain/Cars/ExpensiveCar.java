package Chain.Cars;

public class ExpensiveCar implements Vehicle{

    private int diffyculty = 4;
    boolean isEngineBroken;
    boolean isWheelBroken;
    boolean isGearBroken;
    boolean isChairBroken;

    public ExpensiveCar(int diffyculty, boolean isEngineBroken, boolean isWheelBroken, boolean isGearBroken, boolean isChairBroken) {
        this.diffyculty = diffyculty;
        this.isEngineBroken = isEngineBroken;
        this.isWheelBroken = isWheelBroken;
        this.isGearBroken = isGearBroken;
        this.isChairBroken = isChairBroken;
    }

    @Override
    public int getDifficulty() {
        return diffyculty;
    }

    @Override
    public boolean isEngineBroken() {
        return isEngineBroken;
    }

    @Override
    public boolean isWheelBroken() {
        return isWheelBroken;
    }

    @Override
    public boolean isGearBroken() {
        return isGearBroken;
    }

    @Override
    public boolean isChairBroken() {
        return isChairBroken;
    }
}
