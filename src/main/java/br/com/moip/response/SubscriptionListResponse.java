package br.com.moip.response;

/**
 * This class will receive a list of Subscription from the WireCard API
 *
 * @author Marcelo Vilas Boas Correa Filho
 * @version 0.1
 */

public class SubscriptionListResponse {

    /**
     * Description: List of Subscription
     */
    private SubscriptionResponse[] subscriptions;

    public SubscriptionListResponse() {
    }

    public SubscriptionListResponse(SubscriptionResponse[] subscriptions) {
        this.subscriptions = subscriptions;
    }

    public SubscriptionResponse[] getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(SubscriptionResponse[] subscriptions) {
        this.subscriptions = subscriptions;
    }
}
