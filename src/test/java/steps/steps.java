package steps;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.restassured.response.Response;

public class steps {
	@Given("EnvOnly payload with Client {string} customerAccount {string} and invoiceAccount {string}")
	public void env_only_payload_with_client_customer_account_and_invoice_account(String client, String customerAccount, String invoiceAccount) {
	    // Write code here that turns the phrase above into concrete actions
		Response res =
				 given()
						    .baseUri("https://us-sqa-dax.azure-api.net")
						    .basePath("v1/fulfillment/orders")
						    .header("Authorization", "Basic c3ZjLlVTLmQuZGF4OnRlc3Q=")
						    .header("x-api-key", "Li2OjYDj9QYlCv0Pwc0x3dkV8WxZtftk/CLKhWeOcaU=")
						    .header("Content-Type", "application/json")
						    .header("Asurion-correlationId", "4c0735aa-aa95-4b24-aea5-711a518306f3")
						    .body("{\r\n"
						    		+ "	\"client\": \""+client+"\",\r\n"
						    		+ "	\"region\": \"US\",\r\n"
						    		+ "	\"lineOfBusiness\": \"REPLACE\",\r\n"
						    		+ "	\"company\": \"\",\r\n"
						    		+ "	\"correlation\": \"G8190045599\",\r\n"
						    		+ "	\"source\": \"SERVICEBENCH\",\r\n"
						    		+ "	\"reference1\": \"G81019004559\",\r\n"
						    		+ "	\"reference2\": \"G81019004558\",\r\n"
						    		+ "	\"reference3\": \"G81019004557\",\r\n"
						    		+ "	\"fulfillmentType\": \"ODI\",\r\n"
						    		+ "	\"customerAccount\": \""+customerAccount+"\",\r\n"
						    		+ "	\"invoiceAccount\": \""+invoiceAccount+"\",\r\n"
						    		+ "	\"paymentMode\": \"CRE\",\r\n"
						    		+ "	\"serviceOrderId\": \"G6WNBX45F556-1\",\r\n"
						    		+ "	\"serviceRequestType\": \"HI\",\r\n"
						    		+ "	\"serviceRequestDateTime\": \"2020-11-03 11:53:33\",\r\n"
						    		+ "	\"incidentType\": \"DAMAGED\",\r\n"
						    		+ "	\"incidentDateTime\": \"2020-11-02T00:00:00.000Z\",\r\n"
						    		+ "	\"serviceLocation\": \"0118491|303\",\r\n"
						    		+ "	\"enrollmentData\": {\r\n"
						    		+ "		\"enrolledDate\": \"2020-11-02T00:00:00.000Z\",\r\n"
						    		+ "		\"enrolledItemId\": \"S314-0411-IPH7P128RED\",\r\n"
						    		+ "		\"enrolledSerialNumber\": \"55557107903038\",\r\n"
						    		+ "		\"wirelessNumber\": \"5557903039\",\r\n"
						    		+ "		\"contactNumber\": \"5557903039\"\r\n"
						    		+ "	},\r\n"
						    		+ "	\"deliveryInfo\": {\r\n"
						    		+ "		\"deliveryAddressBusiness\": \"\",\r\n"
						    		+ "		\"deliveryAddressFirstName\": \"Mister\",\r\n"
						    		+ "		\"deliveryAddressLastName\": \"Customer\",\r\n"
						    		+ "		\"deliveryAddressLine1\": \"123 Smith St\",\r\n"
						    		+ "		\"deliveryAddressCity\": \"Smyrna\",\r\n"
						    		+ "		\"deliveryAddressZip\": \"37167\",\r\n"
						    		+ "		\"deliveryAddressState\": \"TN\",\r\n"
						    		+ "		\"deliveryAddressCountry\": \"SU\"\r\n"
						    		+ "	}\r\n"
						    		+ "}")
						     .when().post().then().assertThat().statusCode(200).extract().response();
		
		assertEquals(res.getStatusCode(),200);
	}

}
