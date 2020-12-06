package Miete;

import java.util.*;

public class MietSystem {

	private List<Flat> flats;
	
	public MietSystem() {
		flats = new ArrayList<Flat>();
	}
	public void addFlat(Flat flat) throws IllegalArgumentException{
		if(flats.contains(flat)) {
			throw new IllegalArgumentException();
		} else {
			flats.add(flat);
		}
	}

	public void removeFlat(Flat flat) {
		// TODO: Implementieren Sie die Methode
	}

	public void changePrice(Flat flat, int pricediff) {
		// TODO: Implementieren Sie die Methode
	}

	public Flat getFlat(String name) {
		for(Flat tempFlat: flats) {
			if(tempFlat.getName().equals(name)) {
				return tempFlat;
			}
		} 
		return null;
	}

	public void createFlat(String name, int price) {
		// TODO: Implementieren Sie die Methodejj
	}

	public int getMaxPrice() {
		Collections.sort(flats);
		return flats.get(flats.size()-1).getPrice();
	}

	public void sellFlat(Flat flat, MietSystem other) {
		// TODO: Implementieren Sie die Methodm e
	}
	
	public void becomeCompetitive(int reduction) {
		
	}

	// TODO: Erstellen Sie eine Methode getOccupied, welche eine Liste aller
	// belegten Wohnungen zurueckgibt

	// TODO: Erstellen Sie eine Methode printFlats, welche auf die Konsole einen
	// Ueberblick ueber
	// alle Wohnungen druckt, etwa so:
	/*
	 * Name: Shack - Preis: 500CHF - * Belegt: Nein
	 * 
	 * Name: Penthouse - Preis: 3000CHF - Belegt: Ja
	 * 
	 * Name: Abode - Preis: 7000CHF - Belegt: Ja
	 * 
	 *
	 */
	// Die Wohnungen sollen umgekehrt alphabetisch sortiert ausgegeben werden.

	// TODO: Erstellen Sie eine Methode becomeCompetitive, welche den Preis aller
	// unbelegten Wohnungen um so viele Franken reduziert wie das Argument angibt. Der Preis soll aber niemals unter
	// 300CHF fallen.

}
