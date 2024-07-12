import model.Plane;
import service.PlaneServic;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Plane p1 = new Plane("ed1r32e", "use", 2001, 1541.5, false, 50540.25,
                12.5, 1400, 450, 800565.4);
        Plane p2 = new Plane("ed1kl2e", "italy", 1990, 4451.5, true, 57540.25,
                14.5, 1100, 257, 804565.4);
        Plane p3 = new Plane("kl56j2e", "italy", 1990, 4451.5, true, 57540.25,
                14.5, 1100, 257, 804565.4);
        Plane p4 = new Plane("eh6d12e", "franc", 2015, 751.5, false, 60540.25,
                16, 1200, 161, 74565.4);
        Plane p5 = new Plane("ed1po92e", "russia", 2021, 151.5, true, 70570.25,
                15.4, 2100, 500, 65565.4);
        Plane p6 = new Plane("ed1preto92e", "russia", 2021, 151.5, true, 70570.25,
                15.4, 2100, 500, 65565.4);
        Plane[] planes = {p1, p2, p3, p4,p5,p6};

        boolean start = true;

        PlaneServic service = new PlaneServic();
        Scanner input = new Scanner(System.in);


        while (start) {
            System.out.println("entr the task code");
            int num = input.nextInt();

            switch (num) {

                case 1 :{
                    System.out.println("input index of plane  ");
                    int i = input.nextInt();
                    service.ifMilitaryOrNot(planes[i]);
                }
                case 2 :{
                    System.out.println("input index of plane ");
                    int i = input.nextInt();
                    service.ifMilitaryOrNot(planes[i]);
                }
                case 3 :{
                    System.out.println("input index of plane 1");
                    int i = input.nextInt();
                    System.out.println("input index of plane 2");
                    int j = input.nextInt();
                   Plane result =  service.getnewPlane(planes[i],planes[j]);
                   result.printInfo();
                    System.out.println("***********************");
                }
                case 4 :{
                    System.out.println("input index of plane 1");
                    int i = input.nextInt();
                    System.out.println("input index of plane 2");
                    int j = input.nextInt();
                    String result =  service.getBigWingspan(planes[i],planes[j]);
                    System.out.println(result);
                  System.out.println("***********************");
                }
                case 5 :{
                    System.out.println("input index of plane 1");
                    int i = input.nextInt();
                    System.out.println("input index of plane 2");
                    int j = input.nextInt();
                    System.out.println("input index of plane 3");
                    int k = input.nextInt();
                    service.getSmallSets(planes[i],planes[j],planes[k]);
                    System.out.println("****************************");
                }
                case 6 : {
                    service.printNotMilitary(planes);

                }
                case 7 : {
                    service.printMilitaryMoreHours(planes);
                }

                case 8 :{
                   Plane p =  service.getMinWeightPlane(planes);
                   p.printInfo();
                    System.out.println("***********************");
                }
                case 9 : {
                    Plane p = service.getMinCostMilitaryPlane(planes);
                    p.printInfo();
                    System.out.println("******************");
                }
                case 10 : {
                    service.printPlanesOrderByYear(planes);
                }
                case 11:
                    start = false;
                    break;
                default:
                    System.out.println("******** not found dhis task *********");
                    break;
            }
        }

    }
}