import java.util.Scanner;


public class Triangle{
    public static void main(String[] args) {
        
        //Triangle
        int Base, Height, Area;
        Scanner area = new Scanner(System.in);
        System.out.println("Input Base : ");
        Base = area.nextInt();
        System.out.println("Input Height : ");
        Height = area.nextInt();
        Area = (Base*Height/2);
        System.out.println("Area : " + Area);

        //If this is useful you can push star button
    }
}