package com.example.taskapi.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Task(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var taskId: Int,
    var heading: String,
    var description: String,
    var priority: Int,
    var assignedUsers : Int
)