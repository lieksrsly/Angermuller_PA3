package com.company;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    private static int question(int difficulty, int typeOfProblem ){
        SecureRandom rand = new SecureRandom();
        int answer = 0;
        int one = 0;
        int rando;
        int two = 0;

        if(typeOfProblem == 1) {
            switch (difficulty) {
                case 1:
                    one = rand.nextInt(10);
                    two = rand.nextInt(10);
                    break;

                case 2:
                    one = rand.nextInt(100);
                    two = rand.nextInt(100);
                    break;

                case 3:
                    one = rand.nextInt(1000);
                    two = rand.nextInt(1000);
                    break;

                case 4:
                    one = rand.nextInt(10000);
                    two = rand.nextInt(10000);
                    break;

                default:
                    break;
            }
            System.out.println("What is " + one +" + " + two + "?");
            answer = one + two;
            return answer;
        }

            if (typeOfProblem == 2) {
                switch (difficulty) {
                    case 1:
                        one = rand.nextInt(10);
                        two = rand.nextInt(10);
                        break;

                    case 2:
                        one = rand.nextInt(100);
                        two = rand.nextInt(100);
                        break;

                    case 3:
                        one = rand.nextInt(1000);
                        two = rand.nextInt(1000);
                        break;

                    case 4:
                        one = rand.nextInt(10000);
                        two = rand.nextInt(10000);
                        break;

                    default:
                        break;
                }
                System.out.println("What is " + one +" * " + two + "?");
                answer = one * two;
                return answer;
            }

            if (typeOfProblem == 3) {
                switch (difficulty) {
                    case 1:
                        one = rand.nextInt(10);
                        two = rand.nextInt(10);
                        break;

                    case 2:
                        one = rand.nextInt(100);
                        two = rand.nextInt(100);

                        break;

                    case 3:
                        one = rand.nextInt(1000);
                        two = rand.nextInt(1000);
                        break;

                    case 4:
                        one = rand.nextInt(10000);
                        two = rand.nextInt(10000);
                        break;

                    default:
                        break;
                }
                System.out.println("What is " + one +" - " + two + "?");
                answer = one - two;
                return answer;
            }

            if (typeOfProblem == 4) {
                switch (difficulty) {
                    case 1:
                        one = rand.nextInt(10);
                        two = rand.nextInt(10);
                        if (two == 0)
                        {
                            two = rand.nextInt(10);
                        }
                        break;

                    case 2:
                        one = rand.nextInt(100);
                        two = rand.nextInt(100);
                        if (two == 0)
                        {
                            two = rand.nextInt(100);
                        }
                        break;

                    case 3:
                        one = rand.nextInt(1000);
                        two = rand.nextInt(1000);
                        if (two == 0)
                        {
                            two = rand.nextInt(1000);
                        }
                        break;

                    case 4:
                        one = rand.nextInt(10000);
                        two = rand.nextInt(10000);

                        if (two == 0)
                        {
                            two = rand.nextInt(10000);
                        }
                        break;

                    default:
                        break;
                }
                System.out.println("What is " + one +" / " + two + "?");
                answer = one / two;
                return answer;
            }

            if (typeOfProblem == 5) {
                rando = rand.nextInt(4);
                switch (difficulty) {
                    case 1:
                        one = rand.nextInt(10);
                        two = rand.nextInt(10);
                        break;

                    case 2:
                        one = rand.nextInt(100);
                        two = rand.nextInt(100);
                        break;

                    case 3:
                        one = rand.nextInt(1000);
                        two = rand.nextInt(1000);
                        break;

                    case 4:
                        one = rand.nextInt(10000);
                        two = rand.nextInt(10000);
                        break;

                    default:
                        break;
                }

                if (rando == 0)
                {
                    System.out.println("What is " + one +" + " + two + "?");
                    answer = one + two;
                }
                else if (rando == 1)
                {
                    System.out.println("What is " + one +" * " + two + "?");
                    answer = one * two;
                }
                else if (rando == 2)
                {
                    System.out.println("What is " + one +" - " + two + "?");
                    answer = one - two;
                }
                else if ( rando == 3)
                {
                    System.out.println("What is " + one +" / " + two + "?");
                    answer = one + two;
                }
                return answer;
            }
            return answer;
    }

    public static void main(String[] args) {
        int realAnswer;
        int userAnswer;
        int response;
        int i;
        int count;
        int difficulty;
        int typeOfProblem;

        SecureRandom rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);

        System.out.println("What level of difficulty would you like?. (Enter an integer between 1 and 4)");
        System.out.println("(1).");
        System.out.println("(2).");
        System.out.println("(3).");
        System.out.println("(4).");

        difficulty = scnr.nextInt();

        System.out.println("What type of problems would you like to solve? (Enter an integer between 1 and 5)");
        System.out.println("(1) Addition.");
        System.out.println("(2) Multiplication.");
        System.out.println("(3) Subtraction.");
        System.out.println("(4) Division.");
        System.out.println("(5) Any combination of previous 4 options.");

        typeOfProblem = scnr.nextInt();

        count = 0;
        for ( i = 0; i < 10; ++i)
        {
            response = rand.nextInt(3);
            realAnswer = question( difficulty, typeOfProblem);
            userAnswer = scnr.nextInt();


            if ( userAnswer == realAnswer)
            {
                count++;
                switch(response) {
                    case 0:
                        System.out.println("Very good!");
                        break;
                    case 1:
                        System.out.println("Excellent!");
                        break;
                    case 2:
                        System.out.println("Nice work!");
                        break;
                    case 3:
                        System.out.println("Keep up the good work!");
                        break;
                }
            }
            else
            {
                switch(response) {
                    case 1:
                        System.out.println("No. Please try again.!");
                        break;
                    case 2:
                        System.out.println("Wrong. Try once more.");
                        break;
                    case 3:
                        System.out.println("Don't give up!");
                        break;
                    case 4:
                        System.out.println("No. Keep trying.");
                        break;
                }
            }
        }

        count = count * 10;
        if (count >= 75)
        {
            System.out.println("Congratulations, you are ready to go to the next level!");
            System.out.println(count);
        }
        else if (count < 75)
        {
            System.out.println("Please ask your teacher for extra help.");
            System.out.println("" + count + "%");
        }

    }
}
