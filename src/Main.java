import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        double yarıcap, alan, cevre, pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap değerini giriniz: ");
        yarıcap = input.nextInt();

        alan = pi * yarıcap * yarıcap;
        cevre = 2 * pi * yarıcap;

        System.out.println("Alan: " + alan);
        System.out.println("Çevre: " + cevre);


}
}