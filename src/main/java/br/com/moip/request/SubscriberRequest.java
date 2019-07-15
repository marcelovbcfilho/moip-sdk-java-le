package br.com.moip.request;

import br.com.moip.resource.SubscriberAddress;
import br.com.moip.resource.BillingInfo;
import com.google.gson.annotations.SerializedName;

/**
 * This class implements the subscriber attributes needed for a request system from WireCard V1
 *
 * @author Marcelo Vilas Boas Correa Filho
 * @version 0.1
 */

public class SubscriberRequest {

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

    public SubscriberRequest() {
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
    public SubscriberRequest(String code, String fullname, String email, String cpf, int phoneAreaCode, int phoneNumber, int birthDateDay, int birthDateMonth, int birthDateYear, SubscriberAddress address) {
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

    public SubscriberRequest(String code, String fullname, String email, String cpf, int phoneAreaCode, int phoneNumber, int birthDateDay, int birthDateMonth, int birthDateYear, SubscriberAddress address, BillingInfo billingInfo) {
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

    public SubscriberAddress getAddress() {
        return address;
    }

    public void setAddress(SubscriberAddress address) {
        this.address = address;
    }

    public BillingInfo getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(BillingInfo billingInfo) {
        this.billingInfo = billingInfo;
    }
}