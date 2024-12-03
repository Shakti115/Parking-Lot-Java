import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class parking_lot
{
    public static void main(String[] args) throws InterruptedException
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> parking_spots = new ArrayList<>();
        Random rn = new Random();

        int a = 1;
        while(a<6){
            int random_number = rn.nextInt(21);
            parking_spots.add(random_number);
            a = a+1;
        }
        
        int length = parking_spots.size();

        ArrayList<Double> parking_hours = new ArrayList<>();

        int i = 1;
        while(i==1){
            System.out.println("Welcome to Kia's Automatic Parking Lot!");
            Thread.sleep(500);
            System.out.println("Would you like to park here? Type Y for Yes to continue");
            String response = sc.nextLine();
            if (response.equalsIgnoreCase("Y")){
                Thread.sleep(1000);
                if (!parking_spots.isEmpty()){
                    System.out.println("Hello, we have "+length+" parking spots: "+parking_spots);
                    int b = 1;
                    while(b==1){
                        System.out.println("For how long do you want to park? The maximum duration is 12 hours and the minimum is 0.5 hours."); 
                        Double hours_response = sc.nextDouble();
                        if (hours_response > 0.5 && hours_response < 12){
                            int min_parkingSpot = Collections.min(parking_spots);
                            parking_hours.add(hours_response);
                            Thread.sleep(1000);
                            System.out.println("Okay! You can park for"+hours_response+"hours at parking spot #"+min_parkingSpot);
                            System.out.println("Thank you for using the automated parking system!");
                            parking_spots.remove(min_parkingSpot);
                            Thread.sleep(2000);
                            break;
                        }
                    
                        else{
                            System.out.println("That is an invalid selection. Please try again!");
                        }
                    }
                }
                else{
                    double min_parkingHours = Collections.min(parking_hours);
                    System.out.println("Sorry, there are no parking spots available at the moment!"); 
                    System.out.println("A spot will be available in "+min_parkingHours+" hours, please come back then or reserve your spot now!");
                }
            }
            else{
                System.out.println("Okay! Thank you for coming!");
            }
        }



    
    
    





    //CODE ENDS HERE
    }
}