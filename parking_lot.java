import java.util.Random;
import java.util.Scanner;

public class parking_lot
{
    public static void main(String[] args) throws InterruptedException
    {
        Scanner sc = new Scanner(System.in);
       //parking_hours = []
        //parkingSpotNumbers = random.sample(range(1,21),5)
        int i = 1;
        while(i==1){
            System.out.println("Welcome to Kia's Automatic Parking Lot!");
            Thread.sleep(500);
            System.out.println("Would you like to park here? Type Y for Yes to continue");
            String response = sc.nextLine();
            if (response.equalsIgnoreCase("Y")){
                Thread.sleep(1000);
                if (/*len(parkingSpotNumbers)*/ > 0){
                    System.out.println("Hello, we have "+/*len(parkingSpotNumbers)*/+" parking spots: "+/*parkingSpotNumbers*/);
                    int a = 1;
                    while(a==1){
                        System.out.println("For how long do you want to park? The maximum duration is 12 hours and the minimum is 0.5 hours."); 
                        Double hours_response = sc.nextDouble();
                        if (hours_response > 0.5 and hours_response < 12){
                            //parking_hours.append(hours_response)
                            //min_parkingSpot = min(parkingSpotNumbers)
                            Thread.sleep(1000);
                            System.out.println("Okay! You can park for", str(hours_response), "hours at parking spot #"+ str(/*min_parkingSpot*/));
                            System.out.println("Thank you for using the automated parking system!");
                            //parkingSpotNumbers.remove(min_parkingSpot)
                            Thread.sleep(2000);
                            break;
                        }
                    }
                        else{
                            System.out.println("That is an invalid selection. Please try again!");
                        }
                }
                else{
                    System.out.println("Sorry, there are no parking spots available at the moment!"); 
                    System.out.println("A spot will be available in", str(/*min(parking_hours)*/), "hours, please come back then or reserve your spot now!");
                }
            }
            else{
                System.out.println("Okay! Thank you for coming!");
            }
        }



    
    
    





    //CODE ENDS HERE
    }
}
