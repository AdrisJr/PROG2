package atividade2;

public class Lampada {
	@SuppressWarnings("unused")
	private boolean estado;
	@SuppressWarnings("unused")
	private int potencia;
	
	public void acender() {
		this.estado = true;
	}
	public void apagar() {
		this.estado = false;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
}
