package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapdemo3 {
    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(

                new Employee(001 , "Andydorsty" , 20000),
                new Employee(001 , "Andydorsty" , 20000),
                new Employee(002 , "Catherine" , 6000),
                new Employee(003 , "Modhesty" , 5000),
                new Employee(004 , "Serwaa" , 300),
                new Employee(005 , "Koo Nimo" , 2000)
        );

        List<Integer> employeeSalary = new ArrayList<>();

           employeeSalary = employeeList.stream().filter(e -> e.getSalary() > 1000).map(e -> e.getSalary()).collect(Collectors.toList());
            System.out.println(employeeSalary);
    }
}
