package com.chemnitz.youthconnect.controllers

import com.chemnitz.youthconnect.models.User
import com.chemnitz.youthconnect.services.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {

    @PostMapping
    fun createUser(@RequestBody user: User): User {
        return userService.createUser(user)
    }

    @GetMapping
    fun getAllUsers(): List<User> {
        return userService.getAllUsers()
    }

    @GetMapping("/active")
    fun getActiveUsers(): List<User> {
        return userService.getAllUsersByStatus("active")
    }

    @GetMapping("/deleted")
    fun getDeletedUsers(): List<User> {
        return userService.getAllUsersByStatus("deleted")
    }

    @PutMapping
    fun updateUser(@RequestBody updatedUser: User): User {
        return userService.updateUser(updatedUser._id!!, updatedUser)
    }

    @DeleteMapping("/{userId}")
    fun deleteUser(@PathVariable userId: String) {
        userService.deleteUser(userId)
    }


    @GetMapping("/{userId}")
    fun getUserById(@PathVariable userId: String): User {
        return userService.getUserById(userId)
    }
}
