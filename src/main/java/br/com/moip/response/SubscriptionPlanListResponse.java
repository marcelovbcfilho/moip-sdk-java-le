package br.com.moip.response;

import java.util.List;

import br.com.moip.resource.SubscriptionPlan;

/**
 * This methods encapsulate the response from the WireCard API that receives all Plans registered
 * @author Marcelo Vilas Boas Correa Filho
 */

public class SubscriptionPlanListResponse {
	
	/**
	 * This attribute will keep all Plans received from the API
	 */
	private List<SubscriptionPlan> plans;
	
	public SubscriptionPlanListResponse() {}
	
	public SubscriptionPlanListResponse(List<SubscriptionPlan> plans) {
		this.plans = plans;
	}

	public List<SubscriptionPlan> getPlans() {
		return plans;
	}

	public void setPlans(List<SubscriptionPlan> plans) {
		this.plans = plans;
	}
	
	@Override
	public String toString() {
		String string = "";
		
		for(SubscriptionPlan sub:plans) {
			string += " { " + sub.toString() + " } , ";
		}
		return string;
	}
}
