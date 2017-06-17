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

package entity;

/**
 *
 * @author alansilva
 */

// OBJETIVO.......: Este loop é utilizado para criação dos parametros de preenchimento da comboBox "Disciplina"
public class Disciplina {
        private int iddisciplina;
	private String nome;
        private Double carga_horaria;
        private String curso;
        private int num_vagas;
	private int periodo;

// OBJETIVO.......: Este loop é utilizado para pegar o preenchimento do parametro "Disciplina"
    public int getIddisciplina() {
        return iddisciplina;
    }

// OBJETIVO.......: Este loop é utilizado para pegar o preenchimento do parametro "Nome"
    public String getNome() {
        return nome;
    }

// OBJETIVO.......: Este loop é utilizado para pegar o preenchimento do parametro Carga Horaria"
    public Double getCarga_horaria() {
        return carga_horaria;
    }

// OBJETIVO.......: Este loop é utilizado para pegar o preenchimento do parametro "Curso"
    public String getCurso() {
        return curso;
    }

// OBJETIVO.......: Este loop é utilizado para pegar o preenchimento do parametro "Numero de Vagas"
    public int getNum_vagas() {
        return num_vagas;
    }

// OBJETIVO.......: Este loop é utilizado para pegar o preenchimento do parametro "Periodo"
    public int getPeriodo() {
        return periodo;
    }

// OBJETIVO.......: Este loop é utilizado para setar o preenchimento do parametro "Disciplina"
    public void setIddisciplina(int iddisciplina) {
        this.iddisciplina = iddisciplina;
    }

// OBJETIVO.......: Este loop é utilizado para setar o preenchimento do parametro "Nome"
    public void setNome(String nome) {
        this.nome = nome;
    }

// OBJETIVO.......: Este loop é utilizado para setar o preenchimento do parametro Carga Horaria"
    public void setCarga_horaria(Double carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

// OBJETIVO.......: Este loop é utilizado para setar o preenchimento do parametro "Curso"
    public void setCurso(String curso) {
        this.curso = curso;
    }

// OBJETIVO.......: Este loop é utilizado para setar o preenchimento do parametro "Numero de Vagas"
    public void setNum_vagas(int num_vagas) {
        this.num_vagas = num_vagas;
    }

// OBJETIVO.......: Este loop é utilizado para setar o preenchimento do parametro "Periodo"
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    
    
}
