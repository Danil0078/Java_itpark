package hw20;

import hw20.dto.Department;
import hw20.dto.Employee;
import hw20.dto.Position;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class EmployeeRunner {

    private static final List<Department> DEPARTMENTS = List.of(
            new Department("IT", "samara"),
            new Department("Account", "samara"),
            new Department("Maintenance", "Samara"));

    private static final List<Position> POSITIONS = List.of(
            new Position("Developer",new BigDecimal(10000)),
            new Position("Tester", new BigDecimal(5000)),
            new Position("Main", new BigDecimal(1000)));

    public static void main(String[] args) {


        Employee ivanovVit = new Employee().setLogin("user1")
                .setFullName("Иванов Иван Иванович")
                .setTabNumber("1")
                .setDepartment(DEPARTMENTS.get(new Random().nextInt(DEPARTMENTS.size())))
                .setPosition(new Position("Director", new BigDecimal(2000)));

    }
}
