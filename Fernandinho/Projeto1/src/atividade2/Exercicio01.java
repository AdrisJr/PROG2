package atividade2;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionário func1 = new Funcionário(1, "João", 2000.0);
		Funcionário func2 = new Funcionário();
		func2.setMatricula(2);
		func2.setNome("Maria");
		func2.setSalario(2100.0);
		
		Exercicio01 exer = new Exercicio01();
		exer.mostrarFuncionario(func2);
		exer.mostrarFuncionario(func1);
	}
	
	private void mostrarFuncionario(Funcionário func) {
		System.out.printf("%s(%d) - %.2f%n",func.getNome(), func.getMatricula(), func.getSalario());
	}

}
