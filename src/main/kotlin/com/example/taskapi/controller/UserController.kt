package com.example.taskapi.controller

import com.example.taskapi.model.Users
import com.example.taskapi.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/users")
class UserController(private val userService: UserService) {

    @GetMapping
    fun getAllUsers(): List<Users> {
        return userService.getAllUsers()
    }

    @GetMapping("/{userId}")
    fun getUserById(@PathVariable userId: Int): ResponseEntity<Users> {
        val user = userService.getUserById(userId)
        return if (user != null) {
            ResponseEntity.ok(user)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @PostMapping
    fun addUser(@RequestBody user: Users): ResponseEntity<Users> {
        val createdUser = userService.addUser(user)
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser)
    }

    @PutMapping("/{userId}")
    fun updateUser(@PathVariable userId: Int, @RequestBody updatedUser: Users): ResponseEntity<Users> {
        val user = userService.updateUser(userId, updatedUser)
        return if (user != null) {
            ResponseEntity.ok(user)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @DeleteMapping("/{userId}")
    fun deleteUser(@PathVariable userId: Int): ResponseEntity<Void> {
        val success = userService.deleteUser(userId)
        return if (success) {
            ResponseEntity.noContent().build()
        } else {
            ResponseEntity.notFound().build()
        }
    }
}