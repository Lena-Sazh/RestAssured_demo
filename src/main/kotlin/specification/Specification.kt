package specification

import io.restassured.builder.RequestSpecBuilder
import io.restassured.builder.ResponseBuilder
import io.restassured.builder.ResponseSpecBuilder
import io.restassured.filter.log.LogDetail
import io.restassured.http.ContentType
import io.restassured.specification.RequestSpecification
import io.restassured.specification.ResponseSpecification

class Specification {

    private val BASE_URI = "https://petstore.swagger.io/v2"

    val requestSpec: RequestSpecification = RequestSpecBuilder()
//        .setProxy("localhost", 8888)
        .setBaseUri(BASE_URI)
        .setAccept(ContentType.JSON)
        .setContentType(ContentType.JSON)
        .log(LogDetail.ALL)
        .build()

    val responseSpec: ResponseSpecification = ResponseSpecBuilder().expectStatusCode(200).build()
}