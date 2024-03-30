package com.example;

public class Main {
    public static void main(String[] args) {
       int[] array=new int[10];
       ThreadA[] arrayT= new ThreadA[10];
       
       for(int i=0; i<arrayT.length; i++){
        arrayT[i] = new ThreadA(array, i);
       }

       for(int i =0; i< arrayT.length;i++){
        arrayT[i].start();
       }

       for(int i =0; i< arrayT.length;i++){
        try {
            arrayT[i].join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       }

       for(int i =0; i< arrayT.length;i++){
        System.out.println(array[i]);
       }
    }
}