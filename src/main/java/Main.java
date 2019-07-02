import java.sql.Date;

import br.com.moip.API;
import br.com.moip.Client;
import br.com.moip.authentication.Authentication;
import br.com.moip.authentication.BasicAuth;
import br.com.moip.request.AmountRequest;
import br.com.moip.request.ApiDateRequest;
import br.com.moip.request.CustomerRequest;
import br.com.moip.request.OrderAmountRequest;
import br.com.moip.request.OrderRequest;
import br.com.moip.request.PhoneRequest;
import br.com.moip.request.ReceiverRequest;
import br.com.moip.request.ShippingAddressRequest;
import br.com.moip.request.SubtotalsRequest;
import br.com.moip.request.TaxDocumentRequest;
import br.com.moip.resource.Customer;
import br.com.moip.resource.Order;

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
		
//		Order createdOrder = api.order().create(new OrderRequest()
//			    .ownId("ORD-" + System.currentTimeMillis())
//			    .amount(new OrderAmountRequest()
//			        .currency("BRL")
//			        .subtotals(new SubtotalsRequest()
//			            .shipping(1000)
//			            .addition(100)
//			            .discount(500)
//			        )
//			    )
//			    .addItem("Nome do produto 1", 1, "Mais info...", 100)
//			    .addItem("Nome do produto 2", 2, "Mais info...", 200)
//			    .addItem("Nome do produto 3", 3, "Mais info...", 300)
//			    .customer(new CustomerRequest()
//					    .ownId("CUS-27")
//					    .fullname("Yosh")
//					    .email("yosh@gmail.com")
//					    .birthdate(new ApiDateRequest().date(new Date(915315017)))
//					    .taxDocument(TaxDocumentRequest.cpf("12345678909"))
//					    .phone(new PhoneRequest().countryCode("55").setAreaCode("11").setNumber("942898819"))
//					    .shippingAddressRequest(new ShippingAddressRequest()
//					        .street("Rua Aquelino Estebanes")
//					        .streetNumber("28")
//					        .complement("")
//					        .city("São Paulo")
//					        .state("SP")
//					        .district("Sabaúna")
//					        .country("BRA")
//					        .zipCode("08850-140"))
//			    )
//			);
//		
//		// Criando um objeto da nossa conta
//		Authentication auth = new BasicAuth(token, key);
//		
//		// Setando o environment com o qual vamos trabalhas
//		Client client = new Client(Client.SANDBOX, auth);
//
//		// Então nós criamos uma instancia da api para realizarmos as operações
//		API api = new API(client);
//		
		String customer_id = "CUS-" + new java.util.Date().getSeconds();
		
		// Criando o Customer que irá realizar a compra
		Customer customer = api.customer().create(new CustomerRequest()
			    .ownId(customer_id)
			    .fullname("Batata")
			    .email("batata22@gmail.com")
			    .birthdate(new ApiDateRequest().date(new Date(915315017)))
			    .taxDocument(TaxDocumentRequest.cpf("12345678909"))
			    .phone(new PhoneRequest().countryCode("55").setAreaCode("11").setNumber("942898819"))
			    .shippingAddressRequest(new ShippingAddressRequest()
			        .street("Rua Aquelino Estebanes")
			        .streetNumber("28")
			        .complement("")
			        .city("São Paulo")
			        .state("SP")
			        .district("Sabaúna")
			        .country("BRA")
			        .zipCode("08850-140")
			    )
			);
	}
}
