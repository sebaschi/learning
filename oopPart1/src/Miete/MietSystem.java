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
		if(!flats.contains(flat)) {
			throw new IllegalArgumentException();
		} else {
			flats.remove(flat);
		}
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

	public void createFlat(String name, int price) throws IllegalArgumentException {
		if(price < 0) {
			throw new IllegalArgumentException();
		} else {
			for(Flat temp : flats) {
				if(temp.getName().contentEquals(name)) {
					throw new IllegalArgumentException();
				}
			}
		}
		Flat newFlat = new Flat(name, price, true);
		flats.add(newFlat);
	}

	public int getMaxPrice() {
		Collections.sort(flats);
		return flats.get(flats.size()-1).getPrice();
	}

	public void sellFlat(Flat flat, MietSystem other) {
		// TODO: Implementieren Sie die Methodm e
	}
	
	public List<Flat> getOccupied() {
		ArrayList<Flat> occupied = new ArrayList<>(flats.size()-1);
		for(Flat temp : flats) {
			if(temp.isOccupied()) {
				occupied.add(temp);
			}
		}
		return occupied;
	}
	
	public void printFlats() {
		Collections.sort(flats);
	}
	
	public void becomeCompetitive(int reduction) throws IllegalArgumentException{
		if(reduction < 0) {
			throw new IllegalArgumentException();
		}
		for(Flat reds : flats) {
			if(reds.isOccupied() == false) {
				if(reds.getPrice()-reduction < 300) {
					reds.setPrice(300);
				} else {
					reds.setPrice(reds.getPrice()-reduction);
				}
			}
		}
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
