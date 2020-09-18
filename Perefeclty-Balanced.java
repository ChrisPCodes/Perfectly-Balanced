// Project 3: Perfectly Balanced 

import java.util.Scanner;

public class PerfectlyBalanced {
     public static void main(String[] args) {
        
        int accum = 0;
        
        while(true) {
            
            String name = getName();

            if(name.equals("quit")){
            break;
        }

            boolean choice = isChosen(name);
        
            if(choice) {
                System.out.println("Hear me and rejoice, " + name + "! You have the privilege of being saved by the great Titan.");
                System.out.println("Smile. For even in death, you have become a child of Thanos.");
            }

            else {
                System.out.println("When I'm done, " + name + ", half of humanity will still be alive. I hope they remember you.");
            }
            
            System.out.println("");

    }

    }
// This function takes name and add each String integer value into and accumalator using score of the UTF-16 encoding, but ignoring any non-letter. 
// Then it returns the sum.  
    public static int calculateNameScore(String name){
        int calculateNameScore = 0;
        for(char letter : name.toCharArray()){
            if((int)letter >= 65 && (int)letter <= 90 || (int)letter >= 97 && (int)letter <= 122){
                calculateNameScore += (int)letter;
            }
        }
        return calculateNameScore;
    }
// This function takes the integer sum of name form calcualteNamScore and takes the remainder of dividing it by 11. 
// It then makes a desicion for Thanos based on if the reamainder is odd or even. Laslty returing true or false for the descion made. 
    public static Boolean isChosen(String name){
        int sum = calculateNameScore(name);
        int remainder = sum % 11; 

        if (remainder % 2 == 0){
            return false;
        }
        return true;
    }
// This function asks and returns a users name 
    public static String getName(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = input.nextLine();

        while(name.length() < 1){
            System.out.println("Please enter your name: ");
            name = input.nextLine();
        }

        return name;
    }

    }
