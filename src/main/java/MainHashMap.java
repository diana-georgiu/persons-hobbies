import java.util.*;
import java.util.Map;

public class MainHashMap {

    private static Map<Person, List<Hobby>> personsHobbies = new HashMap<>();

    public static void main(String[] args) {

        Person p1 = new Person("Alex", 27);
        Hobby h1 = new Hobby("Tennis", 2);
        h1.addAddress(new Address("Piccadilly Street", "150", "Longboat Key Club", "London", "UK"));
        h1.addAddress(new Address("Victor Hugo", "30B", "RNS Tennis", "Paris", "France"));
        h1.addAddress(new Address("Abingdon Road", "80A", "Key Tennis Club", "Oxford", "UK"));

        Hobby h2 = new Hobby("Swimming", 3);
        h2.addAddress(new Address("Carnaby", "45", "Swimming Complex", "London", "UK"));

        Hobby h3 = new Hobby("Volleyball", 1);
        h3.addAddress(new Address("Graben", "32", "Sports Complex", "Vienna", "Austria"));

        List<Hobby> l1 = new ArrayList<>();
        l1.add(h1);
        l1.add(h2);
        l1.add(h3);

        personsHobbies.put(p1, l1);

        Person p2 = new Person("George", 30);

        Hobby h4 = new Hobby("Volleyball", 1);
        h4.addAddress(new Address("Graben Strasse", "32", "Sports Complex", "Vienna", "Austria"));
        h4.addAddress(new Address("Sand Strasse", "80A", "Sport Verein München", "Munich", "Germany"));

        Hobby h5 = new Hobby("Basketball", 2);
        h5.addAddress(new Address("Norman Street", "32", "Finsbury Leisure Centre", "London", "UK"));

        List<Hobby> l2 = new ArrayList<>();
        l2.add(h4);
        l2.add(h5);

        personsHobbies.put(p2, l2);

        System.out.println("-----------------------------");
        System.out.println("The list of all the persons and their associated hobbies is: \n");
        for (Map.Entry<Person, List<Hobby>> entry : personsHobbies.entrySet()) {
            {
                System.out.println(entry.getKey());
                for (Hobby h : entry.getValue())
                    System.out.println(" *** " + h);
                System.out.println();
            }
        }

        System.out.println("-----------------------------");
        System.out.println("The list of hobbies and countries for " + p1 + " is: " + getListHobbiesCountries(p1));

        System.out.println("-----------------------------");
        System.out.println("The list of hobbies and countries for " + p2 + " is: " + getListHobbiesCountries(p2));
    }

    public static String getListHobbiesCountries(Person p)
    {
        List<Hobby> hobbies = personsHobbies.get(p);
        String s = "";
        for (Hobby h : hobbies)
            s = s + (" \n Hobby name: '" + h.getName() + "' , countries: " + h.getHobbyCountries());

        return s;
    }

}