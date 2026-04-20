package edu.etec.ds.fundamentos
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

fun suma(a: Int, b: Int): Int {
    return a + b;
}

fun resta(a: Int, b: Int): Int {
    return a - b;
}

fun multiplicacion(a: Int, b: Int): Int {
    return a * b;
}

fun division(a: Int, b: Int): Int {
    return a / b;
}

fun modulo(a: Int, b: Int): Int {
    return a % b;
}

fun esMayorQue(a: Int, b: Int): Boolean {
    if (a > b) {
        return true
    }
    else{
     return false
    }
}

fun esMenorQue(a: Int, b: Int): Boolean {
    if (a < b) {
        return true
    }
    else{
        return false
    }
}

fun sonIguales(a: Int, b: Int): Boolean {
    if (a == b) {
        return true
    }
    else{
        return false
    }
}

fun esPar(numero: Int): Boolean {
    if (numero % 2 == 0) {
        return true
    }
    else{
        return false
    }
}

fun esImpar(numero: Int): Boolean {
    if (numero % 2 != 0) {
        return true
    }
    else{
        return false
    }
}

fun valorAbsoluto(numero: Int): Int {
    return abs( (numero));
}

fun maximo(a: Int, b: Int): Int {
    return max(a,b);
}

fun minimo(a: Int, b: Int): Int {
    return min(a,b);
}
