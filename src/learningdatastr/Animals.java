package learningdatastr;

/**
 * Created by nadimchouglay on 14/09/2017.
 */
public class Animals {
    String name;
    int age;

    public Animals(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Animals() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animals animals = (Animals) o;

        if (age != animals.age) return false;
        return name.equals(animals.name);

    }

    @Override
   public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }
}
