package Api_TestCases.Testing_Weather_Service;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _Login_Test {
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/users";
    private static final String LOGIN_ENDPOINT = "/login";

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = BASE_URL;
    }

    @Test
    public void testSuccessfulLogin()
    {
        String requestBody = "{\n" +
                "\"payload\":{" +
                "  \"email\": \"ulianne.OConner@kory.org\",\n" +
                "  \"password\": \"1234\",\n" +
                "}}";
        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post(LOGIN_ENDPOINT)
                .then()
                .statusCode(200)
                .log().all();
    }

    @Test
    public void test_ResponseData()
    {
        String requestBody = "{\n" +
                "\"payload\":{" +
                "  \"email\": \"ulianne.OConner@kory.org\",\n" +
                "  \"password\": \"1234\",\n" +
                "}}";
        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post(LOGIN_ENDPOINT)
                .then()
                .statusCode(200)
                .log().all();
    }
}
