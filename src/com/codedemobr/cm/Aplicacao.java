package com.codedemobr.cm;

import com.codedemobr.cm.modelo.Tabuleiro;
import com.codedemobr.cm.visao.TabuleiroConsole;

public class Aplicacao {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);

        new TabuleiroConsole(tabuleiro);
    }
}
