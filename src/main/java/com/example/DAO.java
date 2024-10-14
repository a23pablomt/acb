package com.example;

import java.util.List;

/**
 * DAO
 */
public interface DAO<T, K> {
    T get(K id);
    List<T> getAll();
    boolean save(T obxecto);
    boolean delete(T obx);
    boolean deleteAll();
    boolean deleteById(K id);
    void update(T obx);
    
}