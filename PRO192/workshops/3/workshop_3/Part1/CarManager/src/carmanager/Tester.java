
package carmanager;
import data.Car;

        
public class Tester {

    public static void main(String[] args) {
        Car c = new Car();
        c.pressStartButton();
        c.pressAcceleratorButton();
        c.output();
        
        Car c2 = new Car("RED", 100, true, true);
        c2.pressAcceleratorButton();
        c2.setColour("BLACK");
        System.out.println("Colour of c2:" + c2.getColour());
        c2.output();
    }

}
