package com.chemnitz.youthconnect.controllers

import com.chemnitz.youthconnect.models.User
import com.chemnitz.youthconnect.services.UserService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("users")
@Tag(name = "Users", description = "Rest API for users")
class UserController(private val userService: UserService) {

    @Operation(summary = "Display greeting message to admin user")
    @ApiResponses(
        value = [ApiResponse(
            responseCode = "200",
            description = "OK"
        ), ApiResponse(responseCode = "401", description = "You are not authorized access the resource"), ApiResponse(
            responseCode = "404",
            description = "The resource not found"
        )]
    )
    @PostMapping
    fun createUser(@RequestBody user: User): User {
        return userService.createUser(user)
    }

    @GetMapping
    fun getAllUsers(): List<User> {
        return userService.getAllUsers()
    }

    @GetMapping("active")
    fun getActiveUsers(): List<User> {
        return userService.getAllUsersByStatus("active")
    }

    @GetMapping("deleted")
    fun getDeletedUsers(): List<User> {
        return userService.getAllUsersByStatus("deleted")
    }

    @PutMapping
    fun updateUser(@RequestBody updatedUser: User): User {
        return userService.updateUser(updatedUser._id!!, updatedUser)
    }

    @DeleteMapping("{userId}")
    fun deleteUser(@PathVariable userId: String) {
        userService.deleteUser(userId)
    }


    @GetMapping("{userId}")
    fun getUserById(@PathVariable userId: String): User {
        return userService.getUserById(userId)
    }
}
