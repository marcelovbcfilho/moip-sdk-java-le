package br.com.moip.request;

/**
 * This class implements encapsulate the attributes for the WireCard Subscribption API
 * @author Marcelo Vilas Boas Correa Filho
 * @version 0.1
 */

public class SubscriptionPlanRequest {
	
	/**
	 * Required: true
	 * Max Length: 65
	 * Description: Plan's identifier in your application
	 */
	private String code;
	
	/**
	 * Required: True
	 * Max Length: 65
	 * Description: Plan's name in your application
	 */
	private String name;
	
	/**
	 * Required: False
	 * Max length: 65
	 * Description: Plan's description
	 */
	private String description;
	
	/**
	 * Required: True
	 * Max Length: 11
	 * Description: Amount of the plan to be charged in cents of Real.
	 */
	private int amount;
	
	/**
	 * Required: False
	 * Max Length: 11
	 * Description: Hiring fee to be charged in the signature in cents of Real.
	 */
	private int setup_fee;
	
	/**
	 * Required: False
	 * Default: unit:"MONTH", length:1
	 * Description: Interval type and collection interval
	 */
	private IntervalSubscriptionRequest interval;
	
	/**
	 * Required: False
	 * Max Length: 11
	 * Description: Number of cycles (invoices) that the subscription will 
	 * 	have until it expires (if you do not inform, there will be no expiration).
	 * 	The TRIAL period consumes a billing cycle unit.
	 * Default: The invoice will never expires
	 */
	private int billingCycles;
	
	/**
	 * Required: False
	 * Default: Trial is disabled
	 * Description: Describes if the subscribption is enabled and their properties
	 */
	private TrialSubscriptionRequest trial;
	
	/**
	 * Required: False
	 * Options: True(Active) or False(Inactive)
	 * Default: True(Active)
	 * Description: Status of the subscription plan.
	 */
	private boolean status;
	
	/**
	 * Required: False
	 * Max Length: 11
	 * Default: without limits
	 * Description: Maximum number of signatures of the plan (if not informed, there will be no limit).
	 */
	private int maxQty;
	
	/**
	 * Required: False
	 * Options: "BOLETO", "CREDIT_CARD" or "ALL"
	 * Default: "ALL"
	 * Description: Forms of payment accepted in the plan.
	 */
	private String paymentMethod;
	
	/**
	 * This attribute will only be used after the creation of the Subscribption Plan.
	 * This is an auto generated code from WireCard system.
	 */
	private String id;
	
	public SubscriptionPlanRequest() {}
	
	public SubscriptionPlanRequest(String code, String name, int amount) {
		this.code = code;
		this.name = name;
		this.amount = amount;
	}
	
	public SubscriptionPlanRequest(String code, String name, String description,
									int amount, int setupFee, IntervalSubscriptionRequest interval,
									int billingCycles, TrialSubscriptionRequest trial, boolean status, 
									int maxQty, String paymentMethod) {
		this.code = code;
		this.name = name;
		this.amount = amount;
		this.interval = interval;
		this.billingCycles = billingCycles;
		this.trial = trial;
		this.status = status;
		this.maxQty = maxQty;
		this.paymentMethod = paymentMethod;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getSetup_fee() {
		return setup_fee;
	}

	public void setSetup_fee(int setup_fee) {
		this.setup_fee = setup_fee;
	}

	public IntervalSubscriptionRequest getInterval() {
		return interval;
	}

	public void setInterval(IntervalSubscriptionRequest interval) {
		this.interval = interval;
	}

	public int getBillingCycles() {
		return billingCycles;
	}

	public void setBillingCycles(int billingCycles) {
		this.billingCycles = billingCycles;
	}

	public TrialSubscriptionRequest getTrial() {
		return trial;
	}

	public void setTrial(TrialSubscriptionRequest trial) {
		this.trial = trial;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getMaxQty() {
		return maxQty;
	}

	public void setMaxQty(int maxQty) {
		this.maxQty = maxQty;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
























