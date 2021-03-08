package com.dev.java.interview.sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class ComparatorDemo implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getScore() == o2.getScore()) {
            return o1.getName().compareTo(o2.getName());
        }
        // o1 - o2 Asc or o2 - o1 desc
        return o1.getScore() - o2.getScore();
    }

    public static void main(String[] args) {
//        Player player = new Player("Gayle", 10000);
        Player player1 = new Player("Kohli", 20000);
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player("Gayle", 10000));
        players.add(player1);
        players.add(new Player("Dhoni", 10000));
        players.add(new Player("Yuvraj", 15000));

        ComparatorDemo comparatorDemo = new ComparatorDemo();
        players.sort(comparatorDemo);
        for (Player player : players) {
            System.out.println(player.getName());
            System.out.println(player.getScore());
        }


    }
}
