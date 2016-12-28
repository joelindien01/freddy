package com.creteil.iut.classmanagement;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private List<Composant> stockList;

    public static void main(String[] args) {
	
	    Initialise un stock vide
	    stockList = new ArrayList<>();
    }

	// création d'un tableau de "nbreDeReference" éléments
    private int[] getReferences(int nbreDeReference){
       return new int[nbreDeReference];
    }

	// enlève les composants du stock
    private void removeComposantFromStock(int composantToRemoveReference){
        List<Composant> toRemove = new ArrayList<>();
        for(Composant composant: stockList){
            if(composant.getReference() == composantToRemoveReference){
                toRemove.add(composant);
            }
        }
        stockList.removeAll(toRemove);
    }

	// ajoute un composant au stock
    private void addComposantToStock(Composant composant){
        stockList.add(composant);
    }

	// affiche le nbre de composant au total dans le stock
    private void editCompanyState(){
        System.out.println("list des composants en stock: " + stockList.size());
    }

	// retourn true si les 2 composants ont un statut différent et false au cas contraire
    private boolean hasDifferentReference(Composant composant1, Composant composant2){
        return composant1.getReference() != composant2.getReference();
    }
}
