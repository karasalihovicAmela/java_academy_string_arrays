package com.company;

public class Main {

    public static void main(String[] args) {

        //Stringovi
        String firstWord = "Hello";
        String secondWord = "World";
        String thirdWord = firstWord.concat(secondWord);
        String fourthWord = firstWord + " " + secondWord;
        int firstLenght = thirdWord.length();
        int secontLenght = fourthWord.length();
        String fifthWord = "Hello \nWorld!";
        System.out.println("Firs word: " + firstWord);
        System.out.println("Second word: " + secondWord);
        System.out.println("Third word: " + thirdWord);
        System.out.println("Fourth word: " + fourthWord);
        System.out.println("First lenght: " + firstLenght);
        System.out.println("Second lenght: " + secontLenght);
        System.out.println("Fifth word: " + fifthWord);

        //Nizovi primjeri
        int[] newArray = new int[3];
        newArray[0] = 1;
        newArray[1] = 2;
        newArray[2] = 3;

        System.out.println("Vrijednost 0 elementa " + newArray[0]);
        System.out.println("Vrijednost 1 elementa " + newArray[1]);
        System.out.println("Vrijednost 2 elementa " + newArray[2]);

        int[] newIntArray = new int[]{2, 3, 6, 8};

        System.out.println("Vrijednost 0 elementa " + newIntArray[0]);
        System.out.println("Vrijednost 1 elementa " + newIntArray[1]);
        System.out.println("Vrijednost 2 elementa " + newIntArray[2]);
        System.out.println("Vrijednost 3 elementa " + newIntArray[3]);

        double[][] newDoubleArray = new double[2][2];
        newDoubleArray[0][0] = 1.2;
        newDoubleArray[0][1] = 2.3;
        newDoubleArray[1][0] = 3.2;
        newDoubleArray[1][1] = 4.6;

        System.out.println("Vrijednost 0, 0 elementa " + newDoubleArray[0][0]);
        System.out.println("Vrijednost 0, 1 elementa " + newDoubleArray[0][1]);
        System.out.println("Vrijednost 1, 0 elementa " + newDoubleArray[1][0]);
        System.out.println("Vrijednost 1, 1 elementa " + newDoubleArray[1][1]);


        int[][] arrayInt = new int[][]{{2, 3, 4},
                                        {5, 6, 7},
                                        {9, 8, 1}};

        System.out.println(arrayInt[0][0] + " " + arrayInt[0][1] + " " + arrayInt[0][2]);
        System.out.println(arrayInt[1][0] + " " + arrayInt[1][1] + " " + arrayInt[1][2]);
        System.out.println(arrayInt[2][0] + " " + arrayInt[2][1] + " " + arrayInt[2][2]);

        arrayInt[0][0] = arrayInt[0][1] + arrayInt[0][2];

        System.out.println(arrayInt[0][0] + " " + arrayInt[0][1] + " " + arrayInt[0][2]);
        System.out.println(arrayInt[1][0] + " " + arrayInt[1][1] + " " + arrayInt[1][2]);
        System.out.println(arrayInt[2][0] + " " + arrayInt[2][1] + " " + arrayInt[2][2]);

        double[][][] newArr = new double[2][2][2];


        String string = "Danas je subota";
        String[] stringArray = string.split(" ");
        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        //Nizovi zadatak
        int[] arrayOne = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = arrayOne[1] + arrayOne[3] + arrayOne[5] + arrayOne[7] + arrayOne[9];
        System.out.println("Sum " + sum);
        int[][] arrayTwo = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("[1][1] " + arrayTwo[1][1]);
        System.out.println("Sum colon " + (arrayTwo[0][0] + arrayTwo[1][0] + arrayTwo[2][0]));
    }
}
