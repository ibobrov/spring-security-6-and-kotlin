package i.borov.resipeofsecurity.service

import i.borov.resipeofsecurity.repository.UserRepository
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

typealias ApplicationUser = i.borov.resipeofsecurity.model.User

@Service
class CustomUserDetailsService(
    private val userRepo: UserRepository
) : UserDetailsService {
    override fun loadUserByUsername(username: String): UserDetails =
        userRepo.findByEmail(username)
            ?.mapToUserDetails()
            ?: throw UsernameNotFoundException("Not found!")

    private fun ApplicationUser.mapToUserDetails(): UserDetails =
        User.builder()
            .username(this.email)
            .password(this.password)
            .roles(this.role.name)
            .build()
}