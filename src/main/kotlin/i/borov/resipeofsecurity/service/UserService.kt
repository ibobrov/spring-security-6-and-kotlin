package i.borov.resipeofsecurity.service

import i.borov.resipeofsecurity.model.User
import i.borov.resipeofsecurity.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class UserService(
    private val userRepo: UserRepository
) {

    fun createUser(user: User): User? {
        val found = userRepo.findByEmail(user.email)

        return if (found == null) {
            userRepo.save(user)
            user
        } else null
    }

    fun findById(uuid: UUID): User? =
        userRepo.findByUUID(uuid)

    fun findAll() =
        userRepo.findAll()

    fun deleteByUUID(uuid: UUID): Boolean =
        userRepo.deleteByUUID(uuid)
}