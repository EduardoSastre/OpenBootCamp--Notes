package Java_Avanzado._PatronesDeDiseño.PatronesComportamiento.Mediator;

import java.util.ArrayList;

public class MediatorConcreto extends Mediator{
      ArrayList<Colega> colegas = new ArrayList<Colega>();

      @Override
      void registra(Colega colega) {
            if ( !colegas.contains(colega) ){
                  colegas.add(colega);
                  colega.setMediator( this );
            }
      }

      @Override
      void reenvia(Colega colega) {
            for ( Colega actual : colegas ){
                  if (!actual.equals(colega)) { //Notify others but not to itself
                        actual.recibe();
                  }
            }
      }
}
