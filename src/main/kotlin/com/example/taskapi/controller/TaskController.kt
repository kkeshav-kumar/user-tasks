package com.example.taskapi.controller

import com.example.taskapi.model.Task
import com.example.taskapi.service.TaskService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/tasks")
class TaskController(private val taskService: TaskService) {

    @GetMapping
    fun getAllTask(): List<Task>{
        return taskService.getAllTasks()
    }

    @GetMapping("/{taskId}")
    fun getTaskById(@PathVariable taskId: Int):Task?{
        return taskService.getTasksById(taskId)
    }

    @PostMapping
    fun addTask(@RequestBody task: Task):Task{
        return taskService.addTask(task)
    }

    @PutMapping("/{taskId}")
    fun updateTask(@PathVariable taskId: Int, @RequestBody updateTask: Task):Task?{
        return taskService.updateTask(taskId, updateTask)
    }

    @DeleteMapping("/{taskId}")
    fun deleteTask(@PathVariable taskId:Int): Boolean{
        return taskService.deleteTask(taskId)
    }

    @PostMapping("/{taskId}/assign/{userId}")
    fun assignTask(@PathVariable taskId: Int, @PathVariable assignedUsers: Int): Task? {
        return taskService.assignTask(taskId, assignedUsers)
    }
}