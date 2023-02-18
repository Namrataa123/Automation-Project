package com.gorestapi.com;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TC001_GetCalls {
	@Test
public void getDetailsTest()
{
	given().when().get("https://gorest.co.in/public/v2/users/56").then().log().all().statusCode(404).body("message",equalTo("Resource not found")); 
	}
}
