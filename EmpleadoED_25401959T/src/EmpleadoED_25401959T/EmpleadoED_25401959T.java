package EmpleadoED_25401959T;

import java.util.*;

/**
 * Ejercicio práctico examen Eval 1 ED
 *
 * @author Silverio Marín Marín
 * @version 1.0
 */
public class EmpleadoED_25401959T {

   static final double FACTOR_HORA_EXTRA = 1.2;
   private String nombreCompleto, dni;
   private double salarioBasePorHora = 10.56;

   /**
    * Constructor con 3 parámetros
    *
    * @param nombreCompleto nombre completo en maysculas
    * @param dni documento nacional de identidad con letra y sin espacios
    */
   public EmpleadoED_25401959T(String nombreCompleto, String dni) {
      this.nombreCompleto = nombreCompleto;
      this.dni = dni;
   }

   /**
    * Calcula el salario bruto mensual en función del salario base por hora y
    * las horas extras.
    *
    * @param horasExtra. Número de horas extra dedicadas redondeado a la baja
    * (entero).
    * @return Devuelve el salario bruto mensual en euros con dos decimales.
    */
   public double getSalarioEsteMes(int horasExtra) {
      double cantidadExtra, salarioFinal;
      cantidadExtra = horasExtra * this.salarioBasePorHora * FACTOR_HORA_EXTRA;
      salarioFinal = this.salarioBasePorHora * 40 * 4 + cantidadExtra;
      salarioFinal = (double) Math.round(salarioFinal * 100d) / 100d;
      return salarioFinal;
   }

   // Este método no lo comentaremos con JavaDoc
   public static void main(String[] args) {
      // !!!! MODIFICA TU NOMBRE Y TU DNI EN LA SIGUIENTE LÍNEA        
      EmpleadoED_25401959T emp = new EmpleadoED_25401959T("SILVERIO MARIN MARIN", "25401959T");
      int horasExtra = 2;
      System.out.println("El salario de " + emp.nombreCompleto + " este mes será de " + emp.getSalarioEsteMes(horasExtra)
              + " euros, al hacer " + horasExtra + " horas extra.");
   }
}
