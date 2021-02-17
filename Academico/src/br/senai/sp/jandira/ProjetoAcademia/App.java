package br.senai.sp.jandira.ProjetoAcademia;

import java.time.LocalDate;
import br.com.Academico.gui.FrameTela;
 
import br.com.empresa.Academico.model.Cliente;
import br.com.empresa.Academico.model.NivelAtividade;
import br.senai.sp.jandira.ProjetoAcademia.App;

 public class App {
	
	public static void main(String [] args) {
		
//		 Cliente carine = new Cliente();
//		 
//		carine.setAltura(1.56);
//		carine.setPeso(60);
//		carine.setDatadenascimento(LocalDate.of(2002, 3, 31));
//		carine.getNcd();
//		carine.setSexo("Feminino");
//		carine.setNiveldeatividade(NivelAtividade.LEVE);
//		System.out.println(carine.getIdade());		
//		System.out.println(carine.getSexo());	
//		System.out.println(carine.getIdade());	
//		System.out.println(carine.getNcd());	
//		System.out.println(carine.getImc());	
//		System.out.println(carine.getStatusImc());	
		
		FrameTela  tela = new FrameTela();
		tela.criarTela();
		

	}
}