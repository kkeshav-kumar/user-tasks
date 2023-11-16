package com.example.taskapi.dao

import com.example.taskapi.model.Task
import org.springframework.data.jpa.repository.JpaRepository

interface TaskRepository:JpaRepository<Task,Int>{
}