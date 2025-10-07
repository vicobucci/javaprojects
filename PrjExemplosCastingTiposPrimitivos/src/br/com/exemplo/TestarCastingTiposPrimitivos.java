package br.com.exemplo;
/*
 * esta classe demonstra Casting em tipos primitivos
 */

public class TestarCastingTiposPrimitivos {

    public static void main(String[] args) {

        byte b = 1;
        short c = 126;
        int i = 1000;

        System.out.println("Antes de aplicar Casting em Tipos Primitivos");
        System.out.println("Valor de b: " + b);
        System.out.println("Valor de c: " + c);
        System.out.println("Valor de i: " + i);

        b = (byte) c;
        c = (short) i;
        i = b;

        System.out.println("\nDepois aplicar Casting em Tipos Primitivos");
        System.out.println("Valor de b: " + b);
        System.out.println("Valor de c: " + c);
        System.out.println("Valor de i: " + i);

    }
}
