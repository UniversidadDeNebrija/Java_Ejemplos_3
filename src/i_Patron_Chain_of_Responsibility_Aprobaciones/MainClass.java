package i_Patron_Chain_of_Responsibility_Aprobaciones;
/*
 * Ejemplo sencillo del patrón Chain of Responsibility en Java. 
 * En este escenario, vamos a simular un sistema de aprobación de gastos en una 
 * empresa, donde diferentes niveles de gerentes pueden aprobar ciertos montos de gastos.
 * 
 * Explicación de la Implementación:
 * 
 * El patrón Chain of Responsibility permite que una solicitud pase a través de una cadena 
 * de manejadores. Cada manejador decide si procesa la solicitud o la pasa al siguiente 
 * manejador en la cadena.
 * 
 * - Interfaz Handler: Define los métodos que deben implementar los manejadores, incluyendo 
 *   handleRequest para procesar la solicitud y setNextHandler para establecer el siguiente 
 *   manejador en la cadena.
 * - Clase Abstracta AbstractHandler: Proporciona una implementación base del Handler, incluyendo 
 *   la lógica para mantener y delegar al siguiente manejador.
 * - Manejadores Concretos (Supervisor, Manager, Director): Representan distintos niveles de 
 *   autoridad en la organización. Cada uno puede aprobar gastos hasta cierto límite. Si un gasto 
 *   excede su límite, lo pasan al siguiente manejador en la cadena.
 * - Cliente (MainClass): Este es el punto de entrada para demostrar el patrón en acción. Configura 
 *   la cadena de responsabilidad y realiza varias solicitudes de aprobación de gastos.
 * 
 * Este patrón es útil para desacoplar el remitente y el receptor de una solicitud, proporcionando 
 * una manera flexible de manejar diferentes solicitudes y permitiendo la extensibilidad de la cadena.
 */

/**
 * Clase que demuestra el uso del patrón Chain of Responsibility.
 */
public class MainClass {
    public static void main(String[] args) {
        // Crear la cadena de manejadores
        Handler supervisor = new Supervisor();
        Handler manager = new Manager();
        Handler director = new Director();

        // Establecer la cadena de responsabilidad
        supervisor.setNextHandler(manager);
        manager.setNextHandler(director);

        // Hacer solicitudes
        supervisor.handleRequest(50);   // Manejado por el Supervisor
        supervisor.handleRequest(200);  // Manejado por el Gerente
        supervisor.handleRequest(800);  // Manejado por el Director
        supervisor.handleRequest(1500); // Necesita aprobación adicional
    }
}
