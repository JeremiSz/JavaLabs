package labSheet1;

import java.util.Scanner;

public class TextAnalyser {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        String input,output,shortest = "";
        int index = 0,wordCount=0,minLength = 0;

        do{
            System.out.print("Please enter text " +
                    (index + 1) + " : ");
            input = con.nextLine();
            output = "\nNumber of characters: " + input.length()+
                    "\nNumber of lower case vowels " +
                    countLowerVowels(input) +
                    "\nNumber of words " + countWords(input) +
                    "\nNumber of times \"ed\" is used " +
                    countED(input) + "\n";
            System.out.print(output);

            if(input.length()>minLength){
                shortest = input;
                minLength = input.length();
            }

        }while (++index <3);

        output = "\n\nShortest piece of text: " + shortest +
                "\nAverage number of words: " +
                String.format("%.0f",wordCount/(float)index);
        System.out.print(output);
        System.exit(0);
    }

    static int countLowerVowels(String in){
        int index =0,count = 0;
        while (index < in.length()){
            if(in.charAt(index) == 'a' || in.charAt(index) == 'e' ||
                    in.charAt(index)=='i' || in.charAt(index) == 'o'||
                    in.charAt(index)=='u')count++;
            index++;
        }
        return count;
    }

    static int countWords(String in){
        int index =0,count = 0;
        while (index < in.length()){
            if(in.charAt(index) == ' ')count++;
            index++;
        }
        return count;
    }
    static int countED(String in){
        int index =0,count = 0;
        in = in.toLowerCase();
        while (index < in.length()){
            if(in.charAt(index) == 'e' &&
                    in.charAt(index + 1) == 'd') count++;
            index++;
        }
        return count;
    }
}
