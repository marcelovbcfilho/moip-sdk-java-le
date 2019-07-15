package br.com.moip.resource;

import com.google.gson.annotations.SerializedName;

import java.util.Calendar;
import java.util.Date;

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
    private SubscriberAddress address;

    /**
     * Required: False
     * Description: Subscriber's payment data
     */
    @SerializedName("billing_info")
    private BillingInfo billingInfo;

    /**
     * Constructor used to instantiate a subscriber already cached by the Wirecard API
     *
     * @param code the defined subscriber code
     */
    public Subscriber(String code) {
        this.code = code;
    }

    /**
     * Constructor with only required attributes
     *
     * @param fullname
     * @param email
     * @param cpf
     * @param phoneAreaCode
     * @param phoneNumber
     * @param birthDate
     * @param address
     */
    public Subscriber(String fullname, String email, String cpf, int phoneAreaCode, int phoneNumber, Date birthDate, SubscriberAddress address) {
        this.fullname = fullname;
        this.email = email;
        this.cpf = cpf;
        this.phoneAreaCode = phoneAreaCode;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.setBirthDate(birthDate);
    }

    public String getCode() {
        return code;
    }

    public Subscriber setCode(String code) {
        this.code = code;
		return this;
    }

    public String getFullname() {
        return fullname;
    }

    public Subscriber setFullname(String fullname) {
        this.fullname = fullname;
		return this;
    }

    public String getEmail() {
        return email;
    }

    public Subscriber setEmail(String email) {
        this.email = email;
		return this;
    }

    public String getCpf() {
        return cpf;
    }

    public Subscriber setCpf(String cpf) {
        this.cpf = cpf;
		return this;
    }

    public int getPhoneAreaCode() {
        return phoneAreaCode;
    }

    public Subscriber setPhoneAreaCode(int phoneAreaCode) {
        this.phoneAreaCode = phoneAreaCode;
		return this;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public Subscriber setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
		return this;
    }

    public int getBirthDateDay() {
        return birthDateDay;
    }

    public Subscriber setBirthDateDay(int birthDateDay) {
        this.birthDateDay = birthDateDay;
		return this;
    }

    public int getBirthDateMonth() {
        return birthDateMonth;
    }

    public Subscriber setBirthDateMonth(int birthDateMonth) {
        this.birthDateMonth = birthDateMonth;
		return this;
    }

    public int getBirthDateYear() {
        return birthDateYear;
    }

    public Subscriber setBirthDateYear(int birthDateYear) {
        this.birthDateYear = birthDateYear;
		return this;
    }

    public SubscriberAddress getAddress() {
        return address;
    }

    public Subscriber setAddress(SubscriberAddress address) {
        this.address = address;
		return this;
    }

    public BillingInfo getBillingInfo() {
        return billingInfo;
    }

    public Subscriber setBillingInfo(BillingInfo billingInfo) {
        this.billingInfo = billingInfo;
		return this;
    }

    /**
     * Utility method to fill the Subscriber birth date.
     * Equivalent to calling Subscriber#setBirthDateDay, Subscriber#setBirthDateMonth and Subscriber#setBirthDateYear
     * @param birthDate a java.util.Date instance representing the subscriber birth date
     * @return the current Subscriber instance
     */
    public Subscriber setBirthDate(Date birthDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(birthDate);

        this.setBirthDateDay(calendar.get(Calendar.DAY_OF_MONTH));
        this.setBirthDateYear(calendar.get(Calendar.YEAR));

        // See https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html#MONTH
        this.setBirthDateMonth(calendar.get(Calendar.MONTH)+1);
        return this;
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























