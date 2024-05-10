package com.fuzzy.fuzzydemo.mytest;

public class FuzzyResponse {
    private String soundOld;
    private String soundNew;
    private int fuzzyScore;

    public FuzzyResponse(String soundOld, String soundNew, int fuzzyScore) {
        this.soundOld = soundOld;
        this.soundNew = soundNew;
        this.fuzzyScore = fuzzyScore;
    }

    public String getSoundOld() {
        return soundOld;
    }

    public void setSoundOld(String soundOld) {
        this.soundOld = soundOld;
    }

    public String getSoundNew() {
        return soundNew;
    }

    public void setSoundNew(String soundNew) {
        this.soundNew = soundNew;
    }

    public int getFuzzyScore() {
        return fuzzyScore;
    }

    public void setFuzzyScore(int fuzzyScore) {
        this.fuzzyScore = fuzzyScore;
    }
}
