package programs;
import model.Student;
import srvices.StudentService;
import java.util.Scanner;

public class StudentProgram {
    private Student[] students = new Student[10];
    private int index = 0;
    private boolean isStart = true;
    private Student[] createdStudents;

    StudentService service = new StudentService();
    Scanner input = new Scanner(System.in);

    private void getCreatedStudents() {
        Student[] arr = new Student[index];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = students[i];
        }
        createdStudents = arr;
    }

    public void startProgram() {

        while (isStart) {
            System.out.println("******************** manu *****************");
            System.out.println("1: Enter a new student");
            System.out.println("2: Older student between two students");
            System.out.println("3: Youngest student in the array");
            System.out.println("4: Print all girl Students");
            System.out.println("5: Print youngest girl info");
            System.out.println("6: Exit");
            System.out.println("********************************************");

            System.out.print("please enter task code : ");
            int taskCode = input.nextInt();

            switch (taskCode) {
                case 1:
                    if (index < students.length - 1) {
                        students[index] = service.createStudent();
                        index++;
                        getCreatedStudents();
                    } else {
                        System.out.println("Students array is full");
                    }
                    break;
                case 2:
                    if (index > 1) {
                        System.out.println("*********** Oldest student ********");
                        service.getOlderBetweenTwo(createdStudents).printInfo();
                    } else {
                        System.out.println("please create more student ");
                    }
                    break;
                case 3:
                    if (index > 1) {
                        System.out.println("********** younger Student ***********");
                        service.getYoungestStudent(createdStudents).printInfo();
                    } else {
                        System.out.println("please create more student ");
                    }
                    break;
                case 4:
                    if (index > 1) {
                        System.out.println("*********** Girl students ************");
                        service.printAllGirlStudents(createdStudents);
                    } else {
                        System.out.println("please create more student ");
                    }
                    break;
                case 5:
                    if (index > 1) {
                        System.out.println("********** youngest girl student **********");
                        service.getYoungerGirlStudent(createdStudents).printInfo();
                    } else {
                        System.out.println("please create more student ");
                    }
                    break;
                case 6:
                    isStart = false;
                    break;
                default:
                    System.out.println("*** not found this task code please see manu ***");
            }
        }
    }
}
