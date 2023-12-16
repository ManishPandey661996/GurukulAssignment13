import java.util.Scanner;
 class Sentance {
 
    
    static boolean sentencePalindrome(String str) 
    {     
        int l = 0; 
        int h = str.length()-1; 
          
       
        str = str.toLowerCase(); 
          
        
        while(l <= h) 
        { 
              
            char getAtl = str.charAt(l); 
            char getAth = str.charAt(h); 
              
            
            if (!(getAtl >= 'a' && getAtl <= 'z')) 
                l++; 
              
            
            else if(!(getAth >= 'a' && getAth <= 'z')) 
                h--; 
              
           
            else if( getAtl == getAth) 
            { 
                l++; 
                h--; 
            } 
              
            
            else 
                return false; 
        } 
          
       
        return true;     
    }
}     
      
     
    public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sentance g = new Sentance(); 
        System.out.println("Enter the String : ");
        String str = sc.nextLine(); 
        if( g.sentencePalindrome(str)) 
          System.out.println("Sentence is palindrome"); 
        else
          System.out.println("Sentence is not" + " " + "palindrome"); 
    } 
} 
