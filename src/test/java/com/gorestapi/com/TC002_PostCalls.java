package com.gorestapi.com;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
public class TC002_PostCalls {

	public HashMap map= new HashMap();
	
	
	@Test
	public void createcustomer()
		{
		String CustName= RandomStringUtils.randomAlphabetic(10);
		String CustEmail=RandomStringUtils.randomAlphabetic(10);
		map.put("name", CustName);
		map.put("email", CustEmail +"gmail.com");
		map.put("gender", "male");
		map.put("status", "active");
		
		RestAssured.baseURI="https://gorest.co.in";
		RestAssured.basePath="/public/v2/users";
		/*Notes :when you write these above two base uri and base path then you dont have to write url in post,
		  you can simply call it*/
		given()
		//content type
		.contentType("application/json")
		//token
		.headers("Authorization","Bearer 7befc5c3ab8fdc63cccfd068d7814d183354f988219c8cc862086129aa2547c8")
		//payload
		.body(map)
		.when()
		.post()
		//notes keep the post empty after entering base uri and base path
		.then()
		//.log().all().statusCode(201);
		.log().all();
		
		
	}
}
