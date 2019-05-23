package com.londonappbrewery.quizzler.models;

/**
 * Created by aluno on 22/05/19.
 */

public class TrueFalse {
    private int mQuestionID;
    private boolean mAnswer;

    public TrueFalse(int mQuestionID, boolean mAnswer) {
        this.mQuestionID = mQuestionID;
        this.mAnswer = mAnswer;
    }

    public int getQuestionID() {
        return this.mQuestionID;
    }

    public boolean isAnswer() {
        return this.mAnswer;
    }
}
