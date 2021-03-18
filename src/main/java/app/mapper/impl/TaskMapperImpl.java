package app.mapper.impl;

import org.springframework.stereotype.Component;

import app.dto.TaskDTO;
import app.mapper.BaseMapper;
import app.model.Task;
import app.model.util.Priority;

@Component
public class TaskMapperImpl implements BaseMapper<Task, TaskDTO> {

    @Override
    public TaskDTO toDto(Task entity) {
        if (entity == null) {
            return null;
        }

        
        return null;
    }

    @Override
    public Task toEntity(TaskDTO dto) throws IllegalArgumentException {
        if (dto == null) {
            return null;
        }
        Task task = new Task();
        task.setName(dto.getName());
        if (dto.getPriority() == "LOW") {
            task.setPriority(Priority.LOW);
        }
        else if (dto.getPriority() == "MEDIUM") {
            task.setPriority(Priority.MEDIUM);
        }
        else if (dto.getPriority() == "HIGH") {
            task.setPriority(Priority.HIGH);
        } else {
            throw new IllegalArgumentException();
        }
        task.setTimeBegin(dto.getTimeBegin());
        task.setTimeEnd(dto.getTimeEnd());

        return task;
    }
}