package br.com.moip.resource;

import com.google.gson.annotations.SerializedName;

/**
 * This class implements the attribute needed to inform the best invoice date from WireCard API
 *
 * @author Marcelo Vilas Boas Correa Filho
 * @version 0.1
 */

public class InvoiceDate {

    /**
     * Required: False
     * Description: Sets the day of the month that should be assigned as the best payment day.
     * Obs: If a bigger value than 31 was informed the default will be 31
     * Options: 1 => 31
     */
    @SerializedName("day_of_month")
    private int dayOfMonth;

    /**
     * Required: False
     * Description: Set the month of the payment, ONLY for annual SubscriptionPlan.
     * Values: 1 => 12
     */
    @SerializedName("month_of_year")
    private String monthOfYear;

    public InvoiceDate() {
    }

    public InvoiceDate(String monthOfYear) {
        this.monthOfYear = monthOfYear;
    }

    public InvoiceDate(int dayOfMonth, String monthOfYear) {
        this.dayOfMonth = dayOfMonth;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public String getMonthOfYear() {
        return monthOfYear;
    }

    public void setMonthOfYear(String monthOfYear) {
        this.monthOfYear = monthOfYear;
    }
}
