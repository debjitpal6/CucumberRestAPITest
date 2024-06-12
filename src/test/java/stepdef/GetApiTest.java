package stepdef;

import static io.restassured.RestAssured.given;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetApiTest {
   
    Response response;
   
    @Given("^the valid endpoint to fetch users$")
    public void setupEndpoint()
    {
  RestAssured.baseURI="https://reqres.in/";
    RestAssured.basePath="/api/users";
    }
   
   
    @When("^the request is send to server with page number as \"([^\"]*)\"$")
    public void sendRequest(int pageNumber)
    {
  response = given().
    queryParam("page",pageNumber).
    when().
    get().
    then().
    contentType(ContentType.JSON).
    extract().response();  
    }
   
   
    @Then("^validate the response of first user record having email as \"([^\"]*)\"$")
    public void validateUserData(String emailID)
    {
  String userEmail = response.path("data[0].email");
  Assert.assertEquals(userEmail, emailID);  
    }

}
