package br.com.moip.api;

import br.com.moip.Client;
import br.com.moip.exception.ValidationException;
import br.com.moip.request.SubscriptionPlanRequest;
import br.com.moip.resource.SubscriptionPlan;
import br.com.moip.response.SubscriptionPlanListResponse;

/**
 * This class implements the calls for the API
 * @author Marcelo Vilas Boas Correa Filho
 * @version 0.1
 */

public class SubscriptionPlanAPI {

    private final Client client;

    /**
     * Client that will make the request
     * @param client
     */
    public SubscriptionPlanAPI(Client client) {
        this.client = client;
    }
    
    /**
     * This methods create a new SubscribtionPlan
     * @param plan
     * 	The parameter is the Plan that will be created
     * @return 
     * 	Return the plan with the ID auto generated from the WireCard API
     */
    public SubscriptionPlan create(SubscriptionPlanRequest plan) {
        return client.post("/assinaturas/v1/plans", plan, SubscriptionPlan.class);
    }
    
    /**
     * This method return all plans that the client have already created
     * @return
     * 	Return a class with all Plans created
     */
    public SubscriptionPlanListResponse list() {
        return client.get("/assinaturas/v1/plans", SubscriptionPlanListResponse.class);
    }
    
    /**
     * This method query for a specified Subscription Plan
     * @param code
     * 	The code's plan
     * @return
     * 	Returns the corresponding Subscription Plan
     */
    public SubscriptionPlan get(String code) {
        return client.get(String.format("/assinaturas/v1/plans/%s", code), SubscriptionPlan.class);
    }

    /**
     * This method activate the received Plan using the WireCard API
     * @param plan
     * 	The plan to be activated
     * @return
     * 	Return nothing, but it will verify the response code if 200 it activated successfully 
     */
    public SubscriptionPlan activateSubscribtionPlan (SubscriptionPlan plan) {
        return client.put(String.format("/assinaturas/v1/plans/%s/activate", plan.getCode()), plan, SubscriptionPlan.class);
    }

    /**
     * This method inactive the received Plan using the WireCard API
     * @param plan
     * 	The plan to be desactivated
     * @return
     */
    public SubscriptionPlan desactivateSubscribtionPlan (SubscriptionPlan plan) {
        return client.put(String.format("/assinaturas/v1/plans/%s/inactivate", plan.getCode()), plan, SubscriptionPlan.class);
    }
    
    /**
     * This method will update a SubscriptionPlan, if it exist
     * @param plan
     * 	The plan that will be updated
     * @return
     * 	Return 200 OK if everithing was right
     */
    public SubscriptionPlan updateSubscribtionPlan (SubscriptionPlan plan) {
        return client.put(String.format("/assinaturas/v1/plans/%s", plan.getCode()), plan, SubscriptionPlan.class);
    }
}
