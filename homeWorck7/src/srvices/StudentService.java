package srvices;
import model.Student;
import java.util.Scanner;

public class StudentService {
    Scanner input = new Scanner(System.in);

    private char validGender() {
        char s = '[';
        boolean bool = true;
        while (bool) {
            if (s == 'f' || s == 'F' || s == 'm' || s == 'M') {
                bool = false;
            } else {
                System.out.println("please enter male or female");
                System.out.print("gender : ");
                s = input.next().charAt(0);
            }
        }
        return s;
    }

    private boolean validIsPHD() {
        String s = "";
        boolean bool = true;
        while (bool) {
            if (s.equals("yes") || s.equals("Yes") || s.equals("no") || s.equals("No")) {
                bool = false;
            } else {
                System.out.println("please enter Yes or No");
                System.out.print("isPHD : ");
                s = input.next();
            }
        }
        return (s.equals("yes") || s.equals("Yes"));
    }

        public Student createStudent () {
            System.out.print("Enter name : ");
            String name = input.next();
            System.out.print("Enter surName :");
            String surName = input.next();
            System.out.print("Enter birdYear : ");
            int birdYear = input.nextInt();
            System.out.print("Enter mark : ");
            double mark = input.nextDouble();
            //**************8 gender **************
            char gender = validGender();
            //************** isPHD *****************
            boolean isPHD = validIsPHD();

            return new Student(name, surName, birdYear, mark, gender, isPHD);
        }

        public Student getOlderBetweenTwo (Student[]students){
            boolean bool = true;
            Student older = null;
            System.out.println(" student names is : ");
            for (Student item : students) {
                System.out.print(", " + item.getName());
            }
            while (bool){
                System.out.println();
                System.out.print("Enter name of Student 1 : ");
                String name1 = input.next();
                System.out.print("Enter name of Student 2 : ");
                String name2 = input.next();
                Student s1 = null, s2 = null;
                for (Student item : students) {
                    if (name1.equals(item.getName())) s1 = item;
                    if (name2.equals(item.getName())) s2 = item;
                }
                if (s1 != null && s2 != null) {
                    older =  s1.getBirdYear() > s2.getBirdYear() ? s2 : s1;
                    bool = false;
                }else{
                    System.out.println("please enter the real name");
                }
            }
            return older;
        }

        public Student getYoungestStudent (Student[]students){
            Student youngest = students[0];
            for (int i = 1; i < students.length; i++) {
                if (youngest.getBirdYear() < students[i].getBirdYear()) {
                    youngest = students[i];
                }
            }
            return youngest;
        }

        public void printAllGirlStudents (Student[]students){
            for (Student item : students) {
                if (item.getGender() == 'f' || item.getGender() == 'F') {
                    System.out.println("********************************");
                    item.printInfo();
                }
            }
        }

        public Student getYoungerGirlStudent (Student[]students){
            Student younger = null;
            for (Student item : students) {
                char gen = item.getGender();
                int yer = item.getBirdYear();
                if ((gen == 'f' || gen == 'F') && younger == null ) {
                    younger = item;
                } else if ((gen == 'f' || gen == 'F') && yer > younger.getBirdYear()) {
                    younger = item;
                }
            }
            return younger;
        }
    }
