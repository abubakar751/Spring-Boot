package com.sb.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.test.entity.TestEntity;

public interface TestRepo extends JpaRepository<TestEntity, Integer> {

}
