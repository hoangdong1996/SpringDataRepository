package com.codegym.service;

import com.codegym.model.Blog;

public interface IGeneralService<E> {

    E findById(Long id);

    void save(E e);

    void remove(Long id);
}
