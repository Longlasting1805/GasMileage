import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int miles;
        int gallon;
        int milesCounter = 1;

        while(milesCounter <= 2){
            System.out.print("Enter miles: ");
            miles = input.nextInt();
            System.out.print("Enter gallon used: ");
            gallon = input.nextInt();
            milesCounter += 1;

            float total_driven = (float) gallon / miles;

            System.out.printf("Total gallon used for this trip is: %f%n ", total_driven);


        }

    }
}
