package models.dao;

import models.entites.Department;

import java.util.List;

public interface DepartmenteDao {
    void insert (Department obj);
    void update (Department obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List <Department> findAll();
}
