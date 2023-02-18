package com.gorestapi.com;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
@Test
public class putandpatch {

public void updatecustomer()
{
	given()
	.contentType("application/json")
	.headers("Authorization","Bearer 7befc5c3ab8fdc63cccfd068d7814d183354f988219c8cc862086129aa2547c8")
	.when()
	.put("https://gorest.co.in/public/v2/users/442372")
	.then()
	.log().all();
	
	}


		
		
	
		
		
		
		
		
		
	}
	

