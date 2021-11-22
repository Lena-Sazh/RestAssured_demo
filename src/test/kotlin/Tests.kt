import api.SwaggerPetstore
import dto.User
import io.kotest.core.spec.style.FreeSpec

class Tests: FreeSpec() {

    init {
        "Create User" - {
            val user: User = User(
                "carol@marvel.com",
                "Carol",
                1,
                "Denvers",
                "somepassword",
                "77777777",
                0,
                "CaptainMarvel"
            )
            SwaggerPetstore().createUser(user)
        }
    }

    init {
        "Update User" - {
            val user: User = User(
                "carol@marvel.com",
                "Lena",
                1,
                "Denvers",
                "somepassword",
                "77777777",
                0,
                "CaptainMarvel"
            )
            SwaggerPetstore().updateUser(user)
        }
    }

    init {
        "Get User" - {
            val user: User = User(
                "carol@marvel.com",
                "Lena",
                1,
                "Denvers",
                "somepassword",
                "77777777",
                0,
                "CaptainMarvel"
            )
            SwaggerPetstore().getUser(user)
        }
    }

    init {
        "Delete User" - {
            val user: User = User(
                "carol@marvel.com",
                "Lena",
                1,
                "Denvers",
                "somepassword",
                "77777777",
                0,
                "CaptainMarvel"
            )
            SwaggerPetstore().deleteUser(user)
        }
    }

}