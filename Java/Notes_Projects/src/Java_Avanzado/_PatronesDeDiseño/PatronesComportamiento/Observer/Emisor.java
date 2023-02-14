package Java_Avanzado._PatronesDeDiseño.PatronesComportamiento.Observer;

import java.util.ArrayList;

public class Emisor {
      private ArrayList<Receptor> receptor = new ArrayList(); //The objects that are listening

      public void addReceptor(Receptor receptor){
            this.receptor.add(receptor);
      }

      public void transmit(){
            for( Receptor receptor : receptor ){
                  receptor.recibe();
            }
      }

}
