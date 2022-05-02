/**
 * @author Pablo Molina Sanchez
 */
public abstract class Estado {
	protected Semaforo semaforo;
	
	public Estado(Semaforo semaforo) {
		this.semaforo=semaforo;
	}
	
	public Estado() {
		this.semaforo=new Semaforo();
	}
	
	public abstract Estado abrir();
	public abstract Estado cerrar();
	public abstract String estado();
	protected abstract boolean cambio();
	
	
}
