package etu.leti.field;

import etu.leti.ore.Ore;

public class Cell {
    private int posX;
    private int posY;
    private Ore ore;
    private boolean checked;

    public Cell() { }

    public Cell(int posX, int posY, Ore ore) {
        this.posX = posX;
        this.posY = posY;
        this.ore = ore;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public Ore getOre() {
        return ore;
    }

    public void setOre(Ore ore) {
        this.ore = ore;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
