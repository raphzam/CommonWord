import com.sun.xml.internal.txw2.output.DumpSerializer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class ReplaceACommonWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userText;

        do {
            System.out.println("Enter your text or 'q' to quit");
            userText = input.nextLine();

            if (userText.equalsIgnoreCase("q")){
                return;
            } //Make Program quit immediately if q is entered

            String[] words = userText.split(" ");

            for (int i = 0; i < words.length; i++){
                if (words [i].equalsIgnoreCase("the")){
                    words[i] = "BE";
                }
            }

            //Strings as Arrays to Print
            System.out.println(Arrays.toString(words));

            //for loop Print
            for (int i =0;i < words.length; i++) {
                System.out.print(words[i] + " ");
            }

            System.out.println();

        } while (!userText.equalsIgnoreCase("q"));
        System.out.println();


    }
}




