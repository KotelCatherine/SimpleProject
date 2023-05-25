package ru.geekbrains;


import ru.geekbrains.SimpleOperation.MathOperation;
import ru.geekbrains.SimpleOperation.OutputFormatting;

public class Main {
    public static void main(String[] args) {
        int result = MathOperation.add(5, 1);
        System.out.println(OutputFormatting.outputFormat(result));

        result = MathOperation.sub(5, 1);
        System.out.println(OutputFormatting.outputFormat(result));

        result = MathOperation.mul(5, 1);
        System.out.println(OutputFormatting.outputFormat(result));

        result = MathOperation.div(5, 1);
        System.out.println(OutputFormatting.outputFormat(result));
    }
}