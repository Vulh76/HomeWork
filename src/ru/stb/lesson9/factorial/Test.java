package ru.stb.lesson9.factorial;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        try {
            factorial.calc("src\\ru\\stb\\lesson9\\factorial\\test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}