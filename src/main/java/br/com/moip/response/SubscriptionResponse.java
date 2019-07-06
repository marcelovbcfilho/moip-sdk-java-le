package br.com.moip.response;

import br.com.moip.resource.*;
import br.com.moip.resource.Error;
import com.google.gson.annotations.SerializedName;

public class SubscriptionResponse {
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
     * Description: Message from the api
     */
    private Message message;

    /**
     * Descriptions: Possible errors
     */
    private Error[] errors;

    /**
     * Description: Possible alerts
     */
    // TODO: Fix this not descript in API class
    private String alerts;

    /**
     * Description: Subscription's invoice
     */
    private InvoiceSubscription invoice;

    public SubscriptionResponse() {
    }

    public SubscriptionResponse(String code, String amount, SubscriptionPlan plan, Subscriber customer, NextInvoiceDate nextInvoiceDate, String status, Message message, Error[] errors, String alerts, InvoiceSubscription invoice) {
        this.code = code;
        this.amount = amount;
        this.plan = plan;
        this.customer = customer;
        this.nextInvoiceDate = nextInvoiceDate;
        this.status = status;
        this.message = message;
        this.errors = errors;
        this.alerts = alerts;
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

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Error[] getErrors() {
        return errors;
    }

    public void setErrors(Error[] errors) {
        this.errors = errors;
    }

    public String getAlerts() {
        return alerts;
    }

    public void setAlerts(String alerts) {
        this.alerts = alerts;
    }

    public InvoiceSubscription getInvoice() {
        return invoice;
    }

    public void setInvoice(InvoiceSubscription invoice) {
        this.invoice = invoice;
    }
}
