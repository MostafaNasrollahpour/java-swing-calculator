package com.mostafanasrollahpour.calculator;

import javax.swing.SwingUtilities;

public class Startup {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Calculator::new);
    }
}