public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int age;

    Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int compareTo(Person p) {
        int result = surname.length() - p.surname.length();
        if (result == 0) {
            return age - p.getAge();
        } else {
            return surname.length() - p.getSurname().length();
        }

    }

    @Override
    public String toString() {
        return "[Surname: " + surname + ", Name: " + name + ", Age: " + age + ']';
    }
}