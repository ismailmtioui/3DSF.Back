package com._DSF.je.Entity;

import com._DSF.je.Enumeration.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private byte[] img;
    private String password ;

    @Enumerated(EnumType.STRING)
    private Role role;

    public User(String name, String email, Role role, byte[] img) {
    }
}