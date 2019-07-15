package br.com.moip.request;

import br.com.moip.resource.InvoiceDate;
import br.com.moip.resource.Subscriber;
import br.com.moip.resource.SubscriptionPlan;
import com.google.gson.annotations.SerializedName;

/**
 * This class implements the attributes needed to send request to WireCard API
 *
 * @author Marcelo Vilas Boas Correa Filho
 * @version 0.1
 */

public class SubscriptionRequest {

    /**
     * Required: True
     * Max Length: 65
     * Description: Your own subscription ID. Must be duplicated.
     */
    private String code;

    /**
     * Required: False
     * Description: Subscription value in cents. The subscription amount can be different from the SubscriptionPlan,
     * for some kind of discount or extra tax. But need to ask to the customer first.
     */
    private String amount;

    /**
     * Required: True
     * Description: Payment Method, to use the BOLETO option is important to activate the option "Enviar e-mail para o comprador"
     * in the MOIP account.
     */
    private String paymentMethod;

    /**
     * Required: True
     * Description: Subscription Plan code that the Subscription will be linked
     */
    private SubscriptionPlan plan;

    /**
     * Required: True
     * Description: Subscriber that will be linked to the SubscriptionPlan
     */
    private Subscriber customer;

    /**
     * Required: False
     * Description: Field to specify whether signature should be created with pro-rata or not.
     * Options: true or false
     * Obs: This field is a STRING by defined at WireCard API
     */
    @SerializedName("pro_rata")
    private String proRata;

    /**
     * Required: False
     * Description: Best day for Monthly SubscriptionPlan and best month for Annual SubscriptionPlan
     */
    @SerializedName("best_invoice_date")
    private InvoiceDate bestInvoiceDate;

    /**
     * Only required Attributes to use the Subscriptions WireCard API
     *
     * @param code
     * @param paymentMethod
     * @param plan
     * @param customer
     */
    public SubscriptionRequest(String code, String paymentMethod, SubscriptionPlan plan, Subscriber customer) {
        this.code = code;
        this.paymentMethod = paymentMethod;
        this.customer = customer;
        this.plan = plan;
    }

    public String getCode() {
        return code;
    }

    public SubscriptionRequest setCode(String code) {
        this.code = code;
        return this;
    }

    public String getAmount() {
        return amount;
    }

    public SubscriptionRequest setAmount(String amount) {
        this.amount = amount;
        return this;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public SubscriptionRequest setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    public SubscriptionPlan getPlan() {
        return plan;
    }

    public SubscriptionRequest setPlan(SubscriptionPlan plan) {
        this.plan = plan;
        return this;
    }

    public Subscriber getCustomer() {
        return customer;
    }

    public SubscriptionRequest setCustomer(Subscriber customer) {
        this.customer = customer;
        return this;
    }

    public Boolean getProRata() {
        return Boolean.valueOf(proRata);
    }

    public SubscriptionRequest setProRata(boolean proRata) {
        this.proRata = Boolean.toString(proRata);
        return this;
    }

    public InvoiceDate getBestInvoiceDate() {
        return bestInvoiceDate;
    }

    public SubscriptionRequest setBestInvoiceDate(InvoiceDate bestInvoiceDate) {
        this.bestInvoiceDate = bestInvoiceDate;
        return this;
    }
}
