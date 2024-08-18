package com._DSF.je.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author amz
 * @version 1.0
 *
 **/

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Question {
    @Id
    private Long id;
    private String question;

    private String option1;
    private String option2;
    private String option3;
    private String option4;

    @Enumerated(EnumType.STRING)
    private CorrectAnswer correctAnswer;

    boolean isCorrect(String answer) {
        return correctAnswer.toString().equals(answer);
    }
    String getCorrectAnswer() {
        return correctAnswer.toString();
    }

}
