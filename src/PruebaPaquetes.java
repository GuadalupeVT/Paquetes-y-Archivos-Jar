/*
 *  Paquetes - Organizar archivos
 *             agrupacion tipos relacionados
 *             componentes
 *             
 *    Mejor manejo - mantenimiento
 *    Separacion de codigo MODULOS
 *    
 *    Seguridad (modificadores de acceso)
 *    Mismos nombres clases pero en diferentes paquetes
 *    
 * Nombrar paquetes
 *         Convencionales
 *             utiliza el dominio web de la empresa/institucion en forma inversa
 *             
 *         Dominio del ITSJ ->www.tecjerez.edu.mx
 *         
 *         Por lo tanto el paquete quedaria:
 *                edu.tecjerez.topicos.vista
 *         
 *         Sintaxis
 *             package directorio.subdirectorio...class
 *             
 *             
 *           Ruta de paquete LANG de Java en Windows
 *           
 *                 c:/program files/java/jdkl.../lib
 *                 
 *           Archivos JAr
 *                 comprimido con clases para que la JVM lo "ejecute"
 *                 
 *                 
 *           Modificadores de acceso
 *                      permisos de acceso
 *                          public
 *                          protected
 *                          private
 *                          default
 */


import edu.tecjerez.topicos.vista.VentanaInicio;

public class PruebaPaquetes {

	public static void main(String[] args) {
		new VentanaInicio().setVisible(true);

	}

}
