public class Address {

    private String street;
    private String number;
    private String building;
    private String city;
    private String country;

    public Address(String street,String number,String building,String city, String country)
    {
        this.street = street;
        this.number = number;
        this.building = building;
        this.city = city;
        this.country = country;
    }

    public String getCountry()
    {
        return country;
    }

    @Override
    public String toString()
    {
        return building + ", " + number + " " + street + ", " + city + ", " + country;
    }
}
