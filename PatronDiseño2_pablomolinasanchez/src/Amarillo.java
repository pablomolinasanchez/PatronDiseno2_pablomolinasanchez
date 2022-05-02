/**
 * @author Pablo Molina Sanchez
 */
public class Amarillo extends Estado {
	public Amarillo(Semaforo semaforo) {
		super(semaforo);
	}
	
	public Amarillo() {
		super();
	}

	@Override
	public Estado abrir() {
		return new Verde(semaforo);
	}

	@Override
	public Estado cerrar() {
		return new Rojo(semaforo);

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
		return "Precaución";
	}
}
