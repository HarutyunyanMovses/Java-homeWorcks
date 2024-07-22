import model.Plane;
import services.AiroportService;
import services.FileService;
import services.FilesIMPL;

import java.util.Scanner;

public class AiroportTest {
    public static void main(String[] args) throws Exception {
        Plane[] planes = AiroportService.createPlanes(FileService.readFiles(FilesIMPL.AIRCRAFT_LIST_URL));

        boolean start = true;
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
                    AiroportService.printInfo(planes[i]);
                    System.out.println("***************< End task >***************");
                    break;
                }
                case 2: {
                    System.out.println("*************** Task 2 ***************");
                    System.out.println("Enter index of plane (0 to " + (planes.length - 1) + " )  ");
                    int i = input.nextInt();
                    AiroportService.ifMilitaryOrNot(planes[i]);
                    System.out.println("***************< End task >***************");
                    break;
                }
                case 3: {
                    System.out.println("*************** Task 3 ***************");
                    System.out.println("Enter index of plane P1 (0 to " + (planes.length - 1) + " )  ");
                    int i = input.nextInt();
                    System.out.println("Enter index of plane P2 (0 to " + (planes.length - 1) + " )  ");
                    int j = input.nextInt();
                    AiroportService.printInfo(AiroportService.getnewPlane(planes[i], planes[j]));
                    System.out.println("***************< End task >***************");
                    break;
                }
                case 4: {
                    System.out.println("*************** Task 4 ***************");
                    System.out.println("Enter index of plane P1 (0 to " + (planes.length - 1) + " )  ");
                    int i = input.nextInt();
                    System.out.println("Enter index of plane P2 (0 to " + (planes.length - 1) + " )  ");
                    int j = input.nextInt();
                    String result = AiroportService.getBigWingspan(planes[i], planes[j]);
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
                    AiroportService.getSmallSets(planes[i], planes[j], planes[k]);
                    System.out.println("***************< End task >***************");
                    break;
                }
                case 6: {
                    System.out.println("*************** Task 6 ***************");
                    AiroportService.printNotMilitary(planes);
                    System.out.println("***************< End task >***************");
                    break;
                }
                case 7: {
                    System.out.println("*************** Task 7 ***************");
                    AiroportService.printMilitaryMoreHours(planes);
                    System.out.println("***************< End task >***************");
                    break;
                }

                case 8: {
                    System.out.println("*************** Task 8 ***************");
                    AiroportService.printInfo(AiroportService.getMinWeightPlane(planes));
                    System.out.println("***************< End task >***************");
                    break;
                }
                case 9: {
                    System.out.println("*************** Task 9 ***************");
                    AiroportService.printInfo(AiroportService.getMinCostMilitaryPlane(planes));
                    System.out.println("***************< End task >***************");
                    break;
                }
                case 10: {
                    System.out.println("*************** Task 9 ***************");
                    AiroportService.printPlanesOrderByYear(planes);
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
