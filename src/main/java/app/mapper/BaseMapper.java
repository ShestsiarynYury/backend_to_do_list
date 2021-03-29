package app.mapper;

public interface BaseMapper<E, D> {
    public D toDto(E entity);
    public E toEntity(D dto);
}