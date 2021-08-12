package generics;

import java.util.Arrays;

public class G01OverloadedMethotlar {
    public static void main(String[] args) {

        Integer[] integerDizi = { 1, 2, 3, 4, 5, 6 };
        Double[] doubleDizi = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
        Character[] charDizi = { 'H', 'E', 'L', 'L', 'O' };


        System.out.println("Integer Dizi:");
        diziYazdır(integerDizi);
        System.out.println("Double Dizi:");
        diziYazdır(doubleDizi);
        System.out.println("Karakter Dizisi:");
        diziYazdır(charDizi);
        System.out.println("*************************");
        diziObject(integerDizi);
        diziObject(doubleDizi);
        diziObject(charDizi);

    }


//Overloaded Dizi yazdır methotları
    private static void diziYazdır(Integer[] integerDizi) {
        Arrays.stream(integerDizi).forEach(System.out::println);
    }

    private static void diziYazdır(Double[] doubleDizi) {
        Arrays.stream(doubleDizi).forEach(System.out::println);
    }
    private static void diziYazdır(Character[] charDizi) {
        Arrays.stream(charDizi).forEach(System.out::println);
    }

    //Super classdan dizi yazdır(object ile)

    private static void diziObject(Object[] diziObje) {
        Arrays.stream(diziObje).forEach(System.out::println);
    }
}
