package org.example.calculator.refactored;

import java.security.PublicKey;

public class ImpuestoExtra implements ImpEstrategia{
    private static final double EXTRA_RATE=0.10;

    @Override
    public double calcular(double amount){
        return amount * EXTRA_RATE;
    }

}
