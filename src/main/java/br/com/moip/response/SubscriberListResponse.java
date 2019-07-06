package br.com.moip.response;

import br.com.moip.resource.Subscriber;

/**
 * This class implements the needed attribute to receive the Subscriber's from WireCard API
 *
 * @author Marcelo Vilas Boas Correa Filho
 * @version 0.1
 */

public class SubscriberListResponse {

    /**
     * Description: Receive all the Subscriber from the WireCard API
     */
    private SubscriberResponse[] customers;

    public SubscriberListResponse() {
    }

    public SubscriberListResponse(SubscriberResponse[] customers) {
        this.customers = customers;
    }

    public SubscriberResponse[] getCustomers() {
        return customers;
    }

    public void setCustomers(SubscriberResponse[] customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("customer: [\n");
        for(SubscriberResponse sub:this.customers){
            string.append("\t" + sub.toString() + ",\n");
        }
        return string.toString();
    }
}
