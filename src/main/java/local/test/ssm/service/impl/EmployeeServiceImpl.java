package local.test.ssm.service.impl;

import local.test.ssm.entity.Employee;
import local.test.ssm.repository.EmployeeRepository;
import local.test.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> queryAll() {
        return employeeRepository.queryAll();
    }
}
