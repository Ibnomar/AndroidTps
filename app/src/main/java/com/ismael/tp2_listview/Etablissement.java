package com.ismael.tp2_listview;

/**
 * Created by ismael on 20/03/16.
 */
public class Etablissement {
    private String label;
    private String nom;
    private int img;

    public Etablissement(String label,String nom, int img){
        this.label=label;
        this.nom=nom;
        this.img=img;
    }

    public String getLabel() {
        return label;
    }

    public String getNom() {
        return nom;
    }

    public int getImg() {
        return img;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
