package com._DSF.je.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @ManyToMany
    private List<Student> students;

    @OneToMany(mappedBy = "course")
    private List<Submission> submissions;

    public Course(String title, Teacher teacher) {
        this.title = title;
        this.teacher = teacher;
    }
}
