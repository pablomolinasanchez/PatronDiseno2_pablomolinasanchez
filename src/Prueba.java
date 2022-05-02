/**
 * @author Pablo Molina Sanchez
 */
public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Semaforo s = new Semaforo();
		System.out.println(s.estado_semaforo());
		s.abrir_semaforo();
		System.out.println(s.estado_semaforo());
		System.out.println(s.isTriestable());
		s.cambio_semaforo();
		System.out.println(s.isTriestable());
		s.cerrar_semaforo();
		System.out.println(s.estado_semaforo());
		
		Semaforo s1 = new Semaforo(true);
		System.out.println(s1.estado_semaforo());
		System.out.println(s1.isTriestable());
		Semaforo s2 = new Semaforo(new Verde(),true);
		System.out.println(s2.estado_semaforo());
		

	}

}
