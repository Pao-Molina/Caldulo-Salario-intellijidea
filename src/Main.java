import java.util.Scanner; /* Importo la biblioteca para poder capturar "Ingresar" valores*/

public class Main {
    public static void main(String[] args) {
      Scanner captura = new Scanner(System.in); /*Se utiliza para capturar "Ingresas" valores*/
        String nombreEmpleado = "";
        String documentoEmpleado = "";
        double salarioBruto = 0;
        double salarioNeto = 0;
        double valorHora = 0;
        double cantidadHoras = 0;
        double deduccionSalud = 0;
        double deduccionPension = 0;
        double horasExtras = 0;
        double valorHoraExtra = 0;
        double bonificacion = 0;
        double fondoSolidaridadPensional = 0;
        double valorRetencionFuente = 0;
        double auxilioTransporte = 0;
        double salarioMinimo = 0;

        System.out.println("Ingrese el nombre del empleado");
        nombreEmpleado = captura.nextLine();
        System.out.println("Ingrese el documento del empleado");
        documentoEmpleado = captura.nextLine();
        System.out.println("Ingrese el valor de la hora");
        valorHora = captura.nextDouble();
        System.out.println("Ingrese la cantidad e las horas laboradas");
        cantidadHoras = captura.nextDouble();
        System.out.println("Ingrese el valor del Salario Minimo mensual del año vigente");
        salarioMinimo = captura.nextDouble();

        if(cantidadHoras >= 24){
          System.out.println("El empleado puede acceder a un pago, por lo tanto,");
          salarioBruto = valorHora * cantidadHoras;
          deduccionPension = salarioBruto * 0.04;
          deduccionSalud = salarioBruto * 0.04;
          if (salarioBruto <= (salarioMinimo * 2)){
            auxilioTransporte = 200000;
            bonificacion = salarioBruto * 0.1;
          } else {
            auxilioTransporte = 0;
            bonificacion = 0;
          }
          if (cantidadHoras > 96){
            horasExtras = cantidadHoras - 96;
            valorHoraExtra = (valorHora * 0.25) * horasExtras;
          }
          System.out.println("Detalle de pago de: " + nombreEmpleado);
          System.out.println("El salario bruto devengado por  " + nombreEmpleado + " Es de: " + salarioBruto + " Pesos");
          System.out.println("La deduccion por Salud es de: " + deduccionSalud + " pesos");
          System.out.println("La deduccion por Pension es de: " + deduccionPension + " pesos");
          System.out.println(" El Auxilio de transporte es de: " + auxilioTransporte + " pesos");
          System.out.println("Tiene una bonificación de: " + bonificacion + " pesos");
          System.out.println("El pago por horas extras es de: " + valorHoraExtra + " pesos");
          System.out.println("El salario neto devengando es: " + (salarioBruto - deduccionPension - deduccionSalud + auxilioTransporte + bonificacion + valorHoraExtra));

        } else {
          System.out.println("Le faltan " + (24 - cantidadHoras) + "  horas de trabajo");
        }



    }
}