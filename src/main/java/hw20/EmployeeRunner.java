package hw20;

import hw20.dto.Department;
import hw20.dto.Employee;
import hw20.dto.EmployeeList;
import hw20.dto.Position;

import javax.xml.bind.JAXB;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Collection;

public class EmployeeRunner {

    private static final List<Department> DEPARTMENTS = List.of(
            new Department("IT", "samara"),
            new Department("Account", "samara"),
            new Department("Maintenance", "Samara"));

    private static final List<Position> POSITIONS = List.of(
            new Position("Developer",new BigDecimal(10000)),
            new Position("Tester", new BigDecimal(5000)),
            new Position("Main", new BigDecimal(1000)));

    private static int COUNTER = 1;




    public static void main(String[] args) {
        EmployeeList employees = new EmployeeList(List.of(
                    getEmployee("Иванов Иван Иванович"),
                        getEmployee("Петров Петр Петрович"),
                        getEmployee("Сидорова Сида Сидорович")
                        ));
        Path path = Paths.get("C:\\test\\employee.xml");
        Path parentPath = path.getParent();
        if (!parentPath.getParent().toFile().exists()){
            parentPath.toFile().mkdir();
        }
        JAXB.marshal(employees, path.toFile());
    }

    private static Employee getEmployee(String fullName) {
        return new Employee().setLogin("user" + COUNTER++)
                .setFullName(fullName)
                .setTabNumber(new Random().nextInt(100_000) + "")
                .setDepartment(DEPARTMENTS.get(new Random().nextInt(DEPARTMENTS.size())))
                .setPosition(POSITIONS.get(new Random().nextInt((POSITIONS.size()))));
    }
}
