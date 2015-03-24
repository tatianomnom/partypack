package com.leveluptor.partypack;

import java.util.Arrays;

/**
 * TODO add description
 */
public class Launcher {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(1, 2, 3).stream().anyMatch(x -> x > 3));
    }
}
