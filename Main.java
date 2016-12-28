package com.creteil.iut.classmanagement;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private List<Composant> stockList;

    public static void main(String[] args) {
	// write your code here
    }

    private int[] getReferences(int nbreDeReference){
       return new int[nbreDeReference];
    }

    private void removeComposantFromStock(int composantToRemoveReference){
        List<Composant> toRemove = new ArrayList<>();
        for(Composant composant: stockList){
            if(composant.getReference() == composantToRemoveReference){
                toRemove.add(composant);
            }
        }
        stockList.removeAll(toRemove);
    }

    private void addComposantToStock(Composant composant){
        stockList.add(composant);
    }

    private void editCompanyState(){
        System.out.println("list des composants en stock: " + stockList.size());
    }

    private boolean hasDifferentReference(Composant composant1, Composant composant2){
        return composant1.getReference() != composant2.getReference();
    }
}
