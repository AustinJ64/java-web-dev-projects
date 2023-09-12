package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a quote: ");
        String quote;
        quote = input.nextLine().toLowerCase();


        HashMap<Character, Integer> letterMap = new HashMap<>();

        for (char c : quote.toCharArray()) {

            if (!letterMap.containsKey(c)){
                letterMap.put(c, 1);
            } else {
              int num = letterMap.get(c);
                num++;
                letterMap.put(c, num);
            }
        }
        System.out.println(letterMap);
    }
}
