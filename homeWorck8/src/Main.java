import model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TruckCar n1 = new TruckCar("volvo","red" , "america", 20000 , true);
        PassengersCar n2 = new PassengersCar("kia","blue" , "china", 6 , "gas");
        RacingCar n3 = new RacingCar("bmw","black" , "germany", 240,4.4);
        RetroCar n4 = new RetroCar("mercedes" , "green" , "germany" , 1953,200000.500);
        GovernmentCar n5 = new GovernmentCar("RR" , "black" ,  "germany" , true , "atlas");

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);

    }
}