package com.moregenerics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by nadimchouglay on 23/10/2017.
 */
public class Application {
    public static void main(String[] args) {
        Container<Integer,String> container=new Container<>(12,"hello");
        int val1=container.getItem1();
        String val2 =container.getItem2();
        System.out.println(val1 );
        System.out.println(val2);

        Set<String> myset1=new HashSet<>();
           myset1.add("first");
        myset1.add("second");
        myset1.add("third");
        myset1.add("fou");

        Set<String> myset2=new HashSet<>();
        myset1.add("first");
        myset1.add("second");
        myset1.add("third");
        myset1.add("fifth");
       Set<String> resultset= union(myset1,myset2);
        Iterator<String> itr=resultset.iterator();
        while (itr.hasNext()){
            String var=itr.next();
            System.out.println(var);
        }

    }
    public static<E> Set<E> union(Set<E> set1 ,Set<E> set2){
        Set<E> result =new HashSet<E>(set1);
        result.addAll(set2);
        return result;
    }
}
