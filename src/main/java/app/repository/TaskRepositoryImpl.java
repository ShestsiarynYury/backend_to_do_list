package app.repository;

import org.springframework.stereotype.Repository;

import app.model.Task;

@Repository
public interface TaskRepositoryImpl extends BaseRepository<Task> {
    
}
