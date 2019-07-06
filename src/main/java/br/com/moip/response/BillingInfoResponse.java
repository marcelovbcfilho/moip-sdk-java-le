package br.com.moip.response;

import br.com.moip.resource.BillingInfo;
import com.google.gson.annotations.SerializedName;

/**
 * This class implements all the attributes to receive CreditCards data from WireCar API
 *
 * @author Marcelo Vilas Boas Correa Filho
 * @version 0.1
 */

public class BillingInfoResponse {

    /**
     * Required: False
     * Description: Credit Card information
     */
    @SerializedName("credit_cards")
    private CreditCardSubscriberResponse[] creditCards;

    public BillingInfoResponse() {
    }

    public BillingInfoResponse(CreditCardSubscriberResponse[] creditCards) {
        this.creditCards = creditCards;
    }

    public CreditCardSubscriberResponse[] getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(CreditCardSubscriberResponse[] creditCards) {
        this.creditCards = creditCards;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("[\n");
        for (CreditCardSubscriberResponse credit : this.getCreditCards()) {
            string.append("\t" + creditCards.toString() + ",\n");
        }
        string.append("]");
        return string.toString();
    }
}
