package com.finman.service;

import org.springframework.stereotype.Service;

import com.finman.repository.GenericDAO;

@Service
public abstract class GenericServiceImpl<E, K> implements GenericService<E, K> {

    private GenericDAO<E, K> genericDao;

    public GenericServiceImpl(GenericDAO<E, K> genericDao) {
        this.genericDao = genericDao;
    }

    public GenericServiceImpl() {}

    /*@Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveOrUpdate(E entity) {
        genericDao.saveOrUpdate(entity);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<E> getAll() {
        return genericDao.getAll();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public E get(K id) {
        return genericDao.find(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void add(E entity) {
        genericDao.add(entity);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void update(E entity) {
        genericDao.update(entity);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void remove(E entity) {
        genericDao.remove(entity);
    }*/
}
