package Java_Avanzado.ArgumentParser;

public class Main {

       public static void main( String[] args ) { //In Edit configuration Parameters were added

              /* Librerias disponibles para parsear
              http://commons.apache.org/cli/ - Apache Commons CLI
              http://www.martiansofware.com/jsap/ - JSAP
              */

              OptionsParser optionsParser = new OptionsParser( args );
              optionsParser.registerOption( "minval" );
              optionsParser.registerOption( "maxval");
              optionsParser.parse();

              String minval = optionsParser.getOption( "minval");
              String maxval = optionsParser.getOption( "maxval");
              System.out.println( minval );
              System.out.println( maxval );

       }
}
