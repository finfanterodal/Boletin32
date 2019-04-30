package boletin32;

/**
 *
 * @author finfanterodal
 */
public class Alumno {
    //Atributos
    private String nome;
    private int nota;
    private Enderezo enderezo;
    
    //Constructor

    public Alumno() {
    }

    public Alumno(String nome, int nota, Enderezo enderezo) {
        this.nome = nome;
        this.nota = nota;
        this.enderezo = enderezo;
    }
    
    
    //Métodos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Enderezo getEnderezo() {
        return enderezo;
    }

    public void setEnderezo(Enderezo enderezo) {
        this.enderezo = enderezo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nome=" + nome + ", nota=" + nota + ", enderezo=" + enderezo + '}';
    }
    
    public void amosar() {
        System.out.println(toString()+enderezo.toString());
    }

    /* Clase interna
    * Una clase interna tiene acceso a todas las variables y métodos de su clase externa y puede referirse a 
    * ellos directamente de la misma manera que lo hacen otros miembros no estáticos de la clase externa.
    */
    
    class Enderezo {
        

        private String rua;
        private int numero;

        public Enderezo(String rua, int numero) {
            this.rua = rua;
            this.numero = numero;
        }

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        @Override
        public String toString() {
            return "Enderezo{" + "rua=" + rua + ", numero=" + numero + '}';

        }
    }
}
