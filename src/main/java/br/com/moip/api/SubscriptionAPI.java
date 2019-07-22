package br.com.moip.api;

import br.com.moip.Client;
import br.com.moip.request.SubscriptionRequest;
import br.com.moip.resource.Message;
import br.com.moip.response.SubscriptionListResponse;
import br.com.moip.response.SubscriptionResponse;

/**
 * This class implements all calls to the Subscriptions WireCard API
 * @author Marcelo Vilas Boas Correa Filho
 * @version 0.1
 */

public class SubscriptionAPI {
    private final Client client;

    /**
     * Client that will make the request
     * @param client
     */
    public SubscriptionAPI(Client client) {
        this.client = client;
    }

    /**
     * This methods create a new Subscriptions
     * @param newCustomer indicates whether the customer is new or not
     * @param subs the subscription to be created
     * @return generated subscription
     */
    public SubscriptionResponse create(boolean newCustomer, SubscriptionRequest subs) {
        return client.post(String.format("/assinaturas/v1/subscriptions?new_customer=%s", newCustomer), subs, SubscriptionResponse.class);
    }

    /**
     * This method return all Subscriptions that the client have already created
     * @return
     * 	Return a class with all Subscriptions created
     */
    public SubscriptionListResponse list() {
        return client.get("/assinaturas/v1/subscriptions", SubscriptionListResponse.class);
    }

    /**
     * This method query for a specified Subscriptions
     * @param code
     * 	The code's plan
     * @return
     * 	Returns the corresponding Subscription Plan
     */
    public SubscriptionResponse get(String code) {
        return client.get(String.format("/assinaturas/v1/subscriptions/%s", code), SubscriptionResponse.class);
    }

    /**
     * This method suspend the received Subscriptions using the WireCard API
     * @param subs
     * 	The plan to be activated
     * @return
     * 	Return nothing, but it will verify the response code if 200 it suspend successfully
     */
    public Message suspend(SubscriptionRequest subs) {
        return client.put(String.format("/assinaturas/v1/subscriptions/%s/suspend", subs.getCode()), subs, Message.class);
    }

    /**
     * This method inactive the received Plan using the WireCard API
     * @param subs
     * 	The plan to be reactivated
     * @return
     *  Return void, the way to know if everything goes will is by the answer from the API 200 = OK
     */
    public Message reactivate(SubscriptionRequest subs) {
        return client.put(String.format("/assinaturas/v1/subscriptions/%s/activate", subs.getCode()), subs, Message.class);
    }

    /**
     * This method inactive the received Plan using the WireCard API
     * @param code the code of the subscription to be cancelled
     * @return
     */
    public Message cancel(String code) {
        return client.put(String.format("/assinaturas/v1/subscriptions/%s/cancel", code), Message.class);
    }

    /**
     * This method will update a SubscriptionPlan, if it exist
     * @param subs
     * 	The plan that will be updated
     * @return
     * 	Return 200 OK if everithing was right
     */
    public Message update(SubscriptionRequest subs) {
        return client.put(String.format("/assinaturas/v1/subscriptions/%s", subs.getCode()), subs, Message.class);
    }
}
