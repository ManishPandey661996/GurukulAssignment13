import java.util.Scanner;
class Parenthesis{
 

      public static boolean isBalanced(String exp) {
     
    
             boolean flag = true; 
             int count = 0; 
     
    
             for(int i = 0; i < exp.length(); i++){ 
                 if (exp.charAt(i) == '(') { 
                      count++; 
                 } 
                 else{ 
             
                      count--; 
                 } 
                 if (count < 0){ 
                       flag = false; 
                        break; 
                  } 
            } 
     
     
            if (count != 0){ 
                 flag = false; 
            }
            return flag; 
     } 
}
 
public class BalancedParanthesis{
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
             String s1 = sc.nextLine(); 
     
             if (Parenthesis.isBalanced(s1)) 
                  System.out.println("Balanced");
             else
                  System.out.println("Not Balanced");
     
             
      }
}