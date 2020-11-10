package data;

import base.Bike;
import base.Parcel;
import base.ParcelStatus;
import base.Person;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        // your code
        for (int i = 0; i < bikes.length; i++) {
            bikes[i] = new Bike("ff",1);
        }

        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];
        // your code
        for (int i = 0; i < person.length; i++) {
            person[i] = new Person("ff","aa");
        }
        return person;
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
        // your code
        for (int i = 0; i < parcels.length; i++) {
            parcels[i] = new Parcel(1.00,ParcelStatus.DELIVERED);
        }
        // hrllo eotlf
        return parcels;
    }

    //testing
    public static void main(String[] args) {
        printBike();
        printPerson();
        printParcels();

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
