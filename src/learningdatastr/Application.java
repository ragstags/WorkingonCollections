package learningdatastr;

import java.util.HashSet;

/**
 * Created by nadimchouglay on 14/09/2017.
 */
public class Application {
    public static void main(String[] args) {
        HashSet<Animals> animals =new HashSet<Animals>();
        Animals animal1 =new Animals(12,"Dog");
        Animals animal2 =new Animals(23,"Hippo");
        Animals animal3 =new Animals(3,"cat");
        Animals animal4 =new Animals(12,"Dog");

        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        System.out.println(animal1.equals(animal4));
        for (Animals value :animals){
            System.out.println(value);

        }
    }
}
