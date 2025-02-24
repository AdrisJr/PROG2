package atividade2;

import java.time.LocalTime;

public class Relogio {

	protected int hora;
	protected int minuto;
	protected int segundo;

	public void incrementar() {
		LocalTime time = LocalTime.of(hora, minuto, segundo + 1);
		this.hora = time.getHour();
		this.minuto = time.getMinute();
		this.segundo = time.getSecond();
	}

	public void decrementar() {
		LocalTime time = LocalTime.of(hora, minuto, segundo - 1);
		this.hora = time.getHour();
		this.minuto = time.getMinute();
		this.segundo = time.getSecond();
	}

	public void ajustar(int hora, int minuto, int segundo) {
		LocalTime time = LocalTime.of(hora, minuto, segundo);
		this.hora = time.getHour();
		this.minuto = time.getMinute();
		this.segundo = time.getSecond();
	}
	public void horarioAtual() {
		System.out.printf("%d:%d:%d", this.hora, this.minuto, this.segundo);
	}

}
