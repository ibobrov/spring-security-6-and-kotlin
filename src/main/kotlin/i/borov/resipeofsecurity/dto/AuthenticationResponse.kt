package i.borov.resipeofsecurity.dto

data class AuthenticationResponse(
    val accessToken: String,
    val refreshToken: String,
)