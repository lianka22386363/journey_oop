import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter how many days will be your trip last!");
        int duration = sc.nextInt();

        Sea s1 = new Sea("chill", "plane",duration, 20,false);
        Mountains m1 = new Mountains("activities", "bus",duration, "summer",false);
        City c1 = new City("work", "car",duration, "hotel","english");

        ArrayList <Journey> trip = new ArrayList<>();
        trip.add(s1);
        trip.add(m1);
        trip.add(c1);

        try{
            FileWriter fr = new FileWriter("journey_list.txt");
            for (Journey i: trip){
                fr.write(i.printinfo()+"\n");
            }
            fr.close();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}