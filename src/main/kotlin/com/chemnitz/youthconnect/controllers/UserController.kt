package com.chemnitz.youthconnect.controllers

import com.chemnitz.youthconnect.dtos.UpdateUserDTO
import com.chemnitz.youthconnect.models.User
import com.chemnitz.youthconnect.services.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("users")
class UserController(private val userService: UserService) {

    @PostMapping
    fun createUser(@RequestBody user: User): ResponseEntity<User> {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(user))
    }

    @GetMapping
    fun getAllUsers(): ResponseEntity<List<User>> {
        return ResponseEntity.ok(userService.getAllUsers())
    }

    @GetMapping("active")
    fun getActiveUsers(): ResponseEntity<List<User>> {
        return ResponseEntity.ok(userService.getAllUsersByStatus("active"))
    }

    @GetMapping("deleted")
    fun getDeletedUsers(): ResponseEntity<List<User>> {
        return ResponseEntity.ok(userService.getAllUsersByStatus("deleted"))
    }

    @PutMapping
    fun updateUser(@RequestBody updatedUserDTO: UpdateUserDTO): User {
        return userService.updateUser(updatedUserDTO._id!!, updatedUserDTO)
    }

    @DeleteMapping("{userId}")
    fun deleteUser(@PathVariable userId: String): ResponseEntity<Void> {
        userService.deleteUser(userId)
        return ResponseEntity.noContent().build()
    }

    @GetMapping("{userId}")
    fun getUserById(@PathVariable userId: String): ResponseEntity<User> {
        return ResponseEntity.ok(userService.getUserById(userId))
    }
}
