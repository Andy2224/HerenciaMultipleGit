package motorcombustioninterna;
interface Caballos_Fuerza{
    default String Potencia(String accionar){
        return "Genera un encendido que "+accionar+" torque ";
    }
}
interface Caballos_Vapor{
    default String Potencia(String accionar){
        return "Al accionar el arranque"+accionar+" fuerza";
    }
}

public class MotorCombustionInterna implements Caballos_Fuerza,Caballos_Vapor{
    @Override
    public String Potencia (String accionar){

        return Caballos_Fuerza.super.Potencia(accionar);
    }

    /*@Override
    public String Potencia(String accionar){

    return Caballos_Vapor.super.Potencia(accionar);
    }*/

    public static void main(String[] args) {
        System.out.println("\tUniversidad de las Fuerzas Armadas ESPE ");
        System.out.println("\t\t\tSede Latacunga");
        System.out.println("Nombre: Andrés Mogollón S.");
        System.out.println("Carrera: Ingenieria Automotriz");
        System.out.println("Materia: Programacion [7450]");
        System.out.println("\t\t\tHerencia Múltiple\n");

        MotorCombustionInterna motorcombustioninterna=new MotorCombustionInterna();
        System.out.println(motorcombustioninterna.Potencia("\n produce "));
    }
}
