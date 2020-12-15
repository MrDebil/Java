package ru.chalovai.PR13.Task3;

import ru.chalovai.PR13.Task3.Objects.Const;
import ru.chalovai.PR13.Task3.Objects.Variable;
import ru.chalovai.PR13.Task3.Operations.Add;
import ru.chalovai.PR13.Task3.Operations.Multiply;
import ru.chalovai.PR13.Task3.Operations.Subtract;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.println(
                new Add(
                        new Subtract(
                                new Multiply(
                                        new Variable("x"),
                                        new Variable("x")
                                ),
                                new Multiply(
                                        new Const(2),
                                        new Variable("x")
                                )
                        ),
                        new Const(1)
                ).evaluate(x, x, x));
    }
}
