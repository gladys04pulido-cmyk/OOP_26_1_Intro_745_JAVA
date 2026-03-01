import java.util.List;

public class Workshop {
    public static void main(String[] args) {

    } // Método que suma dos números enteros
          public int sumarDosNumeros(int a, int b) {
      // TODO: Implementar el método para retornar la suma de dos números enteros.
      // Ejemplo: Si a = 3 y b = 5, el resultado debería ser 8.

        return a+b;
    }



    // Método que encuentra el mayor de tres números enteros
    // TODO: Implementar el método para retornar el mayor de los tres números enteros.
    // Ejemplo: Si a = 3, b = 7, y c = 5, el resultado debería ser 7.


    public int mayorDeTresNumeros(int a, int b, int c) {

    if (a>= b && a >=c) return a;
    if (b>=c) return b;  
      return c;
    }


    // Método que retorna la tabla de multiplicar de un número
    // TODO: Implementar el método para retornar la tabla de multiplicar del número dado.
    // Ejemplo: Si numero = 2 y limite = 5, el resultado debería ser [2, 4, 6, 8, 10].

    public int[] tablaMultiplicar(int numero, int limite) {
        
    int[] tabla = new int[limite];
    for (int i = 0; i < limite; i++) {
        tabla[i] = numero * (i + 1);
    }
    return tabla;

      }


    // Método que calcula el factorial de un número entero
    // TODO: Implementar el método para calcular el factorial de un número entero.
    // Ejemplo: Si n = 5, el resultado debería ser 120.
    // Lanzar IllegalArgumentException si n es negativo.

    public int factorial(int n) {

    if (n < 0) {
        throw new IllegalArgumentException("El número no puede ser negativo");
    }

    int resultado = 1;
    for (int i = 1; i <= n; i++) {
        resultado *= i;
    }
    return resultado;
    }

    

    // Método que verifica si un número es primo
    // TODO: Implementar el método para verificar si un número es primo.
    // Ejemplo: Si numero = 7, el resultado debería ser true.
        return false;

     public boolean esPrimo(int numero) {
    
     if (numero <= 1) {
        return false;
    }

        for (int i = 2; i < numero; i++) {
        if (numero % i == 0) {
            return false;
            }
         }
      return true;
      }
 

        // Método que genera una serie de Fibonacc
        // TODO: Implementar el método para generar la serie de Fibonacci hasta el número n.
        // Ejemplo: Si n = 5, el resultado debería ser [0, 1, 1, 2, 3].
        // Lanzar IllegalArgumentException si n es negativo.


       public int[] serieFibonacci(int n) {

    if (n < 0) {
       throw new IllegalArgumentException(" n no puede ser negativo ");
     }

    int[] serie = new int[n];

    if (n >= 1) {
        serie[0] = 0;
    }
    if (n >= 2) {
        serie[1] = 1;
    }

    for (int i = 2; i < n; i++) {
        serie[i] = serie[i - 1] + serie[i - 2];
    }

    return serie;
        
    }



    // Método que suma todos los elementos de un arreglo
    // TODO: Implementar el método para sumar todos los elementos de un arreglo.
    // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 15.
        


     public int sumaElementos(int[] arreglo) {

      int suma=0;

        for (int n : arreglo) {
        suma += n;
        }

        return suma;

    }


    // Método que calcula el promedio de los elementos de un arreglo
        // TODO: Implementar el método para calcular el promedio de los elementos de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 3.0.

        
    public double promedioElementos(int[] arreglo) {

    int suma=0;

        for (int n : arreglo) {
        suma += n;
        }

        return (double) suma / arreglo.length;

    }



    // Método que encuentra el elemento mayor en un arreglo
    // TODO: Implementar el método para encontrar el elemento mayor en un arreglo.
    // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 5.


        public int encontrarElementoMayor(int[] arreglo) {
       
        int mayor= arreglo[0];
        
        for(int n : arreglo) {

         if(n>mayor) {
           mayor = n;
         }
      }
        
        return mayor;
    }




    // Método que encuentra el elemento menor en un arreglo
    // TODO: Implementar el método para encontrar el elemento menor en un arreglo.
    // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 1.


        public int encontrarElementoMenor(int[] arreglo) {

        int menor= arreglo[0];
        
        for(int n : arreglo) {

         if(n<menor) {
           menor = n;
         }
      }
        
        return menor;
   
    }




    // Método que busca un elemento en un arreglo
    // TODO: Implementar el método para buscar un elemento en un arreglo.
    // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y elemento = 3, el resultado debería ser true.


        public boolean buscarElemento(int[] arreglo, int elemento) {
         
        for(int n : arreglo) {

         if(n == elemento) { 
            return true;

           }
       }
      
    return false; 

    }



