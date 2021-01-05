import java.util.Scanner;

public class numberPi {
    public static void main(String[] args){
        //Ввод числа для колличества чисел после запятой
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of pi: ");
        int num = in.nextInt();

        //Вычисление Pi по формуле Джона Мачина
        double nump = 16 * Math.atan(1.0 / 5) - 4 * Math.atan(1.0 / 235);

        System.out.printf("%." + num + "f", nump);
    }
}
