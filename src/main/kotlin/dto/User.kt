package dto

data class User(
    val email: String,
    val firstName: String,
    val id: Int,
    val lastName: String,
    val password: String,
    val phone: String,
    val userStatus: Int,
    val username: String
)