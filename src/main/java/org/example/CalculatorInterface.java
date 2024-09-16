package org.example;

public interface CalculatorInterface<T> {
    T sum(T a, T b);
    T sub(T a, T b);
    Double div(T a, T b);
    T multi(T a, T b);
}