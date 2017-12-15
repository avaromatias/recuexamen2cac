package paquete;

public class Persona {

	double peso, altura;
	
	public Persona(double unPeso, double unaAltura) {
		this.peso = unPeso;
		this.altura = unaAltura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double indiceMasaCorporal() {
		return this.getPeso() / Math.pow(this.getAltura(), 2);
	}
	
	public String estadoFisico() {
		if(this.indiceMasaCorporal() < 18) {
			return "Bajo peso";
		}else if(this.indiceMasaCorporal() < 24.9) {
			return "Normal";
		}else if(this.indiceMasaCorporal() < 26.9) {
			return "Sobrepeso";
		}else if(this.indiceMasaCorporal() < 29.9) {
			return "Obesidad grado 1";
		}else if(this.indiceMasaCorporal() < 39.9) {
			return "Obesidad grado 2";
		}else {
			return "Obesidad grado 3";
		}
	}
}