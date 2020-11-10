/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praisan
 */
import base.Bike;
import base.Location;
import base.Parcel;
import base.Person;
public class FastMoveConsoleApplication {
                            
                            String menu = "1.Add bikes"
                                                    + "2.Add Person"
                                                    +"3.Add Parcel"
                                                    +"4.Exit...";
                                                    
                            
                           public Bike getBikes(String licensePlate,int engineCapacity){
                                        return new Bike(licensePlate,engineCapacity);
                           }
                           public Person getPerson(String firstname, String lastname){
                                         return new Person(firstname,lastname);
                           }
                           
                           
                
                          /* public Parcel addParcel(double weight, ParcelStatus status, Location location){
                                          return new Parcel(double weight, ParcelStatus status, Location location);
                           }*/
}
