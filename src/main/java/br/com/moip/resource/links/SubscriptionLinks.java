package br.com.moip.resource.links;

import com.google.gson.annotations.SerializedName;

public class SubscriptionLinks {
    private Boleto boleto;

    public Boleto getBoleto() {
        return boleto;
    }

    public static class Boleto {
        @SerializedName("redirect_href")
        private String redirectHref;

        public String getRedirectHref() {
            return redirectHref;
        }
    }
}
