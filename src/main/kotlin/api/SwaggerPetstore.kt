package api

import specification.Specification
import dto.User
import io.restassured.RestAssured.given
import io.restassured.response.ValidatableResponse
import org.hamcrest.CoreMatchers.equalTo

class SwaggerPetstore {
    val user = User(
        "saofdihsjdf",
        "Sergey",
        15,
        "Gogolev",
        "string",
        "99999999",
        0,
        "Gogolev"
    )

    fun createUser(user: User): ValidatableResponse? {


        return given(Specification().requestSpec)
            .body(user)
            .`when`()
            .post("/user")
            .then()
            .spec(Specification().responseSpec)
            .body("message", equalTo("15"))
    }



}