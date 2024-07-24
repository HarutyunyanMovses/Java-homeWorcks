package model;

public class Student {
    private String name;
    private String surname;
    private char gender;
    private int year;
    private double mark;

    public Student(String[] data) {
        name = data[0];
        surname = data[1];
        gender = data[2].charAt(0);
        year = Integer.parseInt(data[3]);
        mark = Double.parseDouble(data[4]);
    }

    public char getGender() {
        return gender;
    }

    public Student(String name, String surname, char gender, int year, double mark) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.year = year;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public double getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return (name + "," + surname + "," + (gender == 'F' ? "Female" : "Male") + "," + year + "," + mark);
    }
}
