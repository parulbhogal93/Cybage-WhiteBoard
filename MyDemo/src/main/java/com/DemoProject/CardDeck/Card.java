package com.DemoProject.CardDeck;

import java.util.Random;

public class Card {

	public static final String[] RANKS = { null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
	public static final String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };
	private final int rank;
	private final int suit;

	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public String toString() {
		return RANKS[this.rank] + " of " + SUITS[this.suit];
	}

	public static Card[] makeDeck() {
		Card[] cards = new Card[40];
		int index = 0;
		for (int suit = 0; suit <= 3; suit++) {
			for (int rank = 1; rank <= 10; rank++) {
				cards[index] = new Card(rank, suit);
				index++;
			}
		}
		return cards;
	}

	 //Display the given deck of cards.
	public static void printDeck(Card[] cards) {
		for (int i = 0; i < cards.length; i++) {
			System.out.println(cards[i]);
		}
	}

	public static void main(String[] args) {
		Card[] cards = makeDeck();
		printDeck(cards);
		int n = cards.length;
		randomize(cards, n);
	}

	// A Function to generate a random permutation of arr[]
	static void randomize(Card[] cards, int n) {
		// Creating a object for Random class
		Random r = new Random();

		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n - 1; i > 0; i--) {

			// Pick a random index from 0 to i
			int j = r.nextInt(i + 1);

			// Swap arr[i] with the element at random index
			Card temp = cards[i];
			cards[i] = cards[j];
			cards[j] = temp;
		}
		// Prints the random array
		System.out.println("After shuffling---------");
		printDeck(cards);
	}

}