package edu.impacta.imccalcssr.models;

public class Person {
    private double weight;
    private double height;
    private String imcDescription;
    private double imc = 0.00;

    public String toString() {
        return String.format("%.2f : %s", this.imc, this.imcDescription);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getImcDescription() {
        return imcDescription;
    }

    public void setImcDescription(String imcDescription) {
        this.imcDescription = imcDescription;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
}
