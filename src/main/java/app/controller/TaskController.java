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

    @PostMapping()
    @ResponseBody
    public TaskDTO createOrUpdateTask(@RequestBody TaskDTO dto) {
        return this.taskService.createOrUpdate(dto);
    }

    @GetMapping(path = "/{id}")
    @ResponseBody
    public TaskDTO getTaskById(@PathVariable(name = "id", required = true) Long id) {
        return this.taskService.getById(id);
    }

    @GetMapping()
    @ResponseBody
    public List<TaskDTO> getAllTask() {
        return this.taskService.getAll();
    }

    @DeleteMapping(path = "/{id}")
    @ResponseBody
    public void deleteTaskById(@PathVariable(name = "id", required = true) Long id) {
        this.taskService.deleteById(id);
    }

    @GetMapping(path = "/page={page}/size={size}") // возвращает количество элементов по заданному размеру и странице
    @ResponseBody
    public List<TaskDTO> getPageOfTaskDTO(
        @PathVariable(name = "page", required = true) int page,
        @PathVariable(name = "size", required = true) int size) 
    {
        return this.taskService.getListDtoByPageAndSize(page, size);
    }

    @GetMapping(path = "/pages/size={size}") // возвращает количество страниц по заданному размеру
    @ResponseBody
    public Integer getTotalPages(
        @PathVariable(name = "size", required = true) Integer size) 
    {
        return this.taskService.getTotalPagesBySize(size);
    }
}