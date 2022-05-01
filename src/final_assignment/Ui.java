package src.final_assignment;

import java.util.Scanner;

public class Ui {
    public static void main(String[] args) {
        // was only shooting for the minimum here...
        Hanger hanger = new Hanger();
        
        Scanner in = new Scanner(System.in);

        hanger.add(in);

        hanger.printHanger();

        hanger.sortHanger();
        System.out.println("HANGER SORTED");

        hanger.removePlane(in);
        hanger.printHanger();

        System.out.println("DELETE A PLANE");
        hanger.printHanger();

    

    }
}
