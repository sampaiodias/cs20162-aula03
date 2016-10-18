/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.kyriosdata.exemplo;

/**
 * Algoritmos matemáticos das listas 02 e 03 de Construção de Software.
 */
public final class Algoritmos {

    /**
     * Construtor.
     */
    private Algoritmos() {

    }
    /**
     * Um somatório envolvendo os primeiros números naturais.
     *
     * @param n número de repetições do somatório
     * @return resultado do somatório
     */
    public static float somatorioElementar(final int n) {
        int i = 1;
        float s = 0;

        if (1 <= n) {
            while (i <= n) {
                int d = 1 + (int) Math.pow(i, 2);
                s += 1.0f / d;
                i++;
            }
        } else {
            throw new IllegalArgumentException("Erro: n < 1");
        }

        return s;
    }

    /**
     * Calcula o valor de PI através de um somatório.
     *
     * @param n número de repetições do somatório
     * @return valor de PI
     */
    public static float pi(final int n) {
        int i = 1;
        float s = -1;
        float d = -1;
        float p = 0;

        if (1 <= n) {
            while (i <= n) {
                d = d + 2;
                s *= -1;
                p = p + 4 * s / d; //4 é parte de uma equação matemática
                i++;
            }
        } else {
            throw new IllegalArgumentException("Erro: n < 1");
        }
        return p;
    }

    /**
     * Calcula o fatorial de um número natural n.
     *
     * @param n valor base
     * @return fatorial de n
     */
    public static int fatorial(final int n) {
        int i = 2;
        int f = 1;

        if (1 <= n) {
            while (i <= n) {
                f *= i;
                i++;
            }
        } else {
            throw new IllegalArgumentException("Erro: n < 1");
        }

        return f;
    }

    /**
     * Calcula o logaritmo natural de um número natural positivo n.
     *
     * @param n Número base, sendo n maior ou igual a 1
     * @param k Repetições, sendo k maior ou igual a 2
     * @return valor do logaritmo natural de n
     */
    public static float logaritmoNatural(final int n, final int k) {
        int i = 2;
        float e = n + 1;

        if (1 <= n && 2 <= k) {
            while (i <= k) {
                double p = Math.pow(n, i);
                float f = fatorial(i);
                e += p / f;
                i++;
            }
        } else {
            throw new IllegalArgumentException("Erro: Parâmetro(s) inválido!");
        }

        return e;
    }

    /**
     * Calcula a razão áurea com dois inteitos positivos em k repetições.
     *
     * @param x x maior ou igual a 0
     * @param y y maior que x
     * @param k k maior que 0
     * @return Valor da razão áurea
     */
    public static float razaoAurea(final int x, final int y, final int k) {
        int c = y;
        int a = x;
        int i = 1;

        if (0 <= x && x < y && 0 < k) {
            while (i <= k) {
                int t = c;
                c += a;
                a = t;
                i++;
            }
        } else {
            throw new IllegalArgumentException("Erro: Parâmetro(s) inválido!");
        }

        return c / a;
    }

    /**
     * Verifica se o número fornecido é um quadrado perfeito.
     *
     * @param k número que será verificado
     * @return verdadeiro (é quadrado perfeito) ou falso
     */
    public static boolean quadradoPerfeito(final int k) {
        int i = 1;
        int q = 1;
        if (1 <= k) {
            while (q < k) {
                i += 2;
                q += i;
            }
        } else {
            throw new IllegalArgumentException("Erro: k < 1");
        }

        return q == k;
    }

    /**
     * Calcula o resto da divisão de dois inteiros.
     *
     * @param x dividendo
     * @param y divisor
     * @return resto da divisão
     */
    public static int mod(final int x, final int y) {
        int s = x;

        if (0 <= y && 0 < x) {
            while (y <= s) {
                s -= y;
            }
        } else {
            throw new IllegalArgumentException("Erro: Parâmetro(s) inválido!");
        }

        return s;
    }

    /**
     * Calcula a raiz pelo método babilônico de um número n.
     *
     * @param n Número desejado
     * @param i Quanto maior i, maior a aproximação da raiz desejada
     * @return Raiz
     */
    public static float raiz(final int n, final int i) {
        float r = 1;
        int repeticoes = i;

        if (0 < n) {
            while (0 <= repeticoes) {
                r = (r + n / r) / 2;
                repeticoes--;
            }
        } else {
            throw new IllegalArgumentException("Erro: n <= 0");
        }

        return r;
    }

    /**
     * Calcula o n-ésimo valor da sequência Fibonacci.
     *
     * @param n posição na sequência
     * @return valor buscado
     */
    public static int fibonacci(final int n) {
        int a = 0;
        int c = 1;

        if (0 <= n) {
            if (n == 0 || n == 1) {
                return n;
            }
            int i = 2;
            while (i <= n) {
                int t = c;
                c += a;
                a = t;
                i++;
            }
        } else {
            throw new IllegalArgumentException("Erro: n < 0");
        }

        return c;
    }
    /**
     * Conjunto de números para a avaliação de polinômio pela Regra de Horner.
     * @param x valor base
     * @param g índice do último número de ag
     * @param ag conjunto de números
     * @return 
     */
    public static float[] horner(final int x, final int g, final float[] ag){
        float p = ag[g];
        int i = g - 1;
        
        if (1 <= g) {
            while(0 <= i){
                p = p * x + ag[i];
                i--;
            }
        } else {
            throw new IllegalArgumentException("Erro: n < 0");
        }
        return ag;
    }
}
