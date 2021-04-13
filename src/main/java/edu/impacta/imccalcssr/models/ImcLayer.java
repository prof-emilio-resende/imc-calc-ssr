package edu.impacta.imccalcssr.models;

public class ImcLayer {
    private double bottom;
    private double top;
    private String description;

    public ImcLayer() {
        super();
    }

    public ImcLayer(double bottom, double top, String description) {
        super();
        this.bottom = bottom;
        this.top = top;
        this.description = description;
    }

    public String getLabel() {
        return String.format("%.2f - %.2f", this.bottom, this.top);
    }

    public double getBottom() {
        return bottom;
    }

    public void setBottom(double bottom) {
        this.bottom = bottom;
    }

    public double getTop() {
        return top;
    }

    public void setTop(double top) {
        this.top = top;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
}
