/*
 * Class: CMSC203
 * Instructor:Ahmed Tarek
 * Description: main method and scanner class for inputs and outputs
 * Due: 15/06/2021
 * Platform/compiler:Intellij
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Tariq Shaath
*/



import java.util.Scanner;
public class WiFiDiagnosis
{
    public static void main (String[]args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("If you have a problem with "+
                "internet connectivity, this WiFi Diagnosis might work.");
        // First step
        System.out.println("Reboot your computer and try to connect.");

        System.out.println("Did that fix problem? (yes or no)");
        //input
        String answer = scanner.nextLine();

        // if statements
        if(answer.equals("yes"))
        {
            System.out.println("Done. You now have an internet connection");
        }
        else if(answer.equals("no"))

        {
            //nested if statement
            //second step
            System.out.println("Reboot your router and try to connect.");
            System.out.println("Did that fix problem? (yes or no)");
            //input
            answer = scanner.nextLine();
            if (answer.equals("yes"))
            {
                System.out.println("Done. You now have an internet connection");
            }
            else if (answer.equals("no"))
            {
                //3rd step
                System.out.println("Make sure the cables connecting the router are firmly plugged in and power is getting to the router.");
                System.out.println("Did that fix problem? (yes or no)");
//input
                answer = scanner.nextLine();

                if(answer.equals("yes"))
                {
                    System.out.println("Done. You now have an internet connection");
                }
                else if (answer.equals("no"))
                {
                    //4th step
                    System.out.println("Move the computer closer to the router and try to connect.");
                    System.out.println("Did that fix problem? (yes or no)");
//input
                    answer = scanner.nextLine();

                    if (answer.equals("yes"))
                    {
                        System.out.println("Done. You now have an internet connection");
                    }
                    else if (answer.equals("no"))
                    {
                        //5th step
                        System.out.println("You will have to contact ISP");
                        System.out.println("DONE");
                        System.out.println("Done by Programmer Tariq Shaath");
                    }
                }
            }

        }
    }

}

