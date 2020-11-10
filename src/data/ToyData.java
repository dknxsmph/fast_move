package data;

import base.Bike;
import base.Parcel;
import base.ParcelStatus;
import base.Person;
import base.Location;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        // your code

        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];
        // your code

        return person;
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
        // your code
        parcels[0] = new Parcel(5, ParcelStatus.SHIPPING, new Location(50.0, 150.1));
        parcels[1] = new Parcel(10, ParcelStatus.SHIPPING, new Location(60.0, 250.1));
        parcels[2] = new Parcel(15, ParcelStatus.SHIPPING, new Location(70.0, 155.1));
        parcels[3] = new Parcel(20, ParcelStatus.SHIPPING, new Location(80.0, 50.5));
        parcels[4] = new Parcel(25, ParcelStatus.SHIPPING, new Location(90.0, 50.8));
        parcels[5] = new Parcel(30, ParcelStatus.SHIPPING, new Location(100.0, 88.1));
        parcels[6] = new Parcel(35, ParcelStatus.SHIPPING, new Location(110.0, 13.6));
        parcels[7] = new Parcel(40, ParcelStatus.SHIPPING, new Location(120.0, 20.20));
        parcels[8] = new Parcel(45, ParcelStatus.SHIPPING, new Location(130.0, 18.1));
        parcels[9] = new Parcel(50, ParcelStatus.SHIPPING, new Location(140.0, 90.1));    

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
