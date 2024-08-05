import model.Student;
import service.FilesService;
import service.StudentService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static String STUDENTS_LIST_URL = "src\\files\\studentsList.txt";
    public static String FILES_LOCATION_URL = "src\\files\\";

    public static void main(String[] args) throws Exception {

        List<String> data = FilesService.read(STUDENTS_LIST_URL);
        List<Student> students = StudentService.createStudents(data);
        Student young = StudentService.getYoungestStudent(students);
        FilesService.write(STUDENTS_LIST_URL, "\nThe youngest student of students is " + young.toString() + "\n");
        Student younger = StudentService.getYoungerGirlStudent(students);
        FilesService.write(STUDENTS_LIST_URL, "\nThe youngest girl is " + younger.toString() + "\n");
        List<Student> sort = StudentService.sortStudentsbyYear(students);
        for (Student s : sort) {
            FilesService.write(STUDENTS_LIST_URL, ("\n" + s.getName() + " " + s.getSurname() + " " + s.getYear() + ", "));
        }

        boolean start = true;
        Scanner input = new Scanner(System.in);

        while (start) {

            System.out.println("Enter 0 for Exit");
            int code = input.nextInt();

            switch (code) {
                case 0: {
                    FilesService.dell(STUDENTS_LIST_URL, FILES_LOCATION_URL, students);
                    start = false;
                    break;
                }
            }
        }

    }
}