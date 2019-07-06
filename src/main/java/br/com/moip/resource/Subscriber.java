package br.com.moip.resource;

import com.google.gson.annotations.SerializedName;

/**
 * This class implements the data needed to create a subscriber on WireCard API
 *
 * @author Marcelo Vilas Boas Correa Filho
 * @version 0.1
 */

public class Subscriber {

    /**
     * Required: True
     * Max Length: 65
     * Description: Code in your application for the Subscriber
     */
    private String code;

    /**
     * Required: True
     * Max Length: 150
     * Description: Full name of the Subscriber
     */
    private String fullname;

    /**
     * Required: True
     * Description: Subscriber's e-mail
     */
    private String email;

    /**
     * Required: True
     * Max Length: 11
     * Description: Subscriber's CPF
     */
    private String cpf;

    /**
     * Required: True
     * Max Legth: 2
     * Description: Subscriber's DDD withouth mask
     */
    @SerializedName("phone_area_code")
    private int phoneAreaCode;

    /**
     * Required: True
     * Max Length: 8 or 9
     * Description: Subscriber's phone number
     */
    @SerializedName("phone_number")
    private int phoneNumber;

    /**
     * Required: True
     * Description: Subscriber's birth day
     * Options: 1 -> 31
     */
    @SerializedName("birthdate_day")
    private int birthDateDay;

    /**
     * Required: False
     * Description: Subscriber's birth month
     * Options: 1 -> 12
     */
    @SerializedName("birthdate_month")
    private int birthDateMonth;

    /**
     * Required: True
     * Max Length: 4
     * Description: Subscriber's birth year
     */
    @SerializedName("birthdate_year")
    private int birthDateYear;

    /**
     * Required: True
     * Description: Subscriber's address
     */
    private AddressSubscriber address;

    /**
     * Required: False
     * Description: Subscriber's payment data
     */
    @SerializedName("billing_info")
    private BillingInfo billingInfo;

    public Subscriber() {
    }

    /**
     * Constructor with only required attributes
     *
     * @param code
     * @param fullname
     * @param email
     * @param cpf
     * @param phoneAreaCode
     * @param phoneNumber
     * @param birthDateDay
     * @param birthDateMonth
     * @param birthDateYear
     * @param address
     */
    public Subscriber(String code, String fullname, String email, String cpf, int phoneAreaCode, int phoneNumber, int birthDateDay, int birthDateMonth, int birthDateYear, AddressSubscriber address) {
        this.code = code;
        this.fullname = fullname;
        this.email = email;
        this.cpf = cpf;
        this.phoneAreaCode = phoneAreaCode;
        this.phoneNumber = phoneNumber;
        this.birthDateDay = birthDateDay;
        this.birthDateMonth = birthDateMonth;
        this.birthDateYear = birthDateYear;
        this.address = address;
    }

    public Subscriber(String code, String fullname, String email, String cpf, int phoneAreaCode, int phoneNumber, int birthDateDay, int birthDateMonth, int birthDateYear, AddressSubscriber address, BillingInfo billingInfo) {
        this.code = code;
        this.fullname = fullname;
        this.email = email;
        this.cpf = cpf;
        this.phoneAreaCode = phoneAreaCode;
        this.phoneNumber = phoneNumber;
        this.birthDateDay = birthDateDay;
        this.birthDateMonth = birthDateMonth;
        this.birthDateYear = birthDateYear;
        this.address = address;
        this.billingInfo = billingInfo;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getPhoneAreaCode() {
        return phoneAreaCode;
    }

    public void setPhoneAreaCode(int phoneAreaCode) {
        this.phoneAreaCode = phoneAreaCode;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBirthDateDay() {
        return birthDateDay;
    }

    public void setBirthDateDay(int birthDateDay) {
        this.birthDateDay = birthDateDay;
    }

    public int getBirthDateMonth() {
        return birthDateMonth;
    }

    public void setBirthDateMonth(int birthDateMonth) {
        this.birthDateMonth = birthDateMonth;
    }

    public int getBirthDateYear() {
        return birthDateYear;
    }

    public void setBirthDateYear(int birthDateYear) {
        this.birthDateYear = birthDateYear;
    }

    public AddressSubscriber getAddress() {
        return address;
    }

    public void setAddress(AddressSubscriber address) {
        this.address = address;
    }

    public BillingInfo getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(BillingInfo billingInfo) {
        this.billingInfo = billingInfo;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("{\n");
        string.append("\tcode: '" + this.code + "',\n")
        .append("\temail: '" + this.email + "',\n")
        .append("\tfullname: '" + this.fullname + "',\n")
        .append("\tcpf: '" + this.cpf + "',\n")
        .append("\tphone_area_code: '" + this.phoneAreaCode + "',\n")
        .append("\tphone_number: '" + this.phoneNumber + "',\n")
        .append("\tbirthdate_day: '" + this.birthDateDay + "',\n")
        .append("\tbirthdate_month: '" + this.birthDateMonth + "',\n")
        .append("\tbirthdate_year: '" + this.birthDateYear + "',\n")
        .append("\taddress: '" + this.address.toString() + "',\n")
        .append("\tbilling_info: '" + this.billingInfo+ "',\n");
        return string.toString();
    }
}























