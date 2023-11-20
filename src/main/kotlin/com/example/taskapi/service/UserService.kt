package com.example.taskapi.service

import com.example.taskapi.dao.UserRepository
import com.example.taskapi.model.User
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {

    fun getAllUsers(): List<User> {
        return userRepository.findAll()
    }

    fun getUserById(userId: Int): User? {
        return userRepository.findById(userId).orElse(null)
    }

    fun addUser(user: User): User {
        return userRepository.save(user)
    }

    fun updateUser(userId: Int, updatedUser: User): User? {
        val existingUser = getUserById(userId)
        return if (existingUser != null) {
            existingUser.username = updatedUser.username
            userRepository.save(existingUser)
        } else {
            null
        }
    }

    fun deleteUser(userId: Int): Boolean {
        return if (userRepository.existsById(userId)) {
            userRepository.deleteById(userId)
            true
        } else {
            false
        }
    }
}