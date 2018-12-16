package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by nadimchouglay on 11/09/2017.
 */
public class application {
    public static void main(String[] args) {


        ArrayList<String> animals = new ArrayList<String>();
        animals.add("lion");
        animals.add("cat");
        animals.add("dog");
        animals.add("bird");
       // for (String value :animals){vbvvnm vfffff
         //   System.out.println(value);
        ArrayList<Vehicle> vehicles =new ArrayList<Vehicle>();
        vehicles.add(new Vehicle("Honda","accord",12000,false));
        Vehicle vehicle2=new Vehicle("Toyota","Camery",3444,false);
        vehicles.add(vehicle2);
        vehicles.add(new Vehicle("Jeep","Wrangler",24555,true));
        for (Vehicle car:vehicles){
            System.out.println(car);
        }



        LinkedList<Integer> numbers =new LinkedList<Integer>();
        numbers.add(24);
        numbers.add(65);
        numbers.add(55);
        System.out.println(numbers);

    }
}