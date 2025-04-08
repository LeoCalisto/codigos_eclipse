import java.util.Date;

public class Contrato {
	private Date data;
	private Double valorPorHora;
	private int horaTrabalhada;
	

	public Contrato(Date data, Double valorPorHora, int horaTrabalhada) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.horaTrabalhada = horaTrabalhada;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public Double getValorPorHora() {
		return valorPorHora;
	}


	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}


	public int getHora() {
		return horaTrabalhada;
	}

	
	public void setHora(int hora) {
		this.horaTrabalhada = hora;
	}


	public Double valorTotal() {
		return horaTrabalhada*valorPorHora;
	}
	
}
