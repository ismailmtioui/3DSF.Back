package com._DSF.je.Entity;

/**
 * @author amz
 **/
public enum CorrectAnswer {
    ONE(1), TWO(2), THREE(3), FOUR(4);

    private final int value;

    CorrectAnswer(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
