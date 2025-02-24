package atividade2;

public abstract class Animal {
	String especie;
	String classe;
	@SuppressWarnings("unused")
	private int nrPatas;
	
	public void andar(){}
	public void falar() {}
	public abstract void setNrPatas(int patas);
	public abstract void getNrPatas();
	
	protected void imprimir() {}
	
	public static void main(String[] args) {
		
	}
}
