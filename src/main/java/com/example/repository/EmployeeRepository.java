package com.example.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Employee;


@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// 名前が一致した人をすべて取得する
    public List<Employee> findByName(String name);

    // 名前が一致した最初の人を取得する
    public Optional<Employee> findFirstByNameOrderByIdAsc(String name);

}
