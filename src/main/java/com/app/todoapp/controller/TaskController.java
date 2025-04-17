package com.app.todoapp.controller;

import com.app.todoapp.models.Task;
import com.app.todoapp.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @GetMapping
    public String getTasks(Model model) {
        List<Task> tasks=taskService.getAllTasks();
        tasks.forEach(System.out::println);
        model.addAttribute("tasks", tasks);
        return "tasks";
    }
}
