package org.example; 
import java.util.Scanner;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) { 

        Scanner wordInput = new Scanner(System.in);
        Scanner numInput = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();

        int programChoice;
        
        //FSF Variables
        int startFSF = 0;
        int endFSF = 0;
        String phraseFSF = "";

        //ROF Variables
        int startROF = 0;
        int endROF = 0;
        int counterROF = 0;

        // SOS Variables
        int lowSOS = 0;
        int highSOS = 0;
        int sumSOS = 0;

        //RE Variables
        String wordRE = "";
        int repeatsRE = 0;
        int counterRE = 0;

        // SBD Variables
        String firstWordSBD = "";
        String secondWordSBD = "";
        int dotsSBD = 0;
        int counterSBD = 0;

        //ADI Variables
        int iterations = 0;
        int counterADI = 0;
        int current = 0;
        int sumADI = 0;

        // SCC Variables
        int weightSCC = 2;
        double costSCC = 0;

        System.out.println("Choose from one of the following programs: ");
        System.out.println();
        System.out.println("1 - Further Substring Fun");
        System.out.println("2 - Run of Integers");
        System.out.println("3 - Sum of a Range of Sequential Integers");
        System.out.println("4 - Repeatedly Echo a Word");
        System.out.println("5 - Words Separated by Dots");
        System.out.println("6 - Adding up Integers");
        System.out.println("7 - Shipping Cost Calculator");
        System.out.println();
        System.out.print("Enter choice: ");
        programChoice = numInput.nextInt();
        System.out.println();

        if (programChoice == 1) {

            System.out.println("Enter a string: ");
            phraseFSF = wordInput.nextLine();
            System.out.print("Enter beginning index: ");
            startFSF = numInput.nextInt();
            System.out.print("Enter ending index: ");
            endFSF = numInput.nextInt();
            System.out.println();
            System.out.println("Original string: ");
            System.out.println(phraseFSF);
            System.out.println();
            System.out.println("Substring: ");
            System.out.println(phraseFSF.substring(startFSF, endFSF));

        } else if (programChoice == 2) {
            
            System.out.println("Enter Start: ");
            startROF = numInput.nextInt();
            System.out.println("Enter End: ");
            endROF = numInput.nextInt();
            System.out.println();
            counterROF = startROF;

            while (counterROF <= endROF) {
                System.out.println(counterROF);
                counterROF++;
            }

        } else if (programChoice == 3) {
           
            System.out.println("Enter low: ");
            lowSOS = numInput.nextInt();
            System.out.println("Enter high: ");
            highSOS = numInput.nextInt();
            sumSOS = (((highSOS - lowSOS)+1)/2) * (highSOS + lowSOS);
            System.out.println("Sum = " + sumSOS);

        } else if (programChoice == 4) {

            System.out.println("Enter a word: ");
            wordRE = wordInput.nextLine();
            wordRE = wordRE.trim();
            repeatsRE = wordRE.length();
            System.out.println();

            while (counterRE < repeatsRE) {
                System.out.println(wordRE);
                counterRE++;
            }
        } else if (programChoice == 5) {
            System.out.println("Enter first word: ");
            firstWordSBD = wordInput.nextLine();
            System.out.println("Enter second word: ");
            secondWordSBD = wordInput.nextLine();
            System.out.println();

            dotsSBD = 30- (firstWordSBD.length() + secondWordSBD.length());

            System.out.print(firstWordSBD);
            while (counterSBD < dotsSBD) {
                System.out.print(".");
                counterSBD++;
            }
            System.out.print(secondWordSBD);
        } else if (programChoice == 6) {
            
            System.out.println("How many integers will be added: ");
            iterations = numInput.nextInt();

            while (counterADI < iterations) {
                System.out.println("Enter an integer: ");
                current = numInput.nextInt();
                sumADI = sumADI + current;
                counterADI++;
                
            }
            System.out.println();
            System.out.println("The sum is " + sumADI);

        } else if (programChoice == 7) {

            while (weightSCC != 0) {
            
            System.out.println("Weight of Order:");
            weightSCC = numInput.nextInt();


            if (weightSCC > 10) {
                costSCC = 3 + (0.25 *(weightSCC - 10));
                System.out.println("Shipping Cost: " + money.format(costSCC));
                System.out.println();
            } else if (weightSCC <= 10 && weightSCC > 0) {
                costSCC = 3;
                System.out.println("Shipping Cost: " + money.format(costSCC));
                System.out.println();
            } else if (weightSCC == 0) {
                System.out.println();
                System.out.println("bye");
            }
                
        }
                

            }

            

        

        }

    }


