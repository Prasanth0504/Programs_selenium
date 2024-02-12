package com.seleniumrevision;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Virtusa_APIGET {

public static void main(String[] args) throws ParseException {

	RestAssured.baseURI="https://reqres.in/";
	
	RequestSpecification request = RestAssured.given();
	
	request.header("Content-Type","application/json");
	request.queryParam("page",2);
	Response response = request.request(Method.GET,"/api/users?page=2");
	String asPrettyString = response.getBody().asPrettyString();
	
	JSONParser parser = new JSONParser();
	
	Object parse = parser.parse(asPrettyString);
	
	JSONObject jsonResponse=(JSONObject) parse;
	//JSONObject jsonResponse = (JSONObject) parser.parse(asPrettyString);
	
	JSONArray dataArray = (JSONArray) jsonResponse.get("data");
    JSONObject data = (JSONObject) dataArray.get(0);
    Object fname = data.get("first_name");

    System.out.println(fname);
	
    Object object = dataArray.get(1);
	
    JSONObject index1=(JSONObject) object;
    Object email = index1.get("email");
	System.out.println(email);
	
	
	
	
	
	
	
	
	
}	
	
}
