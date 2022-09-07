package Composite;

public class Main {
    public static void main(String[] args) {
        CompositeElements compositeElements = new CompositeElements(new Engine(), new Gear(), new CompositeElements(new Chair(), new Wheel()));
        System.out.println(compositeElements.getCost());
    }
}