    // Método que invierte un arreglo
    // TODO: Implementar el método para invertir un arreglo.
    // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser [5, 4, 3, 2, 1].


        public int[] invertirArreglo(int[] arreglo) {

     int[] invertido = new int[arreglo.length];
     int j= 0;
     
     for (int i= arreglo.length -1; i>=0; i--) {
       invertido [j] = arreglo [i];
       j++;

       }

      return invertido; 
    }



    // Método que ordena un arreglo en orden ascendente
    // TODO: Implementar el método para ordenar un arreglo en orden ascendente.
    // Ejemplo: Si arreglo = [5, 4, 3, 2, 1], el resultado debería ser [1, 2, 3, 4, 5].

         public int[] ordenarArreglo(int[] arreglo) {

     int[] ordenado = arreglo.clone();
     int aux;

    for (int i = 0; i < ordenado.length - 1; i++) {

        for (int j = 0; j < ordenado.length - 1; j++) {

            if (ordenado[j] > ordenado[j + 1]) {
                aux = ordenado[j];
                ordenado[j] = ordenado[j + 1];
                ordenado[j + 1] = aux;
              }
          }
      }

    return ordenado;
    }



    // Método que elimina los duplicados de un arreglo
    // TODO: Implementar el método para eliminar los duplicados de un arreglo.
    // Ejemplo: Si arreglo = [1, 2, 2, 3, 4, 4, 5], el resultado debería ser [1, 2, 3, 4, 5].


        public int[] eliminarDuplicados(int[] arreglo) {
       
     int[] ordenado = arreglo.clone();
     int aux;

    for (int i = 0; i < ordenado.length - 1; i++) {

        for (int j = 0; j < ordenado.length - 1; j++) {

            if (ordenado[j] > ordenado[j + 1]) {
                aux = ordenado[j];
                ordenado[j] = ordenado[j + 1];
                ordenado[j + 1] = aux;
              }
          }
      }


    int contador = 1; 
    for (int i = 1; i < ordenado.length; i++) {
        if (ordenado[i] != ordenado[i - 1]) {
            contador++;
        }
    }

    int[] resultado = new int[contador];
    resultado[0] = ordenado[0];
    int pos = 1;

    for (int i = 1; i < ordenado.length; i++) {
        if (ordenado[i] != ordenado[i - 1]) {
            resultado[pos] = ordenado[i];
            pos++;
        }
    }

    return resultado;
}





    // Método que combina dos arreglos en uno solo
    // TODO: Implementar el método para combinar dos arreglos en uno solo.
    // Ejemplo: Si arreglo1 = [1, 2, 3, 4, 5] y arreglo2 = [6, 7, 8], el resultado debería ser [1, 2, 3, 4, 5, 6, 7, 8].


     public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {

        int[] combinado = new int[arreglo1.length + arreglo2.length];

         for (int i = 0; i < arreglo1.length; i++) {
        combinado[i] = arreglo1[i];
        }
       
         for (int i = 0; i < arreglo2.length; i++) {
        combinado[arreglo1.length + i] = arreglo2[i];
        }

      return combinado;

    }




    // Método que rota un arreglo n posiciones
    // TODO: Implementar el método para rotar un arreglo n posiciones.
    // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y posiciones = 2, el resultado debería ser [3, 4, 5, 1, 2].

      public int[] rotarArreglo(int[] arreglo, int posiciones) {

      int n = arreglo.length;
      int[] rotacion = new int[n];  
      
      posiciones = posiciones % n;

      for (int i = 0; i < n; i++) {
        rotacion[i] = arreglo[(i + posiciones) % n];
    }

    return rotacion;

    }




    // Método que cuenta los caracteres en una cadena
    // TODO: Implementar el método para contar el número de caracteres en una cadena.
    // Ejemplo: Si cadena = "Hello", el resultado debería ser 5.


        public int contarCaracteres(String cadena) {
        return cadena.length();
        
    }



    // Método que invierte una cadena
    // TODO: Implementar el método para invertir una cadena.
    // Ejemplo: Si cadena = "Hello", el resultado debería ser "olleH".


    public String invertirCadena(String cadena) {

    String invertida = "";

    for (int i = cadena.length() - 1; i >= 0; i--) {
        invertida += cadena.charAt(i);
    }

    return invertida;
        
    }



    // Método que verifica si una cadena es un palíndromo
    // TODO: Implementar el método para verificar si una cadena es un palíndromo.
    // Ejemplo: Si cadena = "madam", el resultado debería ser true.


         public boolean esPalindromo(String cadena) {

         String invertida = invertirCadena(cadena); // uso el metodo realizado anterior mente 
         return cadena.equals(invertida);


    }



