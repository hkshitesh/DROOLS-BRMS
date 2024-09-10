# Drools Code
### Project Structure for Lab-1
![image](https://github.com/user-attachments/assets/8512cc16-49e3-40ac-8568-0fc940920c8f)

## To String()

    @Override
    public String toString() {
        return "Product{type='" + type + "', price=" + price + ", available=" + available + '}';


# Person.java

public class Person {
    private String name;
    private int age;
    private boolean hasBirthdayPassed;

    public Person(String name, int age, boolean hasBirthdayPassed) {
        this.name = name;
        this.age = age;
        this.hasBirthdayPassed = hasBirthdayPassed;
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

    public boolean isHasBirthdayPassed() {
        return hasBirthdayPassed;
    }

    public void setHasBirthdayPassed(boolean hasBirthdayPassed) {
        this.hasBirthdayPassed = hasBirthdayPassed;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", hasBirthdayPassed=" + hasBirthdayPassed + "}";
    }
}


