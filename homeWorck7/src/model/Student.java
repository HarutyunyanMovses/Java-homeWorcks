package model;

public class Student {
    private String name;
    private String surName;
    private int birdYear;
    private double mark;
    private char gender;
    private boolean isPhd;

    public Student(String name, String surName, int birdYear, double mark, char gender, boolean isPhd) {
        this.surName = surName;
        this.name = name;
        this.birdYear = birdYear;
        this.mark = mark;
        this.gender = gender;
        this.isPhd = isPhd;
    }

    //************************* Setters *************************
    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setBirdYear(int birdYear) {
        this.birdYear = birdYear;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setPHD(boolean isPhd) {
        this.isPhd = isPhd;
    }
//************************* getters *************************


    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getBirdYear() {
        return birdYear;
    }

    public double getMark() {
        return mark;
    }

    public char getGender() {
        return gender;
    }

    public boolean isPHD() {
        return isPhd;
    }
    //*********************** other functions ********************

    public void printInfo() {
        System.out.println("name : " + name);
        System.out.println("surname : " + surName);
        System.out.println("birdYear : " + birdYear);
        System.out.println("mark : " + mark);
        System.out.println("gender : " + (gender == 'f' || gender == 'F' ? "female" : "male"));
        System.out.println("isPHD : " + (isPhd ? "Yes" : "No"));

    }

}


