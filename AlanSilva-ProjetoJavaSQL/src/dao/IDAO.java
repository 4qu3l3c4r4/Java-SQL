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

package dao;

import java.util.List;

/**
 *
 * @author alansilva
 */

public interface IDAO<Entity> {

// OBJETIVO.......: Este loop é utilizado para criação da interface "salvar"
		public abstract int salvar(Entity objeto);

// OBJETIVO.......: Este loop é utilizado para criação da interface "excluir"		
		public abstract boolean excluir(Entity objeto);

// OBJETIVO.......: Este loop é utilizado para criação da interface "listar"		
		public abstract List<Entity> listar();

// OBJETIVO.......: Este loop é utilizado para criação da interface "buscar por nome"		
		public abstract Entity buscarPorNome(String nome);
}
