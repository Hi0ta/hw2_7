package com.example.hw2_7;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void example() {
       List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
               if ((i + j) % 2 != 0) {
                    biDemArrList.get(i).add(j, "●");
                }else {
                   biDemArrList.get(i).add(j, "◯");
               }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Shop client1 = new Shop("клиент1");
        Shop client2 = new Shop("клиент2");
        Shop client3 = new Shop("клиент3");
        Shop client4 = new Shop("клиент4");
        Shop client5 = new Shop("клиент5");
        Shop client6 = new Shop("клиент6");
        Shop client7 = new Shop("клиент7");
        Shop client8 = new Shop("клиент8");
        Shop client9 = new Shop("клиент9");
        Shop client10 = new Shop("клиент10");
        Shop client11 = new Shop("клиент11");
        Shop.addClientA(client2);
        Shop.addClientA(client3);
        Shop.addClientA(client4);
        Shop.addClientA(client8);
        Shop.addClientA(client9);
        Shop.addClientB(client7);
        Shop.addClientB(client1);
        Shop.addClientB(client5);
        Shop.addClientB(client6);
        Shop.minusClient();
        Shop.plusClient(client10);
        System.out.println("в очереди А " + Shop.getQueueA().size() + " чел " + "в очереди В " + Shop.getQueueB().size() + " чел");
        Shop.minusClient();
        Shop.minusClient();
        Shop.minusClient();
        Shop.minusClient();
        Shop.plusClient(client11);
        System.out.println("в очереди А " + Shop.getQueueA().size() + " чел " + "в очереди В " + Shop.getQueueB().size() + " чел");
        System.out.println();

       Main.example();

    }
}
