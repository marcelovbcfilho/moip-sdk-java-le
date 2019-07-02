package br.com.moip.request;

/**
 * This class implements the interval of the Subscribption
 * @author Marcelo Vilas Boas Correa Filho
 * @version 0.1
 */

public class IntervalSubscriptionRequest {
	
	/**
	 * Required: False
	 * Values: "DAY", "MONTH", "YEAR"
	 * Description: Type of interval between charges.
	 * Default: "MONTH"
	 */
	private String unit;
	
	/**
	 * Required: False
	 * Max Length: 11
	 * Default: 1
	 */
	private int legth;
	
	public IntervalSubscriptionRequest() {}
	
	public IntervalSubscriptionRequest(String unit, int length) {
		this.unit = unit;
		this.legth = length;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public int getLegth() {
		return legth;
	}

	public void setLegth(int legth) {
		this.legth = legth;
	}
}
