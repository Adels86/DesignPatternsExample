package Composite;

import java.util.Arrays;

public class CompositeElements implements CarElement {
    CarElement[] elements;

    public CompositeElements(CarElement... elements) {
        this.elements = elements;
    }

    @Override
    public double getCost() {
        return Arrays.stream(elements)
                .mapToDouble(CarElement::getCost)
                .sum();
    }
}
