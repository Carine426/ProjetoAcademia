package br.com.empresa.Academico.model;

import java.time.LocalDate;
import java.time.Period;

public class Projetoacademico {
	
	private String name;
	private LocalDate datanascimento;
	private String sexo;
	private double peso; 
	private  double altura;
	private String niveldeAtividade;
	
	public void setName(String name ) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setDatadenascimento(LocalDate datanascimento) {
		this.datanascimento = datanascimento;
		
    }

	public LocalDate getDatadenascimento() {
		return this.datanascimento;
	
	}
		
	public void  setsexo (String sexo) {
		 this.sexo = sexo;
		 
	}
	
	public String getsexo() {
		return this.sexo;
		
	}
	 
	public void setpeso(double peso) {
		this.peso = peso;
		
	}
	
	public double getpeso() {
		return this.peso; 
		
	}
	
	public void setaltura(double altura) {
		this.altura = altura;
	}
	
	public double getaltura() {
		return this.altura;
	
	}
	
	public void setniveldeatividade (String niveldeatividade) {
		this.niveldeAtividade = niveldeatividade;
	}
	
	public String getniveldeatividade() {
		return this.niveldeAtividade;
	
	}
	
//	*** Obter a data de nascimento
	public int getIdade() {
		LocalDate hoje = LocalDate.now();
		Period periodo = Period.between(this.datanascimento, hoje);
		return periodo.getYears();
		
	}
	
	public double getImc() {
		return this.peso/(this.altura* this.altura);
		
	}
	
	public String getStatusImc() {
		if (this.getImc() < 18.5) {
		return "Abaixo do peso";
		} else if (this.getImc() > 18.5 && this.getImc() < 25) {
			return "Peso Ideal";
		} else if (this.getImc() > 25 && this.getImc() < 30) {
		 return "Levemente acima do peso";
		} else if (this.getImc() > 30 && this.getImc() < 35) {
			return "Obesidade grau I";
		} else if (this.getImc() > 35 && this.getImc() < 40) {
			 return "Obesidade grau II";
		} else {
			return "Obesidade grau III";

	 }
}
	
// *** NCD DO HOMEM
	public double getNcd() {
		double ncd = 0;
		
	if (this.sexo == "M") {
		
// *** Com base na idade 
		if (this.getIdade() >18 && this.getIdade() <30) {
			ncd = 15.3 * this.peso  + 670;
		} else if (this.getIdade() >31 && this.getIdade() <= 60) {
			ncd = 11.6 * this.peso + 879;
		} else {
			ncd = 13.5 * this.peso + 497;
		}
	}
	
	
//*** Com base na atividade fisica 
	if (this.niveldeAtividade == NivelAtividade.LEVE1) {
		ncd *= 1.5;
	} else if (this.niveldeAtividade == NivelAtividade.MODERADO1) {
		ncd *= 1.8;
	}  else if (this.niveldeAtividade == NivelAtividade.INTENSO1) {
		ncd *= 2.1;
	}
	return ncd;
	
}

//*** NCD DA MULHER
	public double getNcd1() {
		double ncd = 0;
		
	if (this.sexo == "F") {
		
// *** Com base na idade 
	if (this.getIdade() >18 && this.getIdade() <30) {
		ncd = 14.7 * this.peso  + 496;
	} else if (this.getIdade() >31 && this.getIdade() <= 60) {
		ncd = 8.7 * this.peso + 829;
	} else {
	    ncd = 10.5 * this.peso + 596;
	}
}
	//*** Com base na atividade fisica 
		if (this.niveldeAtividade == NivelAtividade.LEVE) {
			ncd *= 1.6;
		} else if (this.niveldeAtividade == NivelAtividade.MODERADO) {
			ncd *= 1.6;
		}  else if (this.niveldeAtividade == NivelAtividade.INTENSO) {
			ncd *= 1.8;
		}
		return ncd;
	}
}
	
	
	