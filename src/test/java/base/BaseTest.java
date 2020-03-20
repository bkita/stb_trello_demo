package base;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    protected static final String BASE_URL = "https://api.trello.com/1";
    protected static final String BOARDS = "boards";
    protected static final String LISTS = "lists";
    protected static final String CARDS = "cards";

    protected static final String KEY = "65fcb0686fdf1704d660ee5c7504b4de";
    protected static final String TOKEN = "0954bbacc883b371ac891f47b0704718faf3b10b3c3d5ce4f1cd55c533e28f96";

    protected static RequestSpecBuilder reqBuilder;
    protected static RequestSpecification reqSpec;

    @BeforeAll
    public static void beforeAll() {
        reqBuilder = new RequestSpecBuilder();
        reqBuilder.addQueryParam("key", KEY);
        reqBuilder.addQueryParam("token", TOKEN);
        reqBuilder.setContentType(ContentType.JSON);

        reqSpec = reqBuilder.build();
    }

}
