import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) {

        NameComparator nameComparator = new NameComparator();

        Set<Person> persons = new TreeSet<>(nameComparator);
        persons.add(new Person("Mark", 25));
        persons.add(new Person("Andra", 20));
        persons.add(new Person("George", 34));
        persons.add(new Person("Diana", 18));

        System.out.println("-----------------------------");
        System.out.println("The list of persons sorted by name is:");
        for (Person pers: persons) {
            System.out.println(pers);
        }

        AgeComparator ageComparator = new AgeComparator();
        Set<Person> ageSortedPersons = new TreeSet<>(ageComparator);
        ageSortedPersons.addAll(persons);

        System.out.println("-----------------------------");
        System.out.println("The list of persons sorted by age is:");
        for (Person pers: ageSortedPersons) {
            System.out.println(pers);
        }
    }

}
