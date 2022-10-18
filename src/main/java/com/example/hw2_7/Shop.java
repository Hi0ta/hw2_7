package com.example.hw2_7;
import java.util.ArrayDeque;
import java.util.Queue;

public class Shop {
    private String name;


    public Shop(String name) {this.name = name;}
    public String getName() {return name;}
    private static Queue<Shop> queueA = new ArrayDeque<Shop>(5);
    private static Queue<Shop> queueB = new ArrayDeque<>(5);

    public static Queue<Shop> getQueueA() {return queueA;}
    public static Queue<Shop> getQueueB() {return queueB;}

    public static void addClientA(Shop shop){
        queueA.offer(shop);
    }
    public static void addClientB(Shop shop){
        queueB.offer(shop);
    }

    public static void plusClient(Shop shop) {
        if (queueA.size() == 5 && queueB.size() ==5){
            System.out.println("позовите Галю!!!");
        }else if (queueA.size() == queueB.size()){
            System.out.println("очереди равны, я не знаю куда лучше мне встать");
            if (getRandom(0.00, 1.00) == 1.00) {
                queueA.offer(shop);
                System.out.println("пожалуй выберу очередь А");
            } else {
                queueB.offer(shop);
                System.out.println("пожалуй выберу очередь B");
            }
        }else if (queueA.size() < queueB.size()) {
            queueA.offer(shop);
            System.out.println("клиент добавлен в очередь A");
        } else {
            queueB.offer(shop);
            System.out.println("клиент добавлен в очередь B");
        }
    }


    public static double getRandom(double min, double max){
        double x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }
    public static void minusClient(){

        if (queueA.size()==0 || queueB.size()==0) {
            System.out.println("свободная касса");
        } else if (getRandom(0.00, 1.00) == 1.00) {
                Shop shop = queueA.poll();
            System.out.println("клиент удален из очереди А");
            } else {
                Shop shop = queueB.poll();
            System.out.println("клиент удален из очереди B");
            }
        }


}
