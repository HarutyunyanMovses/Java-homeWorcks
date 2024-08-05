package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    public static List<Student> createStudents(List<String> data) throws Exception {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).split(",").length >= 5) {
                students.add(new Student(data.get(i).split(",")));
                FilesService.convert("src\\files\\" + students.get(i).getName() + ".txt", students.get(i).toString());
            }
        }
        return students;
    }

    public static Student getYoungestStudent(List<Student> students) {
        Student youngest = students.get(0);
        for (int i = 1; i < students.size(); i++) {
            if (youngest.getYear() < students.get(i).getYear()) {
                youngest = students.get(i);
            }
        }
        return youngest;
    }

    public static Student getYoungerGirlStudent(List<Student> students) {
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

    public static List<Student> sortStudentsbyYear(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).getYear() < students.get(j).getYear()) {
                    Student min = students.remove(i);
                    students.add(i,students.get(j));
                    students.remove(j);
                    students.add(j,min);
                }
            }
        }
        return students;
    }
}
