package hw20.dto;


import lombok.Data;
import lombok.experimental.Accessors;

import javax.xml.bind.annotation.XmlElement;

@Data
@Accessors(chain = true)
public class Employee {

    private String tabNumber;
    private String login;
    private String fullName;
    private Department department;
    private Position position;
}
