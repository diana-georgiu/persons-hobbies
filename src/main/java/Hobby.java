import java.util.*;

public class Hobby {

    private String name;
    private int frequency;
    private List<Address> addresses = new ArrayList<>();

    public Hobby(String name,int frequency)
    {
        this.name = name;
        this.frequency = frequency;
    }

    public void addAddress(Address a)
    {
        addresses.add(a);
    }

    public String getName()
    {
        return name;
    }

    public String getHobbyCountries()
    {
        //used a set for the countries in order to avoid duplicates when printing
        Set<String> countriesSet = new HashSet<>();
        for (Address adr: addresses)
            countriesSet.add(adr.getCountry());

        return countriesSet.toString();
    }

    @Override
    public String toString()
    {
        String s = "Hobby { name: '" + name + "', frequency: '" + frequency + "'} \n\t - Adresses: ";
        for(Address adr: addresses)
            s = s + " { " + adr + " } ";
        return s;
    }
}
