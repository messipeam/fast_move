
import base.Bike;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author praisan
 */
public class FastMoveConsoleApplication {

    public Bike createBike(String licensePlate, int engineCapacity) {
//       Bike bike = new Bike(licensePlate, cc);
//       return bike;
        return new Bike(licensePlate, engineCapacity);
    }

}
