package br.com.moip.response;

import br.com.moip.resource.*;
import br.com.moip.resource.Error;
import com.google.gson.annotations.SerializedName;

public class SubscriptionResponse extends Response{
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
     * Description: Subscription Plan code that the Subscription will be linked
     */
    private SubscriptionPlan plan;

    /**
     * Required: True
     * Description: Subscriber that will be linked to the SubscriptionPlan
     */
    private Subscriber customer;

    /**
     * Description: Next invoice date
     */
    @SerializedName("next_invoice_date")
    private NextInvoiceDate nextInvoiceDate;

    /**
     * Description: Subscription status
     */
    private String status;

    /**
     * Description: Subscription's invoice
     */
    private InvoiceSubscription invoice;

    public SubscriptionResponse() {
    }

    public SubscriptionResponse(String code, String amount, SubscriptionPlan plan, Subscriber customer, NextInvoiceDate nextInvoiceDate, String status, InvoiceSubscription invoice) {
        this.code = code;
        this.amount = amount;
        this.plan = plan;
        this.customer = customer;
        this.nextInvoiceDate = nextInvoiceDate;
        this.status = status;
        this.invoice = invoice;
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

    public NextInvoiceDate getNextInvoiceDate() {
        return nextInvoiceDate;
    }

    public void setNextInvoiceDate(NextInvoiceDate nextInvoiceDate) {
        this.nextInvoiceDate = nextInvoiceDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public InvoiceSubscription getInvoice() {
        return invoice;
    }

    public void setInvoice(InvoiceSubscription invoice) {
        this.invoice = invoice;
    }
}
