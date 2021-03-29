package app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import app.dto.TaskDTO;
import app.mapper.impl.TaskMapperImpl;
import app.model.Task;
import app.repository.TaskRepositoryImpl;
import app.service.BaseService;

@Service
public class TaskServiceImpl implements BaseService<TaskDTO> {
    @Autowired
    private TaskRepositoryImpl taskRepository;
    @Autowired
    private TaskMapperImpl taskMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public TaskDTO createOrUpdate(TaskDTO dto) {
        return this.taskMapper.toDto(this.taskRepository.save(this.taskMapper.toEntity(dto)));
    }

    @Override
    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    public TaskDTO getById(Long id) throws IllegalArgumentException {
        return this.taskMapper.toDto(this.taskRepository.findById(id).get());
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteById(Long id) {  
        this.taskRepository.deleteById(id);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public List<TaskDTO> getListDtoByPageAndSize(Integer page, Integer size) {
        List<TaskDTO> dtos = new ArrayList();
        for (Task t : this.taskRepository.findAll(PageRequest.of(page, size)).toList()) {
            dtos.add(this.taskMapper.toDto(t));
        }
         
        return dtos;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Integer getTotalPagesBySize(Integer size) {
        return this.taskRepository.findAll(PageRequest.of(0, size)).getTotalPages();
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public List<TaskDTO> getAll() {
        List<TaskDTO> dtos = new ArrayList();
        for (Task t : this.taskRepository.findAll()) {
            dtos.add(this.taskMapper.toDto(t));
        }

        return dtos;
    }
}