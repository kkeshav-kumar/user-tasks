package com.example.taskapi.service

import com.example.taskapi.dao.TaskRepository
import com.example.taskapi.model.Task
import org.springframework.stereotype.Service

@Service
class TaskService(private val taskRepository: TaskRepository, private val userService: UserService){

    fun getAllTasks():List<Task>{
        return taskRepository.findAll()
    }

    fun getTasksById(taskId:Int):Task?{
        return taskRepository.findById(taskId).orElse(null)
    }

    fun addTask(task: Task):Task{
        return taskRepository.save(task)
    }

//    fun updateTask(taskId: Int,updateTask: Task):Task?{
//        val existingTask = getTasksById(taskId)
//        return if (existingTask!=null){
//            existingTask.description = updateTask.description
//            existingTask.assignedUserId = updateTask.assignedUserId
//            taskRepository.save(existingTask)
//        }else{
//            null
//        }
//    }
    fun deleteTask(taskId: Int):Boolean{
        return if (taskRepository.existsById(taskId)){
            taskRepository.deleteById(taskId)
            true
        }
        else{
            false
        }
    }

//    fun assignTask(taskId: Int,userId:Int): Task?{
//
//    }
}