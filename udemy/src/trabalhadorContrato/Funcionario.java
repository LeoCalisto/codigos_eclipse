package trabalhadorContrato;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Funcionario {
	private List <Contrato> contratos = new ArrayList<>();
	private Departamento departamento;
	private String nome;
	private Level level;
	private Double salario;
	
	public Funcionario(Departamento departamento, String nome, Level level, Double salario) {
		this.departamento = departamento;
		this.nome = nome;
		this.level = level;
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Level getLevel() {
		return level;
	}
	public void setLevel(Level level) {
		this.level = level;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	void addContrato(Contrato contrato) {
		contratos.add(contrato);
	}
	
	void removerContrato(Contrato contrato) {
		contratos.remove(contrato);
	}
	
	Double ganhoPorPeriodo(int ano, int mes) {
		Double salarioFinal = salario;
		for(Contrato c : contratos) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(c.getData());
			int c_mes = calendar.get(Calendar.MONTH) + 1;
			int c_year = calendar.get(Calendar.YEAR);
			if (c_mes == mes && c_year == ano) {
				salarioFinal += c.valorTotal();
			}
		}
		return salarioFinal;
	}
}
