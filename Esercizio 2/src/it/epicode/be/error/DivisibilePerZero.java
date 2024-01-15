package it.epicode.be.error;

public class DivisibilePerZero extends ArithmeticException {
    public DivisibilePerZero() {
        super("Non si può dividere per zero");
    }
}
