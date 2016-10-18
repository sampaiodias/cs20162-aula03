package com.github.kyriosdata.exemplo;


import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.github.kyriosdata.exemplo.Algoritmos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Testes dos algoritmos matemáticos das listas 02 e 03 de Construção de Software
 * @author Lucas Sampaio Dias
 */

public class AlgoritmosTest {
    @Test
    public void Teste01SomatorioElementar5() {
        assertEquals(0.7f, Algoritmos.somatorioElementar(2), 0.05f);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void Teste02SomatorioElementarErro() {
        assertEquals(0.7f, Algoritmos.somatorioElementar(-1), 0.05f);
    }
    
    @Test
    public void Teste03Pi(){
        assertEquals(3.14f, Algoritmos.pi(50), 0.1f);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void Teste04PiErro() {
        assertEquals(0, Algoritmos.pi(-1), 0.05f);
    }
    
    @Test
    public void Teste05Fatorial5() {
        assertEquals(120, Algoritmos.fatorial(5));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void Teste06FatorialErro() {
        assertEquals(0, Algoritmos.fatorial(-1));
    }
    
    @Test
    public void Teste07LogaritmoNatural5() {
        assertEquals(1.6f, Algoritmos.logaritmoNatural(5, 2), 0.1f);
    }
//    @Test
//    public void somaNaturais3igual6() {
//        assertEquals(6, Algoritmos.somaNaturais(3));
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void somaNaturaisErro3diferente6() {
//        Algoritmos.somaNaturais(-1);
//    }
//    
//    @Test
//    public void produto2x2igual4() {
//        assertEquals(4, Algoritmos.produto(2, 2));
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void produtoErroNegativox5(){
//        Algoritmos.produto(-1, 5);
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void produtoErro5xNegativo(){
//        Algoritmos.produto(5, -5);
//    }
//    
//    @Test
//    public void potencia2a2igual4() {
//        assertEquals(4, Algoritmos.potencia(2, 2));
//    }
//    
//    @Test
//    public void potencia3a4igual81() {
//        assertEquals(81, Algoritmos.potencia(3, 4));
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void potenciaErro5xNegativo(){
//        Algoritmos.potencia(5, -5);
//    }
//    
//    @Test
//    public void propriedade3025em3025() {
//        assertEquals(true, Algoritmos.propriedade3025(3025));
//    }
//    
//    @Test
//    public void propriedade3025em3024() {
//        assertEquals(false, Algoritmos.propriedade3025(3024));
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void propriedade3025Erro10000(){
//        Algoritmos.propriedade3025(10000);
//    }
//    
//    @Test
//    public void propriedade153em153() {
//        assertEquals(true, Algoritmos.propriedade153(153));
//    }
//    
//    @Test
//    public void propriedade153em154() {
//        assertEquals(false, Algoritmos.propriedade153(154));
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void propriedade153Erro10000(){
//        Algoritmos.propriedade153(10000);
//    }
//    
//    @Test
//    public void primo11() {
//        assertEquals(true, Algoritmos.primo(11));
//    }
//    
//    @Test
//    public void primo8() {
//        assertEquals(false, Algoritmos.primo(8));
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void primoErro0() {
//        assertEquals(false, Algoritmos.primo(0));
//    }
//    
//    @Test
//    public void crivoEratostenes(){
//        int a[] = new int[10];
//        Algoritmos.crivoEratostenes(a, 4);  
//    }
//    
//    @Test
//    public void mdc8e4igual4(){
//        assertEquals(4, Algoritmos.mdc(8, 4));
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void mdcErroNegativo(){
//        Algoritmos.mdc(-1, 2);
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void mdcErroXMenorQueY(){
//        Algoritmos.mdc(2, 3);
//    }
//    
//    @Test
//    public void numeroHarmonico2igual1ponto5(){
//        float x;
//        x = Algoritmos.numeroHarmonico(2);
//        if (x > 1.49 && x < 1.51){
//            assertEquals(x, Algoritmos.numeroHarmonico(2));
//        }
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void numeroHarmonicoErroMenorQue2(){
//        Algoritmos.numeroHarmonico(1);
//    }
}
