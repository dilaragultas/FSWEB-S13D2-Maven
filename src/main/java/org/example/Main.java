package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(numberToWords(1010));

    }

    public static boolean isPalindrome(int sayi){
        sayi = Math.abs(sayi);
        String formattedSayi = Integer.toString(sayi);
        char [] arr = formattedSayi.toCharArray();
        String tersFormatted = "";
        for (int i= arr.length-1; i>=0; i-- ){
            tersFormatted+= arr[i];
        }
        return formattedSayi.equals(tersFormatted);

    }

    public static boolean isPerfectNumber(int sayi){
        if (sayi < 0) {
            return false;
        }
        int toplam = 0;
        for (int i = 1; i<= sayi/2; i++){
            if (sayi%i == 0) {
                toplam+= i;
            }
        }
        return sayi == toplam;
    }

    public static String numberToWords(int sayi) {
        if (sayi< 0){
            return "Invalid Value";
        }
        String word = Integer.toString(sayi);
        String [] numbers = word.split("");
        String kelimeler = "";
        for (int i=0; i< numbers.length; i++){
            switch (numbers[i]){
                case "0":
                    kelimeler+= "Zero ";
                break;
                case "1":
                    kelimeler+= "One ";
                break;
                case "2":
                    kelimeler+= "Two ";
                    break;
                case "3":
                    kelimeler+= "Three ";
                    break;
                case "4":
                    kelimeler+= "Four ";
                    break;
                case "5":
                    kelimeler+= "Five ";
                    break;
                case "6":
                    kelimeler+= "Six ";
                    break;
                case "7":
                    kelimeler+= "Seven ";
                    break;
                case "8":
                    kelimeler+= "Eight ";
                    break;
                case "9":
                    kelimeler+= "Nine ";
                    break;
            }
        }
        return kelimeler.trim();
    }
}
