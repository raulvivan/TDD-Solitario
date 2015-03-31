package solitario;

import java.util.ArrayList;
import java.util.Random;



public class StartController {

	public boolean isEmptyAllFoundations() {
		
		return true;
	}

	public ArrayList<Card> peeksEachTableau() {
		ArrayList<Card> peeksEachTableau = new ArrayList<Card>();
		for(int i = 0; i<7 ; i++){
			Card card;
			do{
				Random r = new Random();
				card = new Card(r.nextInt(3), r.nextInt(11), true);
				
			}while(peeksEachTableau.contains(card));
			{
				peeksEachTableau.add(card);
			}
		}
		return peeksEachTableau;
	}

	public ArrayList<ArrayList<Card>> getPilasTapadas() {
		ArrayList<ArrayList<Card>> pilas = new ArrayList<ArrayList<Card>>();
		for(int i = 0; i<7 ; i++){
			int numCartas = 0;
			Card card;
			ArrayList<Card> cartas = new ArrayList<Card>();
			for(int j = 0; j<numCartas; j++){
				do{
					Random r = new Random();
					card = new Card(r.nextInt(3), r.nextInt(11), false);
					
				}while(cartas.contains(card));
				{
					cartas.add(card);
				}
			}
			numCartas++;
			pilas.add(cartas);
		}
		return pilas;
	}

}
