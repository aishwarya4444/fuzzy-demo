package com.fuzzy.fuzzydemo.mytest;

public class Names {
    private String oldName;
    private String newName;

    public Names(String oldName, String newName) {
        this.oldName = oldName;
        this.newName = newName;
    }

    public String getOldName() {
        return oldName;
    }

    public String getNewName() {
        return newName;
    }

    @Override
    public String toString() {
        return "Names{" +
                "oldName='" + oldName + '\'' +
                ", newName='" + newName + '\'' +
                '}';
    }
}
