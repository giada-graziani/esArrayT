package com.example;
public class ThreadA extends Thread{
    int[] array=new int[10];
    int j;

    public ThreadA(int[] array, int j){
        this.array= array;
        this.j=j;
    }
    public void run(){
        int num = (int) (Math.random()*100)+1;
        array[j]= num;
    }

}
