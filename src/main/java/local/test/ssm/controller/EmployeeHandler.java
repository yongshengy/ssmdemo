package local.test.ssm.controller;

import local.test.ssm.entity.Employee;
import local.test.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeHandler {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value="/queryAll")
    public ModelAndView test(){
        List<Employee> list = employeeService.queryAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list", list);
        return modelAndView;
    }
}
