package br.com.moip.request;

/**
 * This class implements the time trial for the SubscribptionRequest class
 * @author Marcelo Vilas Boas Correa Filho
 * @version 0.1
 */

public class TrialSubscriptionRequest {
	
	/**
	 * Required: False
	 * Max Length: 11
	 * Description: Number of trial days of the plan.
	 */
	private int days;
	
	/**
	 * Required: False
	 * Default: False
	 * Description: Determines whether or not the trial is enabled.
	 */
	private boolean enabled;
	
	/**
	 * Required: False
	 * Default: True
	 * Description: Determines whether setup_fee will be charged before or after the trial period.
	 * Options: TRUE (after) or FALSE (before).
	 */
	private boolean holdSetupFee;
	
	public TrialSubscriptionRequest() {}
	
	public TrialSubscriptionRequest(int days, boolean enabled, boolean holdSetupFee) {
		this.days = days;
		this.enabled = enabled;
		this.holdSetupFee = holdSetupFee;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isHoldSetupFee() {
		return holdSetupFee;
	}

	public void setHoldSetupFee(boolean holdSetupFee) {
		this.holdSetupFee = holdSetupFee;
	}
}
