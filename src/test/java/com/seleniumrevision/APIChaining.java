package com.seleniumrevision;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class APIChaining {

	public static void main(String[] args) {
		
		//RestAssured maven dependency
		
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification request = RestAssured.given()
		.header("Content-Type","application/json")
		.queryParam("page","2");
		Response response = request.request(Method.GET,"/api/users?page=2");		
		String str = response.getBody().asPrettyString();		
		//System.out.println(str);
		System.out.println(response.getStatusCode());
	
		System.out.println("********POST*************");
		
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given()
		.header("Content-Type","application/json");
		req.body(str).toString();
		Response res = req.request(Method.POST,"/api/users");
		String string = res.getBody().asPrettyString();
		
		//Assert.assertEquals(str, string);
		System.out.println(string);
		System.out.println(res.getStatusCode());
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
