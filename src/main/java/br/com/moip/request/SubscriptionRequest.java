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

public class SubscriptionsRequest {

    /**
     * Required: True
     * Max Length: 65
     * Description: Your own subscription ID. Must not be duplicated.
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

    public SubscriptionsRequest() {
    }

    /**
     * Only required Attributes to use the Subscriptions WireCard API
     *
     * @param code
     * @param paymentMethod
     * @param plan
     * @param customer
     */
    public SubscriptionsRequest(String code, String paymentMethod, SubscriptionPlan plan, Subscriber customer) {
        this.code = code;
        this.paymentMethod = paymentMethod;
        this.customer = customer;
        this.plan = plan;
    }

    public SubscriptionsRequest(String code, String amount, String paymentMethod, SubscriptionPlan plan, Subscriber customer, String proRata, InvoiceDate bestInvoiceDate) {
        this.code = code;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.plan = plan;
        this.customer = customer;
        this.proRata = proRata;
        this.bestInvoiceDate = bestInvoiceDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public SubscriptionPlan getPlan() {
        return plan;
    }

    public void setPlan(SubscriptionPlan plan) {
        this.plan = plan;
    }

    public Subscriber getCustomer() {
        return customer;
    }

    public void setCustomer(Subscriber customer) {
        this.customer = customer;
    }

    public String getProRata() {
        return proRata;
    }

    public void setProRata(String proRata) {
        this.proRata = proRata;
    }

    public InvoiceDate getBestInvoiceDate() {
        return bestInvoiceDate;
    }

    public void setBestInvoiceDate(InvoiceDate bestInvoiceDate) {
        this.bestInvoiceDate = bestInvoiceDate;
    }
}
