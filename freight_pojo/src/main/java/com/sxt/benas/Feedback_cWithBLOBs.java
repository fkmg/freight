package com.sxt.benas;

public class Feedback_cWithBLOBs extends Feedback_c {
    private String content;

    private String solveMethod;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getSolveMethod() {
        return solveMethod;
    }

    public void setSolveMethod(String solveMethod) {
        this.solveMethod = solveMethod == null ? null : solveMethod.trim();
    }
}