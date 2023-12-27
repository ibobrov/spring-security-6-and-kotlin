package i.borov.resipeofsecurity.dto

import java.util.UUID

data class UserResponse(
    val uuid: UUID,
    val email: String,
)
