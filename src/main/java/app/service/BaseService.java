package app.service;

public interface BaseService<D, E> {
    public E create(D dto);
    public E getById(D dto);
    public E update(D dto);
    public void deleteById(D dto);
}