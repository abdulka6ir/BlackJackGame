package coe318.lab5;

import java.util.ArrayList;
import java.util.Random;


public class CardPile {
    
    private ArrayList<Card> cards;
    
    
    public CardPile() {
        cards = new ArrayList();
    }
    
    

    public void add(Card card) {
        this.cards.add(card);
    }

    

    public Card removeRandom() {
        Random rand = new Random();
        int RANDOMS = rand.nextInt(this.cards.size());
        Card _remove = this.cards.remove(RANDOMS);
        
        return _remove;
    }


    @Override
    public String toString() {
        String vars = "";
        for (Card NOW : this.cards) {
            vars += NOW.toString() + "\n";
        }
        return "\n" + vars;
    }
    
    

    public ArrayList<Card> getCards() {
        return cards;
    }


    
    public static void main(String[] args) {
        CardPile p = new CardPile();
        p.add(new Card(2, 1, true));
        p.add(new Card(3, 2, true));
        p.add(new Card(4, 3, false));
        p.add(new Card(14, 1, true));
        
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("");
        
        
        CardPile deck = new CardPile();
        
        for(int i = 2; i < 15; i++) {
            for(int j = 0; j < 4; j++) {
                deck.add(new Card(i, j, true));
            }
        }
        
        
        for (int i = 0; i < 52; i++) {
            System.out.println((i+1) + ": " + deck.removeRandom());
        }
        
    }


}