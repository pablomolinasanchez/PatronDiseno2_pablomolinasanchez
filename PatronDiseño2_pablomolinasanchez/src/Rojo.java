/**
 * @author Pablo Molina Sanchez
 */
public class Rojo extends Estado {
	public Rojo(Semaforo semaforo) {
		super(semaforo);
	}
	public Rojo() {
		super();
	}

	@Override
	public Estado abrir() {
		if(!semaforo.isTriestable()) {
			return new Verde(semaforo);
		}else {
			return new Amarillo(semaforo);
		}
	}

	@Override
	public Estado cerrar() {
		return this;

	}
	@Override
	public boolean cambio() {
		if(!semaforo.isTriestable()) {
			semaforo.esTriestable=true;
		}else {
			semaforo.esTriestable=false;
		}
		return semaforo.esTriestable;
	}

	@Override
	public String estado() {
		return "Cerrado";
	}
}
