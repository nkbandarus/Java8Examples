package com.practice.Enum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deal {
    public static void main(String args[]) {
        //int numHands = Integer.parseInt(args[0]);
        //int cardsPerHand = Integer.parseInt(args[1]);
        List<Card> deck  = Card.newDeck();
        System.out.println("Before Shuffle "+deck);
        Collections.shuffle(deck);
        System.out.println("After Shuffle "+deck);
        //for (int i=0; i < numHands; i++)
            //System.out.println(deal(deck, cardsPerHand));
    }

    public static ArrayList<Card> deal(List<Card> deck, int n) {
         int deckSize = deck.size();
         List<Card> handView = deck.subList(deckSize-n, deckSize);
         ArrayList<Card> hand = new ArrayList<Card>(handView);
         handView.clear();
         return hand;
     }
}