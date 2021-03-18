package app.service.impl;

import org.springframework.stereotype.Service;

import app.dto.TaskDTO;
import app.model.Task;
import app.service.BaseService;

@Service
public class TaskServiceImpl implements BaseService<Task, TaskDTO> {

    @Override
    public TaskDTO create(Task dto) {
        return null;
    }

    @Override
    public TaskDTO getById(Task dto) {
        return null;
    }

    @Override
    public TaskDTO update(Task dto) {
        return null;
    }

    @Override
    public void deleteById(Task dto) {

    }
}
