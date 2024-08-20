package com._DSF.je.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CourseSource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long videoID;
    private String courseName;
    private String videoSource;
    private String filePath;
    private String contentType;
    private String videoDescription;
    private String videoTitle;
}
