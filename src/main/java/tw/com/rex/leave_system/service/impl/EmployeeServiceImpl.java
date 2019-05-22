package tw.com.rex.leave_system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tw.com.rex.leave_system.mapper.EmployeeMapper;
import tw.com.rex.leave_system.model.dao.Employee;
import tw.com.rex.leave_system.service.EmployeeService;
import tw.com.rex.leave_system.util.EncryptUtils;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeMapper mapper;

    @Autowired
    public EmployeeServiceImpl(EmployeeMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public Employee register(Employee employee) {
        employee.setPassword(EncryptUtils.encrypt(employee.getPassword()));
        employee.setCreateDate(new Date());
        mapper.insertSelective(employee);
        return employee;
    }

    @Override
    public boolean deleteById(String id) {
        return mapper.deleteByPrimaryKey(id) == 1;
    }

    @Override
    public boolean updateById(Employee employee) {
        return mapper.updateSelectiveByPrimaryKey(employee) == 1;
    }

    @Override
    public Employee selectById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Employee> selectAll() {
        return mapper.selectAll();
    }

}
