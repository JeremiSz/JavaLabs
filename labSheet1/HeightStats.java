package labSheet1;

import java.util.Scanner;

public class HeightStats {
    public static void main(String[] args) {
        float[] heights = new float[6];
        Scanner con = new Scanner((System.in));
        int index = 0,between1m3and19=0,higherThanAverage=0;
        float total = 0,min = Float.MAX_VALUE;
        final float GLOBAL_AVERAGE_HEIGHT = 1.665f;

        do{
            System.out.print("Please enter Height " + (index+1) + " : ");
            heights[index] = con.nextFloat();
            while(!isValidHeight(heights[index])){
                System.out.print("\nInvalid - Please re-enter: ");
                heights[index] = con.nextFloat();
            }

            total += heights[index];
            if(min > heights[index]) min = heights[index];
            if(heights[index]>=1.3 && heights[index]<=1.9) between1m3and19++;
            if (heights[index] > GLOBAL_AVERAGE_HEIGHT) higherThanAverage++;
        }while(++index<6);

        String output = "-------------------------\n" +
                "\t\tHeight Statistics\n" +
                "-------------------------\n\n\n" +
                "\nThe average of the heights entered is " +
                String.format("%.1f",total / heights.length) +
                "m\nThe smallest height value entered is " +
                min +
                "m\nThe number of height values between 1.3m and 1.9m" +
                "inclusive is " + between1m3and19 + "\n" +
                "The percentage of height values exceeding the global average is " +
                String.format("%.2f",higherThanAverage * 100f / heights.length) + "%";
        System.out.print(output);

        System.exit((0));
    }

    static boolean isValidHeight(float height){
        return (height>=.5464 && height<=2.72);
    }
}
