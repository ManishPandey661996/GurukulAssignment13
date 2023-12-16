import java.util.Scanner;

public class ReplaceAllOccurance {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter  string: ");
        String s = sc.nextLine();

        System.out.print("Enter character to  be replace: ");
        char interChange = sc.nextLine().charAt(0);

        System.out.print("Enter the  character from which replacement must happen : ");
        char newCharacter = sc.nextLine().charAt(0);

        String replacedString = "";
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            replacedString += (c1 == interChange) ? newCharacter : c1;
        }

        // Print results
        System.out.println("Original string: " + s);
        System.out.println("Replaced string: " + replacedString);

       
    }
}
