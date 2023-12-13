package com.example.taskapi.dao

import com.example.taskapi.model.Task
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface TaskRepository:JpaRepository<Task,Int>{

}