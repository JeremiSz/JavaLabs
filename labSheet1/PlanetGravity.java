package labSheet1;

import java.util.Scanner;

public class PlanetGravity {

    public static void main(String[] args) {
        final float g = 9.81f;
        float otherMass,otherRadius,earthMass,earthRadius,otherGravity;
        Scanner console = new Scanner(System.in);

        System.out.print("Please enter the mass of Earth: ");
        earthMass = console.nextFloat();
        System.out.print("\nPlease enter the radius of Earth: ");
        earthRadius = console.nextFloat();
        System.out.print("\nPlease enter the mass of other planet: ");
        otherMass = console.nextFloat();
        System.out.print("\nPlease enter the radius of other planet: ");
        otherRadius = console.nextFloat();

        otherGravity = (g*otherMass*earthRadius*earthRadius)/(earthMass*otherRadius*otherRadius);
        System.out.println("The acceleration due to gravity on the other planet is "+
                Float.toString(otherGravity).substring(0,4) + " m/s/s");
        System.exit(0);
    }
}
