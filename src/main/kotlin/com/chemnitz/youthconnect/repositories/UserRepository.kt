package com.chemnitz.youthconnect.repositories

import com.chemnitz.youthconnect.models.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository : MongoRepository<User, String> {
    fun findByEmail(email: String): User?
    fun findAllByStatus(status: String): List<User>
}
