package com.seleniumrevision;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValueLabs_JsonReadfromUI {

	public static void main(String[] args) throws ParseException {

		
		RestAssured.baseURI = "https://reqres.in";
		RequestSpecification req = RestAssured.given().header("Content-Type", "application/json").queryParam("page", 2);
		Response res = req.request(Method.GET, "/api/users?page=2");
		String string = res.getBody().asPrettyString();
		res.getStatusCode();
		 //System.out.println(string);


	// FileReader file=new FileReader("C:\\Users\\Prasanth\\"+
		// "eclipse-workspace\\Work\\JsonFile\\JsonData.json");

		JSONParser parser= new JSONParser();
		Object parse = parser.parse(string);
		JSONObject data=(JSONObject) parse;
		Object dat = data.get("data");
		JSONArray arr= (JSONArray)dat;
		Object object = arr.get(2);
		JSONObject id9=(JSONObject)object;
		System.out.println(id9);
		Object object2 = id9.get("first_name");
		System.out.println(object2);
		
		
	//Taking inputs from webpage directly
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://saturncloud.io/blog/what-is-the-correct-json-content-type/#:~:text=application%2Fjson,-%E2%80%9Capplication%2Fjson%E2%80%9D&text=It%20is%20a%20standard%20MIME,json%E2%80%9D%20as%20the%20content%20type.");
		driver.manage().window().maximize();
		
		WebElement json = driver.findElement(By.xpath("//code[contains(text(),'\"id\": \"123')]"));
		String text = json.getText();
		
		System.out.println(text);
		
		int startIndex = text.indexOf("{");

		String jsonData = text.substring(startIndex);
		
		
		JSONParser parser1 = new JSONParser();
		Object obj = parser1.parse(jsonData);
		
		JSONObject js= (JSONObject) obj;
		Object obje = js.get("data");
		JSONObject dat1=(JSONObject) obje;
		Object data1 = dat1.get("attributes");
		
		JSONObject dataobj= (JSONObject)data1;
		Object object1 = dataobj.get("age");
		System.out.println(object1);
		
		
		
		
		
		
		
		
		
	}

}
