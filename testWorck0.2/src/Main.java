import model.Plane;
import service.PlaneServic;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Plane p1 = new Plane("ed1r32e", "use", 2001, 1541.5, false, 50540.25,
                12.5, 1400, 450, 800565.4);
        Plane p2 = new Plane("ed1kl2e", "italy", 1990, 44.5, true, 57540.25,
                14.5, 1100, 257, 804565.4);
        Plane p3 = new Plane("kl56j2e", "italy", 1990, 4451.5, true, 57540.25,
                14.5, 1100, 257, 804565.4);
        Plane p4 = new Plane("eh6d12e", "franc", 2022, 751.5, false, 60540.25,
                16, 1200, 161, 74015.4);
        Plane p5 = new Plane("ed1po92e", "russia", 2021, 151.5, true, 70570.25,
                15.4, 2100, 500, 165.4);
        Plane p6 = new Plane("ed1preto92e", "russia", 2019, 151.5, true, 70570.25,
                15.4, 2100, 500, 6565.4);
        Plane[] planes = {p1, p2, p3, p4, p5, p6};

        boolean start = true;

        PlaneServic service = new PlaneServic();
        Scanner input = new Scanner(System.in);


        while (start) {
            System.out.println();
            System.out.println("**************< Task Bar >**************");
            System.out.println("Task 1: Result: print all information of the plane ");
            System.out.println("Task 2: Result: print  if (military) cost and topSpeed (else)  model and country");
            System.out.println("Task 3: Result: return plane which one is newer (if they have the same age return first one) ");
            System.out.println("Task 4: Result: return model of plane which has bigger wingspan (if they have the same - return second one) ");
            System.out.println("Task 5: Result: print country of the plane whit smallest seats count(if they have the same - print first)");
            System.out.println("Task 6: Result: print all not military planes");
            System.out.println("Task 7: Result: print all military planes which were in air more then 100 hours");
            System.out.println("Task 8: Result: return the plane whit minimal weight (if there are some of them return last one)");
            System.out.println("Task 9: Result: return the plane whit minimal cost from all military planes");
            System.out.println("Task 10: Result: print planes in ascending  form order by year");
            System.out.println("***********< Enter the task code ( 0 to 10 ) >***********");
            int num = input.nextInt();

            switch (num) {

                case 1: {
                    System.out.println("*************** Task 1 ***************");
                    System.out.println("Enter index of plane (0 to " + (planes.length - 1) + " )  ");
                    int i = input.nextInt();
                    service.printOnePlane(planes[i]);
                    System.out.println("***************< End task >***************");
                    break;
                }
                case 2: {
                    System.out.println("*************** Task 2 ***************");
                    System.out.println("Enter index of plane (0 to " + (planes.length - 1) + " )  ");
                    int i = input.nextInt();
                    service.ifMilitaryOrNot(planes[i]);
                    System.out.println("***************< End task >***************");
                    break;
                }
                case 3: {
                    System.out.println("*************** Task 3 ***************");
                    System.out.println("Enter index of plane P1 (0 to " + (planes.length - 1) + " )  ");
                    int i = input.nextInt();
                    System.out.println("Enter index of plane P2 (0 to " + (planes.length - 1) + " )  ");
                    int j = input.nextInt();
                    Plane result = service.getnewPlane(planes[i], planes[j]);
                    result.printInfo();
                    System.out.println("***************< End task >***************");
                    break;
                }
                case 4: {
                    System.out.println("*************** Task 4 ***************");
                    System.out.println("Enter index of plane P1 (0 to " + (planes.length - 1) + " )  ");
                    int i = input.nextInt();
                    System.out.println("Enter index of plane P2 (0 to " + (planes.length - 1) + " )  ");
                    int j = input.nextInt();
                    String result = service.getBigWingspan(planes[i], planes[j]);
                    System.out.println(result);
                    System.out.println("***************< End task >***************");
                    break;
                }
                case 5: {
                    System.out.println("*************** Task 5 ***************");
                    System.out.println("Enter index of plane P1 (0 to " + (planes.length - 1) + " )  ");
                    int i = input.nextInt();
                    System.out.println("Enter index of plane P2 (0 to " + (planes.length - 1) + " )  ");
                    int j = input.nextInt();
                    System.out.println("Enter index of plane P3 (0 to " + (planes.length - 1) + " )  ");
                    int k = input.nextInt();
                    service.getSmallSets(planes[i], planes[j], planes[k]);
                    System.out.println("***************< End task >***************");
                    break;
                }
                case 6: {
                    System.out.println("*************** Task 6 ***************");
                    service.printNotMilitary(planes);
                    System.out.println("***************< End task >***************");
                    break;
                }
                case 7: {
                    System.out.println("*************** Task 7 ***************");
                    service.printMilitaryMoreHours(planes);
                    System.out.println("***************< End task >***************");
                    break;
                }

                case 8: {
                    System.out.println("*************** Task 8 ***************");
                    Plane p = service.getMinWeightPlane(planes);
                    p.printInfo();
                    System.out.println("***************< End task >***************");
                    break;
                }
                case 9: {
                    System.out.println("*************** Task 9 ***************");
                    Plane p = service.getMinCostMilitaryPlane(planes);
                    p.printInfo();
                    System.out.println("***************< End task >***************");
                    break;
                }
                case 10: {
                    System.out.println("*************** Task 9 ***************");
                    service.printPlanesOrderByYear(planes);
                    System.out.println("***************< End task >***************");
                    break;
                }
                case 11:
                    start = false;
                    System.out.println("***************< End AirportTest >***************");
                    break;
                default:
                    System.out.println("******** not found dhis task *********");
                    break;
            }
        }

    }
}