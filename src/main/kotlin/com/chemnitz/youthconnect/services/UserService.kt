package com.chemnitz.youthconnect.services

import com.chemnitz.youthconnect.models.User
import com.chemnitz.youthconnect.repositories.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val repository: UserRepository) {

    fun createUser(user: User): User {
        return repository.save(user)
    }

    fun updateUser(userId: String, updatedUser: User): User {
        val existingUser = repository.findById(userId)
        if (existingUser.isPresent) {
            val userToUpdate = existingUser.get()
            userToUpdate.favoriteFacility = updatedUser.favoriteFacility
            userToUpdate.homeAddress = updatedUser.homeAddress
            return repository.save(userToUpdate)
        } else {
            throw RuntimeException("User with ID $userId not found")
        }
    }

    fun deleteUser(userId: String) {
        val user = repository.findById(userId).orElseThrow {
            RuntimeException("User with ID $userId not found")
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
        val existingUser = repository.findById(userId)
        if (existingUser.isPresent) {
            return existingUser.get()
        } else {
            throw RuntimeException("User with ID $userId not found")
        }
    }
}
