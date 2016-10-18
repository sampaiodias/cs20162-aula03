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
 * Testes dos algoritmos matemáticos das listas 02 e 03 de Construção de
 * Software
 *
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
    public void Teste03Pi() {
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
        assertEquals(65, Algoritmos.logaritmoNatural(5, 4), 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void Teste08LogaritmoNaturalErroNMenorQue1() {
        assertEquals(65, Algoritmos.logaritmoNatural(0, 4), 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void Teste09LogaritmoNaturalErroKMenorQue2() {
        assertEquals(65, Algoritmos.logaritmoNatural(2, 1), 1);
    }

    @Test
    public void Teste10RazaoAurea1E2() {
        assertEquals(1, Algoritmos.razaoAurea(1, 2, 3), 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void Teste11RazaoAureaErroXMaiorQueY() {
        assertEquals(1, Algoritmos.razaoAurea(3, 2, 3), 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void Teste12RazaoAureaErroKMenorQue1() {
        assertEquals(1, Algoritmos.razaoAurea(3, 2, 0), 1);
    }
    
    @Test
    public void Teste13QuadradoPerfeito9() {
        assertEquals(true, Algoritmos.quadradoPerfeito(9));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void Teste14QuadradoPerfeitoErroKMenorQue1() {
        assertEquals(true, Algoritmos.quadradoPerfeito(0));
    }
    
    @Test
    public void Teste15QuadradoPerfeito8() {
        assertEquals(false, Algoritmos.quadradoPerfeito(8));
    }
    
    @Test
    public void Teste16Mod3() {
        assertEquals(1, Algoritmos.mod(3, 2));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void Teste17ModXMenorQue0() {
        assertEquals(1, Algoritmos.mod(-1, 2));
    }
    
    @Test
    public void Teste18Raiz9() {
        assertEquals(3, Algoritmos.raiz(9, 10), 0.1f);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void Teste19RaizNMenorQue1() {
        assertEquals(3, Algoritmos.raiz(0, 10), 0.1f);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void Teste20FibonacciNMenorQue0() {
        assertEquals(3, Algoritmos.fibonacci(-1));
    }
    
    @Test
    public void Teste21Fibonacci7() {
        assertEquals(13, Algoritmos.fibonacci(7));
    }
    
    @Test
    public void Teste22Fibonacci0() {
        assertEquals(0, Algoritmos.fibonacci(0));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void Teste23HornerErroGMenorQue1() {
        assertEquals(1, Algoritmos.horner(0, 0, new float[1]));
    }
}
