package Hashmap;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by nadimchouglay on 18/09/2017.
 */
public class Application {
    public static void main(String[] args) {


        TreeMap<String, String> dictionary = new TreeMap<String, String>();
        dictionary.put("Brave","ready to face danger");
        dictionary.put("brilliant","ready to face danger");
        dictionary.put("joy","ready to face danger");
        dictionary.put("confidence","ready to face danger");
        dictionary.put("Brave","ready to face danger");
        //for (String words:dictionary.keySet()){
         //   System.out.println(dictionary.get(words));
        for (Map.Entry<String ,String> entry:dictionary.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}