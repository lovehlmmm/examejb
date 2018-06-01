package com.exam.ejb.model;

import com.exam.ejb.entity.Employees;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SpringModel extends PagingAndSortingRepository<Employees, Integer> {


}
