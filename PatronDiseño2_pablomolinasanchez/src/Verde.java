/**
 * @author Pablo Molina Sanchez
 */
public class Verde extends Estado {
	public Verde(Semaforo semaforo) {
		super(semaforo);
	}
	
	public Verde() {
		super();
	}

	@Override
	public Estado abrir() {
		return this;
	}

	@Override
	public Estado cerrar() {
		if(!semaforo.isTriestable()) {
			return new Rojo(semaforo);
		}else {
			return new Amarillo(semaforo);
		}
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
		return "Abierto";
	}
}
