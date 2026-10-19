package Sistemas;

public class Sistemas {
    private int Identificador;
    private int Usuario;
    private int Intentos;

    private static  int Cont = 0;

    public Sistemas(int Identificador, int Usuario) {

        if (Identificador <= 0 || Usuario <= 0){
            System.out.println("TIENEN QUE SER VALORES POSITIVOS");
        }
        this.Identificador = Identificador;
        this.Usuario = Usuario;
        this.Intentos = 0;
        Cont++;

    }

    public int getIdentificador() {
        return Identificador;
    }

    public int getUsuario() {
        return Usuario;
    }

    public int getIntentos() {
        return Intentos;
    }

    public static int getCont() {
        return Cont;
    }

    public boolean Intento() {
        if (Intentos < Usuario) {
            Intentos++;
            return true;
        }
    }

    public boolean Incorrecto(){
        if (Intentos < 3){
            Intentos++;
            return false;
        }
    }
}






































































