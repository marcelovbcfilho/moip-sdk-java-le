package br.com.moip.resource;

/**
 * This class implements all attributes that Subscriber need for their address
 * @author Marcelo Vilas Boas Correa Filho
 * @version 0.1
 */

public class SubscriberAddress {

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
    public SubscriberAddress(String street, int number, String city, String district, String state, String country, int zipcode) {
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

    public SubscriberAddress setStreet(String street) {
        this.street = street;
		return this;
    }

    public int getNumber() {
        return number;
    }

    public SubscriberAddress setNumber(int number) {
        this.number = number;
		return this;
    }

    public String getComplement() {
        return complement;
    }

    public SubscriberAddress setComplement(String complement) {
        this.complement = complement;
		return this;
    }

    public String getCity() {
        return city;
    }

    public SubscriberAddress setCity(String city) {
        this.city = city;
		return this;
    }

    public String getDistrict() {
        return district;
    }

    public SubscriberAddress setDistrict(String district) {
        this.district = district;
		return this;
    }

    public String getState() {
        return state;
    }

    public SubscriberAddress setState(String state) {
        this.state = state;
		return this;
    }

    public String getCountry() {
        return country;
    }

    public SubscriberAddress setCountry(String country) {
        this.country = country;
		return this;
    }

    public int getZipcode() {
        return zipcode;
    }

    public SubscriberAddress setZipcode(int zipcode) {
        this.zipcode = zipcode;
		return this;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();

        return string.toString();
    }
}


















