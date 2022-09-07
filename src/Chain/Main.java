package Chain;

import Chain.Cars.*;

public class Main {
    public static void main(String[] args) {
        ProffesionalCarMechanic pro = new ProffesionalCarMechanic(null);
        SimpleCarMechanic simpleCarMechanic = new SimpleCarMechanic(pro);
        Vehicle simpleCar = new ExpensiveCar(6,false,true,true,true);

        simpleCarMechanic.handle(simpleCar);

    }



}
