package org.example;

public class Main {
    public static void main(String[] args) {
        //double[] myList = new double[4];
        double[] myList = {1.1,1.2,1.3,1.4};
        double total =0;
        double max = 0;

        for (double number:myList) {
            if(max<number){
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam : " + total);
        System.out.println("En Büyük : " + max);

    }
}