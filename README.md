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


# BirthdayRules.java

public class BirthdayRule {
    private String message;

    public BirthdayRule(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "BirthdayRule{message='" + message + "'}";
    }
}


# birthdayRules.drl

package com.example.rules;
import com.example.model.Person;
import com.example.model.BirthdayRule;

rule "Person has Birthday"
when
    $person : Person(age > 18, hasBirthdayPassed == false)
then
    $person.setHasBirthdayPassed(true);
    insert(new BirthdayRule($person.getName() + " has a birthday today!"));
    System.out.println($person.getName() + " has a birthday today.");
end

rule "Birthday Message"
when
    $rule : BirthdayRule(message != null)
then
    System.out.println($rule.getMessage());
end


