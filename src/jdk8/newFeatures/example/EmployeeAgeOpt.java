package jdk8.newFeatures.example;

import java.util.List;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-07-09 21:09
 */
public class EmployeeAgeOpt implements EmployeeOpt {
    @Override
    public boolean isOpt(Employee employees) {
        if(employees.getAge()>=25){
          return true;
        }
        return false;
    }
}
