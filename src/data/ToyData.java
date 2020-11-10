package data;

import base.Bike;
import base.Parcel;
import base.Person;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        bikes[0] = new Bike("A001",10);
        bikes[1] = new Bike("A002",15);
        bikes[2] = new Bike("A003",20);
        return bikes;
    }

    public static Person[] getPerson() {
         
        return person;
  
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
        // your code

        return parcels;
    }

    //testing
    public static void main(String[] args) {
        printBike();
       // printPerson();
       // printParcels();
    }

    private static void printBike() {
        Bike[] bikes = getBikes();
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].toString());
        }
    }

    private static void printPerson() {
        Person[] person = getPerson();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

    private static void printParcels() {
        Parcel[] percels = getParcels();
        for (int i = 0; i < percels.length; i++) {
            System.out.println(percels[i].toString());
        }
    }

}
