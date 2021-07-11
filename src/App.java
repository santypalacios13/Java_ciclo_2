//import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
     Perro perro1 = new Perro("pepe",4,"Alza la pata");
     Perro perro2 = new Perro("Sasha",3,"Sentada");
     System.out.println(perro1.getEdad());
     perro1.setNombre("pepe");
     System.out.println(perro1.getNombre());
     System.out.println(perro2 .getNombre());
     //JOptionPane.showMessageDialog(null, "Hola ", "Saludo", 3);
     System.out.println(perro1.getAullar());
    }


}

