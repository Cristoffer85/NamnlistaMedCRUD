public class Person {
    private String name;
    private Integer age;
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    public Person(Integer age) {
        this.name ="";
        this.age = age;
    }

    public Person() {
        this.name = "";
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    // ToString är en metod som används för att skriva ut objektet
    // i detta fall skriver vi ut namn och ålder.
    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age;
    }
}