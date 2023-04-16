class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Demo {
    public static void main(String[] args) {
        Person[] people = new Person[3];

        people[0] = new Person("Vaibhav", 23);
        people[1] = new Person("Rohan", 24);
        people[2] = new Person("Riya", 21);

        for (Person person : people) {
            System.out.println(person.getName() + " is " + person.getAge() + " years old.");
        }
    }
}
