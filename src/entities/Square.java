package entities;

import enums.Color;

public class Square extends Shape {

    private Double value;

    public Square() {
        super();
    }

    public Square(Color color, Double value) {
        super(color);
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public double area() {
        return value * value;
    }
}
