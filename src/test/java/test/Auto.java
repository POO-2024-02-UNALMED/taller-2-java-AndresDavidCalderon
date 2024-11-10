package test;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static String cantidadCreados;

    int cantidadAsientos(){
        int cantidad = 0;
        for (i=0; i<asientos.length; i++){
            if (asientos[i]!=null){
                cantidad++;
            }
        }
        return cantidad;
    }

    String verificarIntegridad(){
        if (!registro.equals(motor.registro)){
            return "Las piezas no son originales";
        }
        
        for (i=0; i<asientos.length; i++){
            if (!asientos[i].registro.equals(registro)){
                return "Las piezas no son originales";
            }
        }
        return "Auto original";
    }
}
