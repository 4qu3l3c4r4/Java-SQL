/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//******************************************************
//Instituto Federal de São Paulo - Campus Sertãozinho
//Disciplina......: M3LPBD
//Programação de Computadores e Dispositivos Móveis
//Aluno...........: Alan Diego Silva
//******************************************************

package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alansilva
 */

// OBJETIVO.......: Este loop é utilizado para criar a classe "conexão"
public class Conexao {

	public Connection geraConexao(){

		Connection conexao = null;
		
		try {
			

// OBJETIVO.......: Este loop é utilizado para definir os parametros de conexão (senha, url, etc)			
			String url = "jdbc:mysql://localhost/curso";
			String usuario = "root";
			String senha = "";
			conexao = DriverManager.getConnection(url, usuario, senha);

		
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conexao;
	}

}
