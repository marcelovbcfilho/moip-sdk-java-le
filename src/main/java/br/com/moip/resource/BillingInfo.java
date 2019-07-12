package br.com.moip.resource;

import com.google.gson.annotations.SerializedName;

/**
 *  This class implements all data needed for Subscriber billing info
 * @author Marcelo Vilas Boas Correa Filho
 * @version 0.1
 */

public class BillingInfo {

    /**
     * Required: False
     * Description: Credit Card information
     */
    @SerializedName("credit_card")
    private CreditCardSubscriber creditCardSubscriber;

    public BillingInfo() {
    }

    public BillingInfo(CreditCardSubscriber creditCardSubscriber) {
        this.creditCardSubscriber = creditCardSubscriber;
    }

    public CreditCardSubscriber getCreditCardSubscriber() {
        return creditCardSubscriber;
    }

    public void setCreditCardSubscriber(CreditCardSubscriber creditCardSubscriber) {
        this.creditCardSubscriber = creditCardSubscriber;
    }
}
