package com.bridgelabz.deckofcard;

public class Card 
{
	private int number, colors;

	private static String[] Colors = { "Hearts", "Spades", "Diamonds", "Clubs" };
	private static String[] Number  = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Knave", "Queen", "King" };

	Card(int Cardcolors, int Cardnumber)
	{
    	this.number=Cardnumber;
    	this.colors=Cardcolors;
	}
	@Override
	public  String toString()
	{
     return Number[number] + " of " + Colors[colors];
	}

	public int getRank() 
	{
    	return number;
	}

	public int getSuit() 
	{
    	return colors;
	}
}
