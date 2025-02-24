package atividade2;

public class Funcionário {
	private int matricula;
	private String nome;
	private double salario;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void limpar() {
		this.matricula = 0;
		this.nome = "";
		this.salario = 0.0;
	}
	
	public Funcionário(int matricula, String nome, double salario) {
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
	}
	
	public Funcionário() {
		// TODO Auto-generated constructor stub
	}
	
	
}
