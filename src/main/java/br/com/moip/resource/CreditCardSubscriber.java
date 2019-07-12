package br.com.moip.resource;

import com.google.gson.annotations.SerializedName;

/**
 * This class implements all Credit Card info needed by the Subscriber
 *
 * @author Marcelo Vilas Boas Correa Filho
 * @version 0.1
 */

public class CreditCardSubscriber {

    /**
     * Required: False
     * Description: Name of the holder.
     */
    @SerializedName("holder_name")
    private String holderName;

    /**
     * Required: False
     * Description: Credit card number
     */
    private String number;

    /**
     * Required: False
     * Description: Credit card expiration month
     * Options: 01 => 12
     */
    @SerializedName("expiration_month")
    private int expirationMonth;

    /**
     * Required: False
     * Description: Credit card expiration year
     * Values: 2 digits only
     * Example: 2022 => 22
     */
    @SerializedName("expiration_year")
    private int expirationYear;

    /**
     * Required: False
     * Description: If a subscriber have already registered a credit card just pass their credit card code here
     */
    private String vault;

    public CreditCardSubscriber() {
    }


    public CreditCardSubscriber(String holderName, String number, int expirationMonth, int expirationYear) {
        this.holderName = holderName;
        this.number = number;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
    }

    public CreditCardSubscriber(String holderName, int number, int expirationMonth, int expirationYear, String vault) {
        this.holderName = holderName;
        this.number = number;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.vault = vault;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(int expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }

    public String getVault() {
        return vault;
    }

    public void setVault(String vault) {
        this.vault = vault;
    }
}
