package app.mapper.impl;

import org.springframework.stereotype.Component;

import app.dto.TaskDTO;
import app.exception.BadValuePriorityException;
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
        TaskDTO taskDTO = new TaskDTO();
        taskDTO.setId(entity.getId());
        taskDTO.setName(entity.getName());
        taskDTO.setDateBegin(entity.getDateBegin());
        taskDTO.setDateEnd(entity.getDateEnd());
        if (entity.getPriority().name().equals("LOW")) {
            taskDTO.setPriority("LOW");
        }
        else if (entity.getPriority().name().equals("MEDIUM")) {
            taskDTO.setPriority("MEDIUM");
        }
        else if (entity.getPriority().name().equals("HIGH")) {
            taskDTO.setPriority("HIGH");
        } else {
            throw new BadValuePriorityException();
        }
        taskDTO.setReady(entity.isReady());

        return taskDTO;
    }

    @Override
    public Task toEntity(TaskDTO dto) {
        if (dto == null) {
            return null;
        }
        Task task = new Task();
        task.setId(dto.getId());
        task.setName(dto.getName());
        if (dto.getPriority().equals("LOW")) {
            task.setPriority(Priority.LOW);
        }
        else if (dto.getPriority().equals("MEDIUM")) {
            task.setPriority(Priority.MEDIUM);
        }
        else if (dto.getPriority().equals("HIGH")) {
            task.setPriority(Priority.HIGH);
        } else {
            throw new BadValuePriorityException();
        }
        task.setDateBegin(dto.getDateBegin());
        task.setDateEnd(dto.getDateEnd());
        task.setReady(dto.isReady());

        return task;
    }
}