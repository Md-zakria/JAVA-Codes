
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nCALCULATING THE ELECTRICITY OF FAN AND LIGHT IN ONE MONTH\n");

        float bill;

        // DATA FOR FANS

        System.out.println("WHAT IS POWER OF FAN IN WATT:");
        float fp = sc.nextFloat();              // fp = power of fan
        System.out.println("NUMBER OF FANS");
        int nf = sc.nextInt();                  // nf = no of fans
        System.out.println("NUMBER OF HOURS YOU USED FAN DAILY:");
        float fu = sc.nextFloat();              // fu = no of hours fan is used

        // DATA FOR LIGHTS

        System.out.println("WHAT IS POWER OF LIGHT IN WATT:");
        float lp = sc.nextFloat();              // lp = power of light
        System.out.println("NUMBER OF LIGHTS");
        int nl = sc.nextInt();                  // nl = no of lights
        System.out.println("NUMBER OF HOURS YOU USED LIGHT DAILY:");
        float lu = sc.nextFloat();              //lu = no of hours light is used


        float ef;                               // ef = energy used by fan
        float el;                               // el = energy used by light

        // CALCULATIONS

        ef = fp * fu * nf /1000.0f;
        el = lp * lu * nl /1000.0f;
        float te = ef +el;
        float units = te * 30;
        System.out.println("THE UNITS YOU HAVE USED ARE :" + units);

        System.out.println("ENTER THE UNIT RATE OF ELECTRICITY IN $ :");
        float unitrate = sc.nextFloat();


        bill = te * 30 * unitrate;

        System.out.println("\nYOUR ELECTRICITY BILL IS:" + bill);

        sc.close();


    }
}

/*since i have adjusted the rate of units
now i have two adjust the watt used by different items
and their usage hours and then use formula of KWH = W *U/1000
then multiply Kwh with unit rate
 */