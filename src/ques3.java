import java.util.Scanner;
public class ques3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Before swapping: "+x +"  " + y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping: "+x +"  " + y);

    }
}
