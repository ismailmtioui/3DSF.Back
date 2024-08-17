package com._DSF.je.Entity;
import com._DSF.je.Enumeration.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Student extends User {

    @ManyToMany(mappedBy = "students")
    private List<Course> courses;

    public Student(String name, String email) {
        super(name, email, Role.STUDENT);
    }
}
