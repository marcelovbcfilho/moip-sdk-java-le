package br.com.moip.resource;

/**
 * This class implements all attributes that Subscriber need for their address
 * @author Marcelo Vilas Boas Correa Filho
 * @version 0.1
 */

public class AddressSubscriber {

    /**
     * Required: True
     * Description: Subscriber's street address
     */
    private String street;

    /**
     * Required: True
     * Description: Subscriber's street number
     */
    private int number;

    /**
     * Required: False
     * Description: Subscriber's street complement
     */
    private String complement;

    /**
     * Required: True
     * Description: Subscriber's city
     */
    private String city;

    /**
     * Required: True
     * Description: Subscriber's district
     */
    private String district;

    /**
     * Required: True
     * Description: Subscriber's state acronym
     * Example: São Paulo => SP
     */
    private String state;

    /**
     * Required: True
     * Description: Subscriber's country formatted as ISO-alpha3
     * Example: Brazil => BRA
     */
    private String country;

    /**
     * Required: True
     * Description: Subscriber's Zip Code without mask
     * Example: 98765432
     */
    private int zipcode;

    public AddressSubscriber() {
    }

    /**
     * Constructor with only required attributes
     * @param street
     * @param number
     * @param city
     * @param district
     * @param state
     * @param country
     * @param zipcode
     */
    public AddressSubscriber(String street, int number, String city, String district, String state, String country, int zipcode) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.district = district;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();

        return string.toString();
    }
}


















