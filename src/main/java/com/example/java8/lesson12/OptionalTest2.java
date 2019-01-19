package com.example.java8.lesson12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @Author: chenglvpeng
 * @Date: 2018/12/7  14:07
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class OptionalTest2 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("zhangsan");
        Employee employee2 = new Employee();
        employee2.setName("lisi");

        Company company = new Company();
        company.setName("company");

        List<Employee> employees = Arrays.asList(employee,employee2);
        //company.setEmployees(employees);

        List<Employee> list = company.getEmployees();

        Optional<Company> optional = Optional.ofNullable(company);
        System.out.println(optional.map(theCompany -> theCompany.getEmployees()).orElse(Collections.emptyList()));
    }
}
