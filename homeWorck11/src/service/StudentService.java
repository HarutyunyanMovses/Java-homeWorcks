package service;

import model.Student;

public class StudentService {

    public static Student[] createStudents(String[] data) throws Exception {
        Student[] students = new Student[data.length];
        for (int i = 0; i < data.length; i++) {
            if (data[i].split(",").length >= 5) {
                students[i] = new Student(data[i].split(","));
                FilesService.convert("src\\files\\" + students[i].getName() + ".txt", students[i].toString());
            }
        }
        return students;
    }

    public static Student getYoungestStudent(Student[] students) {
        Student youngest = students[0];
        for (int i = 1; i < students.length; i++) {
            if (youngest.getYear() < students[i].getYear()) {
                youngest = students[i];
            }
        }
        return youngest;
    }

    public static Student getYoungerGirlStudent(Student[] students) {
        Student younger = null;
        for (Student item : students) {
            char gen = item.getGender();
            int yer = item.getYear();
            if ((gen == 'f' || gen == 'F') && younger == null) {
                younger = item;
            } else if ((gen == 'f' || gen == 'F') && yer > younger.getYear()) {
                younger = item;
            }
        }
        return younger;
    }

    public static Student[] sortStudentsbyYear(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getYear() < students[j].getYear()) {
                    Student min = students[i];
                    students[i] = students[j];
                    students[j] = min;
                }
            }
        }
        return students;
    }
}
