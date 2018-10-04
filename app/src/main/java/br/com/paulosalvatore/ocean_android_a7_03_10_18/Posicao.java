package br.com.paulosalvatore.ocean_android_a7_03_10_18;

public class Posicao {
	private int id;
	private double latitude;
	private double longitude;
	private String data_hora;

	public Posicao(double latitude, double longitude, String data_hora) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.data_hora = data_hora;
	}

	public Posicao(int id, double latitude, double longitude, String data_hora) {
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.data_hora = data_hora;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getDataHora() {
		return data_hora;
	}

	public void setDataHora(String data_hora) {
		this.data_hora = data_hora;
	}
}
