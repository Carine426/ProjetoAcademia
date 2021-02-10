package br.senai.sp.jandira.Academico;

import java.time.LocalDate;

import br.com.empresa.Academico.model.NivelAtividade;

public class App {

	public static void main(String[] args) {
		
		Cliente dadosCarine = new Cliente();
		
		dadosCarine.setName("Carine");
		dadosCarine.setsexo("Feminino");
		dadosCarine.setpeso("60");
		dadosCarine.setAltura("1.55");
		dadosCarine.setDatadenascimento(LocalDate.of(2003, 03, 31));
		dadosCarine.setNiveldeatividade(NivelAtividade.LEVE);
		System.out.print("***" + dadosCarine.getName());
		System.out.print("IMC" + dadosCarine.getImc());
		System.out.print("Idade" + dadosCarine.getIdade());
		System.out.print("Situação:" + dadosCarine.getIdade());
		System.out.print("***" + dadosCarine.getName());
		
		
		
		
		
		
		
		
		
		
	}

}
