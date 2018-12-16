package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * Created by nadimchouglay on 18/09/2017.
 */
public class Application {
    public static void main(String[] args) {


        HashSet<Employee> hashSet =new HashSet<Employee>();
        hashSet.add(new Employee("Mike","Hr",2550));
        hashSet.add(new Employee("harry","accounts",3556));
        hashSet.add(new Employee("Anna","Sales",3428));
        hashSet.add(new Employee("fay","Hr",2570));
        ArrayList<Employee> mylist =new ArrayList<Employee>(hashSet);
        Collections.sort(mylist);
        System.out.println(mylist);





    }
}