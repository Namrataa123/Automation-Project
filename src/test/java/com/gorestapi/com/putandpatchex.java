package com.gorestapi.com;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.apache.commons.lang3.RandomStringUtils;

import static io.restassured.RestAssured.*;
@Test
public class putandpatchex {
	
	int CustId= 409368;
	HashMap map = new HashMap();
	
 String CustName;
 String CustEmail;
	public void generatePayload()
	{
		RandomStringUtils.randomAlphabetic(10);
		RandomStringUtils.randomAlphabetic(10);
		map.put("name", CustName);
		map.put("email",CustEmail +"gmail.com");
		map.put("gender","male");
		map.put("status","active");
		
		RestAssured.baseURI="https://gorest.co.in";
		RestAssured.basePath="/public/v2/users"+CustId;
			
	}
			
 public void putcalls()
 {
	 given().contentType("application/json").headers("Authorization","Bearer 7befc5c3ab8fdc63cccfd068d7814d183354f988219c8cc862086129aa2547c8 ").body(map)
	 	 
	 .when()
	 .put()
	 .then()
	 .log().all();
 }
	
	
}
