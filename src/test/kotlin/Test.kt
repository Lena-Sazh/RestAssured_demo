import api.SwaggerPetstore
import dto.User
import io.kotest.core.spec.style.FreeSpec

class Test: FreeSpec() {

    init {
        "Create User" - {
            val user: User = User(
                "saofdihsjdf",
                "Sergey",
                15,
                "Gogolev",
                "string",
                "99999999",
                0,
                "Gogolev"
            )
            SwaggerPetstore().createUser(user)
        }
    }
}