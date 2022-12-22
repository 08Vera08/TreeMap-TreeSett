import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        PersonComparator comp = new PersonComparator();
        LinkedList<Person> list = new LinkedList<Person>();
        list.add(new Person("James", "Bond", 5));
        list.add(new Person("Hretta", "Tunberg", 12));
        list.add(new Person("Mohamed", "Petrov", 12));
        list.add(new Person("John", "Murtazaliev", 7));
        list.add(new Person("Jesus", "Pavlov", 8));
        list.add(new Person("Rotor", "Pavlov", 4));
        Collections.sort(list, comp);
        System.out.println(list);
    }

}