import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class PrimerPrograma {

        public static void main (String[] args) {

            Ingredientes ingredientes = new Ingredientes();
            Preparacion preparacion = new Preparacion();

            ingredientes.ing = "Arroz bomba: 1500 g" + "\n" + "Pollo de corral: 1" + "\n" + "Conejo: 0.5" +
                    "Judía verde plana: 500 g" + "\n" + "Garrofó: 500 g" + "\n" + "Alcachofa: 500 g" + "\n" +
                    "Aceite de oliva virgen extra" + "\n" + "Pimentón dulce" + "\n" + "Tomate triturado"
                    + "\n" + "Azafrán" + "\n" + "Romero fresco" + "\n" + "Sal" + "\n" + "\n";

            preparacion.prep = "Dificultad: media" + "\n" + "Tiempo total: 1h 25m" + "\n" + "Elaboración: 10 m" +
                    "\n" + "Cocción: 1h 15m" + "\n" + "Reposo: 5 m";


            String archivo = "paella.txt";
            Path file = Paths.get(archivo);

            String texto = ingredientes.ing.concat(preparacion.prep);
            generaSalida(file, texto);
        }

        static class Ingredientes{
              String ing;
        }

        static class Preparacion{
              String prep;
        }

        interface generaSalida{
            public void generaSalida();
        }


        public static void generaSalida(Path file, String texto){
        try{
            Files.write(file, Collections.singleton(texto), StandardCharsets.UTF_8);
    } catch (IOException e){
        }

    }


}