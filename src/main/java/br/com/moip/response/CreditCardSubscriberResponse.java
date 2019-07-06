package br.com.moip.response;

import com.google.gson.annotations.SerializedName;

/**
 * This class implements all attributes needed for Credit Card info from Subscriber Responses from WireCard API
 *
 * @author Marcelo Vilas Boas Correa Filho
 * @version 0.1
 */

public class CreditCardSubscriberResponse {

    @SerializedName("holder_name")
    private String holderName;

    @SerializedName("first_six_digits")
    private String firstSixDigits;

    @SerializedName("last_four_digits")
    private String lastFourDigits;

    private String brand;

    @SerializedName("expiration_month")
    private int expirationMonth;

    @SerializedName("expiration_year")
    private int expirationYear;

    private String vault;

    @Override
    public String toString() {
        return "{\n" +
                "\tholder_name: '" + this.holderName + "',\n" +
                "\tfirst_six_digits: '" + this.firstSixDigits + "',\n" +
                "\tlast_four_digits: '" + this.lastFourDigits + "',\n" +
                "\tbrand: '" + this.brand + "',\n" +
                "\texpiration_month: '" + this.expirationMonth + "',\n" +
                "\texpiration_year: '" + this.expirationYear + "',\n" +
                "\tvault: '" + this.vault + "',\n" +
                "}";
    }

}
