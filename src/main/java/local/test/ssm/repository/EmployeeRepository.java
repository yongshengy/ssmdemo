package local.test.ssm.repository;

import local.test.ssm.entity.Employee;

import java.util.List;

public interface EmployeeRepository {

    public List<Employee> queryAll();
}
