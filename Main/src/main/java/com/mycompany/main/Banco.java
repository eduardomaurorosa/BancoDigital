/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import com.mycompany.main.Conta;

import java.util.List;

/**
 *
 * @author User
 */
public class Banco {
        private String nome;
	private List<Conta> contas;
    private List<Cliente> cliente;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

        public void setClientes(List<Cliente> clientes) {
        this.cliente = clientes;
    }
}

