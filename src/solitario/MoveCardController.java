package solitario;

import java.util.Stack;

public class MoveCardController {
	
	private Stack<Card> cardsDeckStack;
	private Stack<Card> cardsWasteStack;
	private final int CARTASROBAR = 3;

	public MoveCardController(Stack<Card> baraja, Stack<Card> descartes) {
		this.cardsDeckStack = baraja;
		this.cardsWasteStack = descartes;
	}

	public Stack<Card> getWasteCards() {
		return cardsWasteStack;
	}

	public void moverBarajaADescarte() {
		for(int i = 0; i<CARTASROBAR; i++){
			Card card = cardsDeckStack.pop();
			card.flip();
			cardsWasteStack.push(card);
		}
	}

}
