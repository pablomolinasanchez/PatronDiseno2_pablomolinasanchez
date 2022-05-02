/**
 * @author Pablo Molina Sanchez
 */
public class Semaforo {
	protected Estado estado;
	protected boolean esTriestable;

	public Semaforo() {
		estado = new Rojo(this);
		esTriestable = false;
	}
	
	public Semaforo(boolean triestable) {
		estado = new Rojo(this);
		esTriestable = triestable;
	}
	
	public Semaforo(Estado estado, boolean triestable) {
		this.estado = estado;
		esTriestable = triestable;
	}

	public void abrir_semaforo() {
		estado = estado.abrir();
	}
	
	public void cerrar_semaforo() {
		estado = estado.cerrar();
	}
	public void cambio_semaforo() {
		esTriestable= estado.cambio();
	}
	
	public String estado_semaforo() {
		return estado.estado();
	}
	public boolean isTriestable() {
		return esTriestable;
	}
	

}
