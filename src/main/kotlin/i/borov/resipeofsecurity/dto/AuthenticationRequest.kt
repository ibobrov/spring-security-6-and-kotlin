package i.borov.resipeofsecurity.dto

data class AuthenticationRequest(
    val email: String,
    val password: String,
)
