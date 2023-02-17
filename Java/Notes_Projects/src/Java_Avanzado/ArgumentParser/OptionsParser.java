package Java_Avanzado.ArgumentParser;

import java.util.HashMap;

public class OptionsParser {
       private HashMap<String, String> options = new HashMap();
       private String [] args;

       private OptionsParser(){}

       public OptionsParser( String[] args ){
              this.args = args;
       }

       public void registerOption( String optionName ){
              options.put( optionName, "" );
       }

       public String getOption( String optionName ){
              return options.get( optionName );
       }



       public void setOptionValue( String optionName, String value ){
              options.replace( optionName, value );
       }

       public void parse(){

              for( var i = 0; i < args.length; i++ ){

                     //Eliminate - of arguments
                     String optionName = args[i].replace( "-", "" );

                     // Get value of argument
                     if ( options.containsKey( optionName ) ){
                            setOptionValue( optionName, args[i + 1] );
                     }
              }
       }

}
