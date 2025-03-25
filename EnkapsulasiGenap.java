package syahrul2309066.enkapsulasigenap; 

import java.util.Scanner;

public class EnkapsulasiGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinearEquation equation = new LinearEquation(); 

        // Menginput nilai
        System.out.print("Masukkan a: ");
        equation.setA(input.nextDouble());
        System.out.print("Masukkan b: ");
        equation.setB(input.nextDouble());
        System.out.print("Masukkan c: ");
        equation.setC(input.nextDouble());
        System.out.print("Masukkan d: ");
        equation.setD(input.nextDouble());
        System.out.print("Masukkan e: ");
        equation.setE(input.nextDouble());
        System.out.print("Masukkan f: ");
        equation.setF(input.nextDouble());

        // Memeriksa apakah persamaan dapat dipecahkan
        if (equation.isSolvable()) {
            System.out.println("Solusi: x = " + equation.getX() + ", y = " + equation.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi");
        }

        input.close();
    }
}