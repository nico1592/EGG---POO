
package exercise_1.object;

/**
 *
 * @author Damian
 */
public class Person {
    
    private String name;
    private int age;
    private String sex;
    private double weight;
    private double high;

    public Person(String name, int age, String sex, double weight, double high) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.high = high;
    }

    public int getAge() {
        return age;
    }

}
