import java.util.*;

public class LastNamePersonComparator implements Comparator<Person> {
    public int compare (Person a, Person b) {
        return a.lastName.compareTo(b.lastName);
    }

    static public void main (String [] args) {

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Eduardo", "Senna", 39));
        personList.add(new Person("Angelina", "Jobs", 0));
        personList.add(new Person("Alberto", "Bandera", 74));

        System.out.println(personList);
        Collections.sort(personList, new LastNamePersonComparator());
        System.out.println(personList);


    }
}
