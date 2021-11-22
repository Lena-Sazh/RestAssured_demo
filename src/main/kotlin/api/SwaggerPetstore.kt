package api

import specification.Specification
import dto.User
import io.restassured.RestAssured.given
import io.restassured.response.ValidatableResponse
import org.hamcrest.CoreMatchers.equalTo

class SwaggerPetstore {
    val user = User(
        "dummymail@mail.com",
        "Lena",
        15,
        "Sazhina",
        "somepassword",
        "77777777",
        0,
        "Sazhina"
    )

    fun createUser(user: User): ValidatableResponse? {

        return given(Specification().requestSpec)
            .body(user)
            .`when`()
            .post("/user")
            .then()
            .statusCode(200)
            .spec(Specification().responseSpec)
            .body("message", equalTo("1"))
    }

    fun updateUser(user: User): ValidatableResponse? {

        return given(Specification().requestSpec)
            .body(user)
            .`when`()
            .put("/user/CaptainMarvel")
            .then()
            .statusCode(200)
            .spec(Specification().responseSpec)


    }
    fun getUser(user: User): ValidatableResponse? {

        return given(Specification().requestSpec)
            .body(user)
            .`when`()
            .get("/user/CaptainMarvel")
            .then()
            .statusCode(200)
            .spec(Specification().responseSpec)

    }

    fun deleteUser(user: User): ValidatableResponse? {

        return given(Specification().requestSpec)
            .body(user)
            .`when`()
            .delete("/user/CaptainMarvel")
            .then()
            .statusCode(200)
    }




}