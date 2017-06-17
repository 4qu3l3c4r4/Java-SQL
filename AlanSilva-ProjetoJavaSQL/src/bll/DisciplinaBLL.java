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

package bll;

import dao.DisciplinaDAO;
import entity.Disciplina;
import java.util.List;

/**
 *
 * @author alansilva
 */

public class  DisciplinaBLL implements IBLL <Disciplina> {

        @Override
// OBJETIVO.......: Este loop é utilizado para implementar a função de salvar
	public int salvar(Disciplina objeto) {
		DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
		return  disciplinaDAO.salvar(objeto);
	}

// OBJETIVO.......: Este loop é utilizado para implementar a função de excluir
	public boolean excluir(Disciplina  objeto) {
		DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
		return  disciplinaDAO.excluir(objeto);	
        }

// OBJETIVO.......: Este loop é utilizado para implementar o função de listor
	public List<Disciplina > listar() {
		DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
		return  disciplinaDAO.listar();	
        }

// OBJETIVO.......: Este loop é utilizado para implementar a função de busca por nome
	public Disciplina  buscarPorNome(String nome) {
		DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
		return  disciplinaDAO.buscarPorNome(nome);
	}

}