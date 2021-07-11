public class Perro extends Canino{
     //Atributos 
     //public,private,protected
     private final boolean PERSEGUIR_COLA=true;
     private String orinar;
     private String Nombre;
     private int edad;
     public static int contadorPerros=0;
     public static String formadedientes = "Colmillos";
     //Constructores
     // def___init__():
     public Perro(String nombre, int edad ,String orinar){
        super("Awwww","Omnivoros");
        this.Nombre = nombre ;
        this.edad = edad;
        this.orinar = orinar;
        contadorPerros++;
        
    
     }
     // Metodos
     public String getNombre() {
         return Nombre;
     }
     public void setNombre(String nombre) {
         this.Nombre = nombre;
     }
     public String getOrinar() {
        return orinar;
     }
     public void setOrinar(String orinar) {
         this.orinar = orinar;
     }
     public boolean isPerseguircola() {
         return PERSEGUIR_COLA;
     }
     
     public int getEdad() {
         return edad;
     }
     public void setEdad(int edad) {
         this.edad = edad;
     }


}
