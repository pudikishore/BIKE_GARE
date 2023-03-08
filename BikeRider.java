import java.util.*;
import java.util.Scanner;

public class BikeRider {
	public static void main(String[] args) {
Bike b1=new Bike();
Scanner scn=new Scanner(System.in);
while (true){
try{
	System.out.print("change gear: ");
int gear =scn.nextInt();
b1.setGear(gear);

	System.out.print("Bike is running on gear : "+b1.getGear());
}

catch ( IllegalArgumentException  e) {
System.out.println(e.getMessage ());
}

catch ( InputMismatchException  e) {
		System.out.println("only 5 gear in bikes are allowed");
scn.nextLine();
	              }
            }
        }
 }