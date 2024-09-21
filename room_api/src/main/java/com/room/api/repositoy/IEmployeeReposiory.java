package com.room.api.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.room.api.model.Employee_mdl;

public interface IEmployeeReposiory extends JpaRepository<Employee_mdl, Integer> {

}
