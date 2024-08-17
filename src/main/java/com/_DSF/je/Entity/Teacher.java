package com._DSF.je.Entity;

import com._DSF.je.Enumeration.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Teacher extends User {

    @OneToMany(mappedBy = "teacher")
    private List<Course> courses;

    public Teacher(String name, String email) {
        super(name, email, Role.TEACHER);
    }
}

