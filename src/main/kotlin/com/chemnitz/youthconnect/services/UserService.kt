package com.chemnitz.youthconnect.services

import com.chemnitz.youthconnect.dtos.UpdateUserDTO
import com.chemnitz.youthconnect.models.User
import com.chemnitz.youthconnect.repositories.UserRepository
import org.springframework.http.HttpStatus
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class UserService(private val repository: UserRepository) {

    fun createUser(user: User): User {
        return repository.save(user)
    }

    fun updateUser(userId: String, updatedUserDTO: UpdateUserDTO): User {
        val existingUser = repository.findById(userId).orElseThrow {
            ResponseStatusException(HttpStatus.NOT_FOUND, "User with ID $userId not found")
        }

        if (updatedUserDTO.newPassword != null && updatedUserDTO.oldPassword != null && updatedUserDTO.oldPassword!!.isNotBlank() && updatedUserDTO.newPassword!!.isNotBlank()) {
            if (existingUser.comparePassword(updatedUserDTO.oldPassword!!)) {

                existingUser.setPassword(updatedUserDTO.newPassword!!)
            } else {
                throw ResponseStatusException(HttpStatus.BAD_REQUEST, "Incorrect password")
            }
        }

        existingUser.status = updatedUserDTO.status.toString()
        existingUser.favoriteFacility = updatedUserDTO.favoriteFacility
        existingUser.homeAddress = updatedUserDTO.homeAddress
        return repository.save(existingUser)
    }

    fun deleteUser(userId: String) {
        val user = repository.findById(userId).orElseThrow {
            ResponseStatusException(HttpStatus.NOT_FOUND, "User with ID $userId not found")
        }
        user.status = "deleted"
        repository.save(user)
    }

    fun getAllUsers(): List<User> {
        return repository.findAll().toList()
    }

    fun getAllUsersByStatus(status: String): List<User> {
        return repository.findAllByStatus(status).toList()
    }

    fun getUserByEmail(email: String): User? {
        return repository.findByEmail(email)
    }

    fun getUserById(userId: String): User {
        return repository.findById(userId).orElseThrow {
            ResponseStatusException(HttpStatus.NOT_FOUND, "User with ID $userId not found")
        }
    }
}
