package com.bridgelabz.deckofcard;
import java.util.Random;

public class Deck {
	private Card[] cards;
	int i;
	Main m = new Main();
	int y = m.GetInput();

	Deck(){
    	i=y;
    	cards = new Card[52];
    	int x=0;
    	for (int a=0; a<=4; a++){
    		for (int b=0; b<=9; b++){
    			cards[x] = new Card(a,b);
            	x++;
            	}
        	}
    	}

	public Card drawFromDeck(){
    	Random generator = new Random();
    	int index=0;

    	do{
        	index = generator.nextInt( 52 );
        	} while (cards[index] == null);

    	i--;
    	Card temp = cards[index];
    	cards[index]= null;
    	return temp;
	}
	public int getTotalCards(){
    	return i;
	}
}
