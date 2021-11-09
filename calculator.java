import java.util.*;

public class calculator {
    public static void main ( String args[]){
        Scanner sc = new Scanner (System.in);
        //Button type 
        int Button = sc.nextInt();

        switch(Button){
            case 1 :System.out.println("+Addition");
           // Addition 
          int a = sc.nextInt();
          int b = sc.nextInt();
          int Addition = a+b;
          System.out.println();
         System.out.println(Addition); case 9  : System.out.println("Answer"); break;

         case 2 : System.out.println("-Subtraction");
            //Subtraction 
          int c = sc.nextInt();
          int d = sc.nextInt();
          int Subtraction = c-d;
          System.out.println();
          System.out.println(Subtraction); case 8 : System.out.println("Answer"); break;

          case 3 : System.out.println("*Multipication");
             //Multipication
          int e = sc.nextInt();
          int f = sc.nextInt();
          int Multipication = e * f;
          System.out.println();
          System.out.println(Multipication);  System.out.println("Anwer"); break;
          
          case 4 : System.out.println("/division");
             //Division        
          int i = sc.nextInt();
          int j = sc.nextInt();
          int Division = i / j;
          System.out.println();
          System.out.println(Division); System.out.println("Answer");
          
          //Completed


        }   
    }    
}
