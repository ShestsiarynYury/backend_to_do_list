package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import app.dto.TaskDTO;
import app.service.impl.TaskServiceImpl;

@Controller
@RequestMapping(path = "/tasks")
public class TaskController {
    @Autowired
    private TaskServiceImpl taskService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseBody
    public TaskDTO createOrUpdateTask(@RequestBody TaskDTO dto) {
        System.out.println(dto);
        return this.taskService.createOrUpdate(dto);
    }

    @GetMapping(path = "/{id}", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public TaskDTO getTaskById(@PathVariable(name = "id", required = true) Long id) {
        return this.taskService.getById(id);
    }

    @GetMapping(consumes = "application/json", produces = "application/json")
    @ResponseBody
    public List<TaskDTO> getAllTasks() {
        return this.taskService.getAll();
    }

    @DeleteMapping(path = "/{id}", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public void deleteTaskById(@PathVariable(name = "id", required = true) Long id) {
        this.taskService.deleteById(id);
    }

    @GetMapping(path = "/page={page}/size={size}", consumes = "application/json", produces = "application/json") // возвращает количество элементов по заданному размеру и странице
    @ResponseBody
    public List<TaskDTO> getCertainPageOfTasksBySize(
        @PathVariable(name = "page", required = true) int page,
        @PathVariable(name = "size", required = true) int size) 
    {
        return this.taskService.getListDtoByPageAndSize(page, size);
    }

    @GetMapping(path = "/pages/size={size}", consumes = "application/json", produces = "application/json") // возвращает количество страниц по заданному размеру
    @ResponseBody
    public Integer getTotalPagesOfTasks(
        @PathVariable(name = "size", required = true) Integer size) 
    {
        return this.taskService.getTotalPagesBySize(size);
    }
}