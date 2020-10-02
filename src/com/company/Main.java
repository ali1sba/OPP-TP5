package com.company;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Formation {


    private String codeDeFormation ;
    private ArrayList <Etudient > listeEtudient  ;
    //private static int cpt = 0;

    //constracture
    public Formation (String code){
        this.codeDeFormation = code;
        this.listeEtudient = new ArrayList<Etudient>();
    }

    //getter and setter
    public String getCodeDeFormation() {
        return codeDeFormation;
    }

    public void setCodeDeFormation(String codeDeFormation) {
        this.codeDeFormation = codeDeFormation;
    }

    public ArrayList<Etudient> getListeEtudient() {
        return listeEtudient;
    }

    public void setListeEtudient(ArrayList<Etudient> listeEtudient) {
        this.listeEtudient = listeEtudient;
    }
/*
    public static int getCpt() {
        return ++cpt;
    }

    public static void setCpt(int cpt) {
        Formation.cpt = cpt;
    }
*/
    //methode

    //q1

    public void addEtudient (Etudient e){
        listeEtudient.add(e);
    }

    //q3
    List <Etudient> trouver (String name){
        LinkedList <Etudient> list = new LinkedList<Etudient>();
        Iterator <Etudient> iterator = listeEtudient.iterator();
        while (iterator.hasNext()){
                Etudient e =iterator.next();
                if (e.getNom() == name) {
                    list.addLast(e);
                }
        }


        return list ;
    }

}




class Etudient {


    private int matricule;
    private String nom ;

    //constucteur
    public Etudient (String nom , int matricule){
        this.nom = nom;
        this.matricule = matricule;
    }

    //getter and setter
    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


}


public class Main {

    public static void main(String[] args) {

        Formation java = new Formation("azert");

        java.addEtudient(new Etudient("ali",1));
        java.addEtudient(new Etudient("karim",2));
        java.addEtudient(new Etudient("mohamed",3));
        java.addEtudient(new Etudient("dalah",4));
        java.addEtudient(new Etudient("sarar",5));

    }
}
