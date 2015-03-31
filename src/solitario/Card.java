package solitario;

public class Card {

	private int suit;
	private int number;
	private boolean uncovered;

	public Card(int suit, int number, boolean uncovered) {
		this.suit = suit;
		this.number = number;
		this.uncovered = uncovered;

	}

	public boolean uncovered() {
		return true;
	}

	@Override
	public boolean equals(Object object){
		assert object instanceof Card;
		Card card = (Card) object;
		return card.suit == suit && card.number == number;
		
	}
}
