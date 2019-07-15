package br.com.moip.api;

import br.com.moip.Client;
import br.com.moip.request.SubscriberRequest;
import br.com.moip.resource.BillingInfo;
import br.com.moip.resource.Message;
import br.com.moip.resource.Subscriber;
import br.com.moip.response.SubscriberListResponse;

/**
 * This class implements all the Subscriber's methods to use the WireCard API
 *
 * @author Marcelo Vilas Boas Correa Filho
 * @version 0.1
 */

public class SubscriberAPI {

    private final Client client;

    /**
     * Client that will make the request
     * @param client
     */
    public SubscriberAPI(Client client) {
        this.client = client;
    }

    /**
     * This methods create a new Subscriber with Billing Info
     * @param sub
     * 	The parameter is the sub that will be created
     * @return
     * 	Return the sub with the ID auto generated from the WireCard API
     */
    public Message createWithBillingInfo(SubscriberRequest sub) {
        return client.post("/assinaturas/v1/customers?new_vault=true", sub, Message.class);
    }

    /**
     * This methods create a new Subscriber
     * @param sub
     * 	The parameter is the sub that will be created
     * @return
     * 	Return the sub with the ID auto generated from the WireCard API
     */
    public Message create(SubscriberRequest sub) {
        return client.post("/assinaturas/v1/customers?new_vault=false", sub, Message.class);
    }

    /**
     * This method return all subscribers created
     * @return
     * 	Return a class with all subs created
     */
    public SubscriberListResponse list() {
        return client.get("/assinaturas/v1/customers", SubscriberListResponse.class);
    }

    /**
     * This method query for a specified Subscriber
     * @param code
     * 	The code's sub
     * @return
     * 	Returns the corresponding Subscription sub
     */
    public Subscriber get(String code) {
        return client.get(String.format("/assinaturas/v1/customers/%s", code), Subscriber.class);
    }

    /**
     * This method will update a Subscriber, if it exist
     * @param sub
     * 	The sub that will be updated
     * @return
     * 	Return 200 OK if everything was right
     */
    public Message update(Subscriber sub) {
        return client.put(String.format("/assinaturas/v1/customers/%s", sub.getCode()), sub, Message.class);
    }

    /**
     * This method will update a Subscriber's Billing Info, if it exists
     * @param code the subscriber code
     * @param billingInfo the new subscriber billing info
     * @return
     * 	Return 200 OK if everything was right
     */
    public Message updateBillingInfo(String code, BillingInfo billingInfo) {
        return client.put(String.format("/assinaturas/v1/customers/%s/billing_infos", code), billingInfo, Message.class);
    }
}
