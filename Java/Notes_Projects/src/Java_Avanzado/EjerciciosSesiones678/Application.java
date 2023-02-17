package Java_Avanzado.EjerciciosSesiones678;

public class Application {

      private static Application app;

      boolean isRunning = false;

      private Application(){}

      public static Application getInstance() {

            if ( app == null ) {
                  app = new Application();
            }

            return app;

      }

      public void run(){

            if (!isRunning){
                  isRunning = true;
                  System.out.println("Starts running...");
            } else {
                  System.out.println( "Already running..." );
            }

      }

}
