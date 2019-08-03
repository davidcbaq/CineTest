import java.util.Random;

public class Cine {
    private static int sillasDisponibles;
    private static double precioDeLaEntrada;

    public static void main(String[] args){

        precioDeLaEntrada=numeroAleatorio(12,30);
        System.out.println("Bienvenidos del dia de hoy el precio de la boleta es: "+ precioDeLaEntrada+" dolares");


        Pelicula[] peliculasDelDia=generarPeliculas(numeroAleatorio(1,3));
        System.out.println("Peliculas del dia de hoy: "+ peliculasDelDia.length);
        for (int i = 0; i < peliculasDelDia.length ; i++) {
            System.out.println("\tPelicula "+(i+1)+": "+peliculasDelDia[i].getTitulo()+" Duracion en minutos: "+peliculasDelDia[i].getDuracionEnMinutos()+"min Director(a): "+peliculasDelDia[i].getNombreDirector());
        }




        Espectador[] espectadoresEsperados=generarEspectadores(numeroEspectadores(220,250));
        System.out.println("\n\nEspectadores del dia de hoy: "+ espectadoresEsperados.length);
        for (int i = 0; i < espectadoresEsperados.length; i++) {
            System.out.println("\tEspectador "+(i+1)+": "+espectadoresEsperados[i].getNombre()+" Edad: "+espectadoresEsperados[i].getEdad()+" Dinero que tiene: "+espectadoresEsperados[i].getDineroQueTiene()+" dolares");
        }

        Asiento[] asientos=generarAsientos();
        sillasDisponibles=72;
        System.out.println("\n\nAsientos: "+ asientos.length);
        for (int i = 0; i < asientos.length; i++) {
            if(asientos[i].getLetraUbicacion().equals("I")){
                System.out.println("\t "+asientos[i].getNumeroDeFila()+""+asientos[i].getLetraUbicacion());
            }else{
                System.out.print("\t "+asientos[i].getNumeroDeFila()+""+asientos[i].getLetraUbicacion());
            }


        }
        System.out.println("\n\nLos espectadores han comenzado a sentarse: ");
        int asiento=0;
        for (int i = 0; i < espectadoresEsperados.length; i++) {

            boolean sentado = false;
            if (sillasDisponibles != 0) {
                if (espectadoresEsperados[i].getDineroQueTiene() >= precioDeLaEntrada) {

                    while (!sentado) {
                        asiento = numeroAleatorio(0, 71);
                        System.out.println("\tEl espectador " + (i + 1) + ": " + espectadoresEsperados[i].getNombre() + " intento sentar en el asiento: " + asientos[asiento].getNumeroDeFila() + asientos[asiento].getLetraUbicacion());
                        if (asientos[asiento].isOcupado()) {
                            System.out.println("Lastima el asiento estaba ocupado");
                        } else {
                            System.out.println("Y estaba libre.");
                            sentado = true;
                            asientos[asiento].setOcupado(true);
                            sillasDisponibles--;
                            for (int z = 0; z < asientos.length; z++) {
                                if (asientos[z].isOcupado()) {

                                    if (asientos[z].getLetraUbicacion().equals("I")) {
                                        System.out.println("\t   ");
                                    }else{
                                        System.out.print("\t   ");
                                    }
                                } else {

                                    if (asientos[z].getLetraUbicacion().equals("I")) {
                                        System.out.println("\t " + asientos[z].getNumeroDeFila() + "" + asientos[z].getLetraUbicacion());
                                    } else {
                                        System.out.print("\t " + asientos[z].getNumeroDeFila() + "" + asientos[z].getLetraUbicacion());
                                    }
                                }
                            }
                        }

                    }

                } else {
                    System.out.println("\tEl espectador " + (i + 1) + ": " + espectadoresEsperados[i].getNombre() + " no tiene el dinero suficiente para pagar la entrada y se va a su casa llorando.");
                }
            }else{
                System.out.println("Todas las sillas han sido ocupadas !!Disfruten su funcion!!!");
                break;
            }
            asiento = 0;

        }




        }

    public static int numeroEspectadores(int desde,int hasta){
        Random rnd = new Random();
        int numero = rnd.nextInt(hasta - desde + 1) + desde;
        return numero;
    }
    public static Espectador[] generarEspectadores(int numeroDeEspectadores){
        Espectador[] espectadores = new Espectador[numeroDeEspectadores];
        String[ ] nombres = new String[11];
        nombres[0] = "Luis";
        nombres[1] = "María";
        nombres[2] = "Carlos";
        nombres[3] = "Jose";
        nombres[4] = "Ismael";
        nombres[5] = "David";
        nombres[6] = "Daniel";
        nombres[7] = "Fabian";
        nombres[8] = "Paula";
        nombres[9] = "Sebastian";
        nombres[10] = "Claudia";
        for (int i = 0; i < numeroDeEspectadores ; i++) {
            espectadores[i]=new Espectador(nombres[numeroAleatorio(0,10)],numeroAleatorio(10,30),numeroAleatorio(1,100));
        }

        return espectadores;


    }
    public static int numeroAleatorio(int desde, int hasta) {
        Random rnd = new Random();
        int numero = rnd.nextInt(hasta - desde + 1) + desde;
        return numero;
    }
    public static Pelicula[] generarPeliculas(int numeroDePeliculas){
        Pelicula[] peliculas = new Pelicula[numeroDePeliculas];
        String[] nombresPeliculas = new String[11];
        nombresPeliculas[0] = "Hombres de negro";
        nombresPeliculas[1] = "Harry Potter";
        nombresPeliculas[2] = "Yo soy Dios";
        nombresPeliculas[3] = "Blanca Nieves";
        nombresPeliculas[4] = "Aladdin";
        nombresPeliculas[5] = "King Kong";
        nombresPeliculas[6] = "Era del Hielo";
        nombresPeliculas[7] = "Los Salvajes";
        nombresPeliculas[8] = "Al otro lado";
        nombresPeliculas[9] = "X-Men";
        nombresPeliculas[10] = "Termine tarde";

        String[ ] nombres = new String[11];
        nombres[0] = "Luis";
        nombres[1] = "María";
        nombres[2] = "Carlos";
        nombres[3] = "Jose";
        nombres[4] = "Ismael";
        nombres[5] = "David";
        nombres[6] = "Daniel";
        nombres[7] = "Fabian";
        nombres[8] = "Paula";
        nombres[9] = "Sebastian";
        nombres[10] = "Claudia";
        for (int i = 0; i < numeroDePeliculas ; i++) {
            peliculas[i]=new Pelicula(nombresPeliculas[numeroAleatorio(0,10)], numeroAleatorio(60,185),numeroAleatorio(13,18), nombres[numeroAleatorio(0,10)]);
        }

        return peliculas;


    }
    public static Asiento[] generarAsientos(){
        Asiento[] asientos=new Asiento[72];
        String letra="";
        int numeroFila=0;

        int aux=0;
             for (int k = 7; k >=0; k--) {
                 numeroFila=k+1;
                 for (char j = 'A'; j <='I' ; j++) {
                   letra=j+"";
                    asientos[aux]=new Asiento(letra,numeroFila,false);
                    aux++;


                }


            }



        return asientos;
    }

}

