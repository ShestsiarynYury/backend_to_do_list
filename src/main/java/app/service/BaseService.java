package app.service;

public interface BaseService<T> {
    public T createOrUpdate(T dto);
    public T getById(Long id);
    public void deleteById(Long id);
}