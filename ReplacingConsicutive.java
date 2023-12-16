import java.util.Scanner;

public class ReplacingConsicutive {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter  string: ");
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        char c1 = s.charAt(0);
        int count = 1;

    for (int i = 1; i < s.length(); i++) {
        char c2 = s.charAt(i);

        if (c2 ==c1) {
            count++;
        } else {
            sb.append(c1);
        if (count > 1) {
            sb.append(count);
            }

            c1 = c2;
            count = 1;

           }

        }
        
       sb.append(c1);
        if (count > 1) {
            sb.append(count);

        }

        System.out.println("Original string: " + s);
        System.out.println("Compressed string: " + sb);
    }
}
