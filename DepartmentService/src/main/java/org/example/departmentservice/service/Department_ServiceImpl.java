package org.example.departmentservice.service;

import lombok.RequiredArgsConstructor;
import org.example.departmentservice.entity.Department;
import org.example.departmentservice.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Department_ServiceImpl implements DepartmentService {
    private  final DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }
}
