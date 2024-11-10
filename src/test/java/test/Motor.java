package test;
public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;

    void cambiarRegistro(int nuevoRegistro){
        registro = nuevoRegistro;
    }

    void asignarTipo(String nuevoTipo){
        if(nuevoTipo.equals("electrico") || nuevoTipo.equals("gasolina")){
            tipo = nuevoTipo;
        }
    }
}