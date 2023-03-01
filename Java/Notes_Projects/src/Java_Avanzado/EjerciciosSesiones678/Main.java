package Java_Avanzado.EjerciciosSesiones678;

public class Main {
      public static void main(String[] args) {
            Application app1 = Application.getInstance();
            Application app2 = Application.getInstance();


            app1.run();
            app2.run();
      }

      /*
      Patrones Creacionales

      -Builder: Para clases complejas, para evitar un constructor gigante, este patron sirve para construirla paso por paso.
       Los destacable es que no se tienen que llamar a todos los pasos.
       En caso de tener muchos builders, se puede optar por tener un director, que dependiendo las especificaciones escoge un builder u otro.

      -Factory: Dependiendo un parametro utiliza una clase u otra.

      -Protoype: Crea un clon de un objeto.

      -Singleton: Solo se crea una sola instancia de la clase, haciendo imposible la creacion de 2 o mas.

      -Patrones estructurales

      -Adapter: Si se tiene una clase cuyos metodos varian a comparacion de otras clases, y es necesario que esta clase se adapte a las otras,
      se usa el patron adapter. Se crea una clase con los metodos default y en estos metodos se implemente la clase que se quiere adaptar.

      -Decorator: En esta clase un objeto puede aplicar metodos de otras clases, de esta forma cada clase puede tener uno o varios comportamientos
      pero en si misma permanece igual.

      -Facade: Este patron esconde logica compleja detras. En este patron se implementa toda la logica compleja por medio de metodos. De esta forma
      la aplicacion es mas sencilla.

      * */
}
