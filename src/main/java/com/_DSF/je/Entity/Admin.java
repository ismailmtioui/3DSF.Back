package com._DSF.je.Entity;

import com._DSF.je.Enumeration.Role;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Admin extends User {

    public Admin(String name, String email) {
        super(name, email, Role.ADMIN);
    }
}

