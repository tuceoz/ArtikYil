import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int yil;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir yıl girin: ");
        yil = input.nextInt();
        if (!(yil % 400 == 0)){
            if (!(yil % 100 == 0)){
                if(yil % 4 == 0){
                    System.out.println("Artık yıldır.");
                }
                else
                    System.out.println("Artık yıl değildir.");
            }
            else
                System.out.println("Artık yıl değildir."));
        }
        else
            System.out.println("Artık yıldır.");
    }
}