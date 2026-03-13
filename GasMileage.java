import java.util.Scanner;
public class GasMileage{
 public static void main(String... args){

 Scanner input = new Scanner(System.in);

 System.out.println("Enter the trip name: ");
 String tripName = input.next();

 System.out.println("Enter the miles of the trip as a whole number: ");
 int miles = input.nextInt();

 System.out.println("Enter the number of gallons for the trip: ");
 int numberOfGallons = input.nextInt();


 int milesPerGallon = miles * numberOfGallons;
 System.out.println("The miles per gallon for " + tripName + " is " + milesPerGallon);



 



}






}
