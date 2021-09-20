package spaceStation.repositories;

import java.util.List;

public interface Repository<T> {
    List<T> getModels();

    void add(T model);

    boolean remove(T model);

    T findByName(String name);
}
