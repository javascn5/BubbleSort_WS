package com.sda.sort;

public class Main {

    public static void main(String[] args) {

        int tab[] = {1, 33, 32, 5, 12, 45, 342, -3, 32};

        for (int i = 0; i <tab.length; i++){
            System.out.println(tab[i]);
        }

        for (int i = 0; i < tab.length - 1; i++){
            for (int j = 0; j < tab.length - 1; j ++){

                if(tab[j] > tab[j + 1]){
                    int tmp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < tab.length; i++){
            System.out.println(tab[i]);
        }
    }
}
