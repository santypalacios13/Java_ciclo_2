public class Lobo extends Canino{

   private final boolean andanenmanada = true;
   private String pelaje;
   private String horarioCaza;

public Lobo(){
    super("Auuuu","Carnivoro");
}

   public String getPelaje() {
       return pelaje;
   }
   public void setPelaje(String pelaje) {
       this.pelaje = pelaje;
   }
   public String getHorarioCaza() {
       return horarioCaza;
   }
   public void setHorarioCaza(String horarioCaza) {
       this.horarioCaza = horarioCaza;
   }
   public boolean isAndanenmanada() {
       return andanenmanada;
   }
   
}
