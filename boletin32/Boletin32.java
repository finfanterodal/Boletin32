package boletin32;

/**
 *
 * @author finfanterodal
 */
public class Boletin32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Alumno.Enderezo in = new Alumno().new Enderezo(" bbb",8);  
      Alumno a = new Alumno("nnn",5,in);
      a.amosar();
      a.setNota(20);
      a.amosar();

    }
    
}
