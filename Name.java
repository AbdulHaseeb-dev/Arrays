import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String name [] = new String [a];

        for(int i=0; i<a; i++){
            name[i] = sc.next();
        }
        for(int i=0; i<name.length; i++){
            System.out.println("name " + (i+1) +" is : "+ name[i]);
        }
        sc.close();
    }
}
