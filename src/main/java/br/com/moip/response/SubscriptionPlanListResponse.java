package br.com.moip.response;

import java.util.List;

import br.com.moip.resource.SubscriptionPlan;

/**
 * This methods encapsulate the response from the WireCard API that receives all SubscriptionPlans registered
 * @author Marcelo Vilas Boas Correa Filho
 */

public class SubscriptionPlanListResponse {
	
	/**
	 * This attribute will keep all SubscriptionPlans received from the API
	 */
	private List<SubscriptionPlan> subscriptionPlans;
	
	public SubscriptionPlanListResponse() {}
	
	public SubscriptionPlanListResponse(List<SubscriptionPlan> subscriptionPlans) {
		this.subscriptionPlans = subscriptionPlans;
	}

	public List<SubscriptionPlan> getSubscriptionPlans() {
		return subscriptionPlans;
	}

	public void setSubscriptionPlans(List<SubscriptionPlan> subscriptionPlans) {
		this.subscriptionPlans = subscriptionPlans;
	}
}
