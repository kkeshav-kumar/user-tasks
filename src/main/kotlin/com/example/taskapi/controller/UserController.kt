package com.example.taskapi.controller

import com.example.taskapi.model.User
import com.example.taskapi.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/users")
class UserController(private val userService: UserService) {

    @GetMapping
    fun getAllUsers(): List<User> {
        return userService.getAllUsers()
    }

    @GetMapping("/{userId}")
    fun getUserById(@PathVariable userId: Int): User? {
        return userService.getUserById(userId)
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun addUser(@RequestBody user: User): User {
        return userService.addUser(user)
    }

    @PutMapping("/{userId}")
    fun updateUser(@PathVariable userId: Int, @RequestBody updatedUser: User): User? {
        return userService.updateUser(userId, updatedUser)
    }

    @DeleteMapping("/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteUser(@PathVariable userId: Int) {
        userService.deleteUser(userId)
    }
}
