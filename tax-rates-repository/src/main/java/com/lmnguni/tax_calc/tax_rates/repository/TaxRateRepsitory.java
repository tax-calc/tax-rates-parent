package com.lmnguni.tax_calc.tax_rates.repository;

import com.lmnguni.tax_calc.tax_rates.model.BaseEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class TaxRateRepsitory<T extends BaseEntity> {

    public T save(T entity) {
        if (entity.getId() == null) {
            return this.add(entity);
        }
        return this.edit(entity);
    }

    private T add(T entity) {
        getEntityManager().persist(entity);
        getEntityManager().flush();
        return entity;
    }

    private T edit(T entity) {
        return getEntityManager().merge(entity);
    }

    private T get(Integer id) {
        return getEntityManager().find(getEntityClass(), id);
    }

    protected EntityManager getEntityManager() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tax-rates-unit");
        return entityManagerFactory.createEntityManager();
    }

    protected abstract Class<T> getEntityClass();
}
