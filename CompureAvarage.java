//JAMES WILSON NCE/NG/SCI/180/23
//declaring a scanner library
import java.util.Scanner;

public class CompureAvarage {
    
    //kutsegula function ya main
    public static void main(String[] args){

        //kutsegula object yotenga manambala
        Scanner input = new Scanner(System.in);

        //kumuuza olemba kuti alowetse nambala yoyamba
        System.out.println("Enter first number:");
        //kutenga zolemba za olowetsa
        int num1 = input.nextInt();
        //kumuuza olemba kuti alowetse nambala yachiwiri
        System.out.println("Enter second number:");
        //kutenga zolemba za olowetsa
        int num2 = input.nextInt();
        //kumuuza olemba kuti alowetse nambala yochitatu
        System.out.println("Enter third number:");
        //kutenga zolemba za olowetsa
        int num3 = input.nextInt();
        //kumuuza olemba kuti alowetse nambala yochinayi
        System.out.println("Enter fourth number:");
        //kutenga zolemba za olowetsa
        int num4 = input.nextInt();

        //kuwerengera average ya manambala
        double average = (num1 + num2 + num3 + num4)/4;
        //kuonetsa yankho
        System.out.println("The average is:" + " " + average);
    }
    
}