    // Método que cuenta el número de palabras en una cadena
    // TODO: Implementar el método para contar el número de palabras en una cadena.
    // Ejemplo: Si cadena = "Este es un test", el resultado debería ser 4.

         public int contarPalabras(String cadena) {

         String[] palabras = cadena.trim().split("\\s+");

         return palabras.length;
      
    }


    // Método que convierte una cadena a mayúsculas
    // TODO: Implementar el método para convertir una cadena a mayúsculas.
    // Ejemplo: Si cadena = "hello", el resultado debería ser "HELLO".

        public String convertirAMayusculas(String cadena) {

       return cadena.toUpperCase();

    }


    // Método que convierte una cadena a minúsculas
           // TODO: Implementar el método para convertir una cadena a minúsculas.
        // Ejemplo: Si cadena = "HELLO", el resultado debería ser "hello".


         public String convertirAMinusculas(String cadena) {

         return cadena.toLowerCase();

    }



    // Método que reemplaza una subcadena en una cadena por otra subcadena
    // TODO: Implementar el método para reemplazar una subcadena en una cadena por otra subcadena.
    // Ejemplo: Si cadena = "Hello Java", antiguaSubcadena = "Java", y nuevaSubcadena = "world", el resultado debería ser "Hello world".


     public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {


     return cadena.replace(antiguaSubcadena, nuevaSubcadena);

        
    }



    // Método que busca una subcadena en una cadena y retorna su índice
    // TODO: Implementar el método para buscar una subcadena en una cadena y retornar su índice.
    // Ejemplo: Si cadena = "Hello world" y subcadena = "world", el resultado debería ser 6.

       public int buscarSubcadena(String cadena, String subcadena) {

       return cadena.indexOf(subcadena);

    }


    // Método que valida un correo electrónico
    // TODO: Implementar el método para validar un correo electrónico.
    // Ejemplo: Si correo = "test@example.com", el resultado debería ser true.


      public boolean validarCorreoElectronico(String correo) {

      if (correo == null) return false; 

      return correo.contains("@") && correo.indexOf("@") < correo.lastIndexOf(".");


    }


    // Método que calcula el promedio de una lista de números
    // TODO: Implementar el método para calcular el promedio de una lista de números.
    // Ejemplo: Si lista = [1, 2, 3, 4, 5], el resultado debería ser 3.0.


        public double promedioLista(List<Integer> lista) {

        if (lista == null || lista.isEmpty()) return 0.0; 

    int suma = 0;
    for (int n : lista) {
        suma += n;
    }

    return (double) suma / lista.size();
    }


    // Método que convierte un número en su representación binaria
    // TODO: Implementar el método para convertir un número en su representación binaria.
    // Ejemplo: Si numero = 10, el resultado debería ser "1010".

        public String convertirABinario(int numero) {

      return Integer.toBinaryString(numero);

    }


    // Método que convierte un número en su representación hexadecimal
    // TODO: Implementar el método para convertir un número en su representación hexadecimal.
    // Ejemplo: Si numero = 255, el resultado debería ser "FF".


     public String convertirAHexadecimal(int numero) {

         return Integer.toHexString(numero).toUpperCase();

    }


    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    // TODO: Implementar el método para el juego de Piedra, Papel, Tijera, Lagarto, Spock.


    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        
        String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};
        Random rand = new Random();
        String eleccionComputadora = opciones[rand.nextInt(opciones.length)];

        if (eleccionUsuario.equals(eleccionComputadora)) {
            return "Empate! Ambos eligieron " + eleccionUsuario;
        }

        boolean ganaUsuario = 
            (eleccionUsuario.equals("Piedra") && (eleccionComputadora.equals("Tijera") || eleccionComputadora.equals("Lagarto"))) ||
            (eleccionUsuario.equals("Papel") && (eleccionComputadora.equals("Piedra") || eleccionComputadora.equals("Spock"))) ||
            (eleccionUsuario.equals("Tijera") && (eleccionComputadora.equals("Papel") || eleccionComputadora.equals("Lagarto"))) ||
            (eleccionUsuario.equals("Lagarto") && (eleccionComputadora.equals("Spock") || eleccionComputadora.equals("Papel"))) ||
            (eleccionUsuario.equals("Spock") && (eleccionComputadora.equals("Tijera") || eleccionComputadora.equals("Piedra")));

        if (ganaUsuario) {
            return "¡Ganaste! Computadora eligió " + eleccionComputadora;
        } 
        else {
            return "¡Perdiste! Computadora eligió " + eleccionComputadora;
        }
    }

    // El método debe retornar un mensaje indicando el resultado del juego.
        

    public String pptls2(String game[]) {
            }

    public double areaCirculo(double radio) {
        return 0.0;
    }

    public String zoodiac(int day, int month) {
        return "";
    }


}

