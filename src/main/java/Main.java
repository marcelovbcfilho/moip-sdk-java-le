import java.sql.Date;

import br.com.moip.API;
import br.com.moip.Client;
import br.com.moip.authentication.Authentication;
import br.com.moip.authentication.BasicAuth;
import br.com.moip.request.*;
import br.com.moip.resource.Customer;
import br.com.moip.resource.Order;
import br.com.moip.resource.Subscriber;
import br.com.moip.resource.SubscriptionPlan;
import br.com.moip.response.SubscriberListResponse;
import br.com.moip.response.SubscriberResponse;
import br.com.moip.response.SubscriptionPlanListResponse;
import br.com.moip.response.SubscriptionResponse;

public class Main {
	private static String token = "UKXH9WGU7EOPOXNMNF8NTBVXRG0XGNUM";
	private static String key = "XCEVXDSCXIDNEIMQYAVL7DUMDGOA33Y9CVXZNAKO";

	public static void main(String[] args) {
		// Criando um objeto da nossa conta
		Authentication auth = new BasicAuth(token, key);
		
		// Setando o environment com o qual vamos trabalhas
		Client client = new Client(Client.SANDBOX, auth);

		// Então nós criamos uma instancia da api para realizarmos as operações
		API api = new API(client);

		SubscriptionPlan plan = new SubscriptionPlan();
		plan.setCode("plan101");

		Subscriber customer = new Subscriber();
		customer.setCode("cliente01");


		SubscriptionsRequest sub = new SubscriptionsRequest();
		sub.setCode("assinaturaasdasd012");
		sub.setAmount("9912312390");
		sub.setPaymentMethod("CREDIT_CARD");
		sub.setPlan(plan);
		sub.setCustomer(customer);
		
		SubscriptionResponse subs = api.subscriptions().create(new SubscriptionsRequest());

		System.out.println(subs);
		
		
	}
}
