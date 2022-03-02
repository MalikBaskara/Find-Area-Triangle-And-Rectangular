import java.util.Scanner;

public class Square {
    public static void main(String[] args) {

        //Square / rectangular 

        int  side1, side2, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1 of the square / rectangular :");
        side1 = sc.nextInt();
        System.out.println("Enter the side2 of the square / rectangular :");
        side2 = sc.nextInt();
        area = (side1 *side2);
        System.out.println("Area of the square / rectangular is : "+area);

        //If this is useful you can push star button
    }
}
