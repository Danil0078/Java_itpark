package hw20.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

import hw20.dto.EmployeeList.Fields;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldNameConstants
@XmlRootElement(name = "employees")
public class EmployeeList {

    private List<Employee> employeeList;


}
