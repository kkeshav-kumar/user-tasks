package com.example.taskapi.dao

import com.example.taskapi.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository:JpaRepository<User,Int> {
}