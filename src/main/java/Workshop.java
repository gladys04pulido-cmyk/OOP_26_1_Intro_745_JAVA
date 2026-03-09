import java.util.List;
import java.util.Random;

public class Workshop {
    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    // TODO: Implementar el método para retornar la suma de dos números enteros.
    // Ejemplo: Si a = 3 y b = 5, el resultado debería ser 8.
    public int sumarDosNumeros(int a, int b) {
        return a + b;
    }

    // Método que encuentra el mayor de tres números enteros
    // TODO: Implementar el método para retornar el mayor de los tres números enteros.
    public int mayorDeTresNumeros(int a, int b, int c) {

        if (a >= b && a >= c) return a;
        if (b >= c) return b;
        return c;
    }

    // Método que retorna la tabla de multiplicar de un número
    // TODO: Implementar el método para retornar la tabla de multiplicar del número dado.
    public int[] tablaMultiplicar(int numero, int limite) {

        int[] tabla = new int[limite];

        for (int i = 0; i < limite; i++) {
            tabla[i] = numero * (i + 1);
        }

        return tabla;
    }

    // Método que calcula el factorial de un número entero
    // TODO: Implementar el método para calcular el factorial de un número entero.
    public int factorial(int n) {

        if (n < 0) {
            throw new IllegalArgumentException();
        }

        int resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }

    // Método que verifica si un número es primo
    // TODO: Implementar el método para verificar si un número es primo.
    public boolean esPrimo(int numero) {

        if (numero <= 1) return false;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) return false;
        }

        return true;
    }

    // Método que genera una serie de Fibonacci
    // TODO: Implementar el método para generar la serie de Fibonacci hasta el número n.
    public int[] serieFibonacci(int n) {

        if (n < 0) throw new IllegalArgumentException();

        int[] serie = new int[n];

        if (n >= 1) serie[0] = 0;
        if (n >= 2) serie[1] = 1;

        for (int i = 2; i < n; i++) {
            serie[i] = serie[i - 1] + serie[i - 2];
        }

        return serie;
    }

    // Método que suma todos los elementos de un arreglo
    // TODO: Implementar el método para sumar todos los elementos de un arreglo.
    public int sumaElementos(int[] arreglo) {

        int suma = 0;

        for (int n : arreglo) {
            suma += n;
        }

        return suma;
    }

    // Método que calcula el promedio de los elementos de un arreglo
    // TODO: Implementar el método para calcular el promedio de los elementos de un arreglo.
    public double promedioElementos(int[] arreglo) {

        int suma = 0;

        for (int n : arreglo) {
            suma += n;
        }

        return (double) suma / arreglo.length;
    }

    // Método que encuentra el elemento mayor en un arreglo
    // TODO: Implementar el método para encontrar el elemento mayor en un arreglo.
    public int encontrarElementoMayor(int[] arreglo) {

        int mayor = arreglo[0];

        for (int n : arreglo) {
            if (n > mayor) {
                mayor = n;
            }
        }

        return mayor;
    }

    // Método que encuentra el elemento menor en un arreglo
    // TODO: Implementar el método para encontrar el elemento menor en un arreglo.
    public int encontrarElementoMenor(int[] arreglo) {

        int menor = arreglo[0];

        for (int n : arreglo) {
            if (n < menor) {
                menor = n;
            }
        }

        return menor;
    }

    // Método que busca un elemento en un arreglo
    // TODO: Implementar el método para buscar un elemento en un arreglo.
    public boolean buscarElemento(int[] arreglo, int elemento) {

        for (int n : arreglo) {
            if (n == elemento) return true;
        }

        return false;
    }

    // Método que invierte un arreglo
    // TODO: Implementar el método para invertir un arreglo.
    public int[] invertirArreglo(int[] arreglo) {

        int[] invertido = new int[arreglo.length];
        int j = 0;

        for (int i = arreglo.length - 1; i >= 0; i--) {
            invertido[j++] = arreglo[i];
        }

        return invertido;
    }

    // Método que ordena un arreglo en orden ascendente
    // TODO: Implementar el método para ordenar un arreglo en orden ascendente.
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
    public int[] eliminarDuplicados(int[] arreglo) {

        if (arreglo.length == 0) return arreglo;

        int[] ordenado = ordenarArreglo(arreglo);

        int contador = 1;

        for (int i = 1; i < ordenado.length; i++) {

            if (ordenado[i] != ordenado[i - 1]) contador++;
        }

        int[] resultado = new int[contador];

        resultado[0] = ordenado[0];

        int pos = 1;

        for (int i = 1; i < ordenado.length; i++) {

            if (ordenado[i] != ordenado[i - 1]) {

                resultado[pos++] = ordenado[i];
            }
        }

        return resultado;
    }

    // Método que combina dos arreglos en uno solo
    // TODO: Implementar el método para combinar dos arreglos en uno solo.
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
    public int[] rotarArreglo(int[] arreglo, int posiciones) {

        int n = arreglo.length;

        int[] resultado = new int[n];

        posiciones = posiciones % n;

        for (int i = 0; i < n; i++) {

            resultado[i] = arreglo[(i + posiciones) % n];
        }

        return resultado;
    }

    // Método que cuenta los caracteres en una cadena
    // TODO: Implementar el método para contar el número de caracteres en una cadena.
    public int contarCaracteres(String cadena) {

        return cadena.length();
    }

    // Método que invierte una cadena
    // TODO: Implementar el método para invertir una cadena.
    public String invertirCadena(String cadena) {

        return new StringBuilder(cadena).reverse().toString();
    }

    // Método que verifica si una cadena es un palíndromo
    // TODO: Implementar el método para verificar si una cadena es un palíndromo.
    public boolean esPalindromo(String cadena) {

        cadena = cadena.replaceAll("\\s+", "").toLowerCase();

        String invertida = new StringBuilder(cadena).reverse().toString();

        return cadena.equals(invertida);
    }

    // Método que cuenta el número de palabras en una cadena
    // TODO: Implementar el método para contar el número de palabras en una cadena.
    public static int contarPalabras(String texto) {

        if (texto == null || texto.trim().isEmpty()) return 0;

        String[] palabras = texto.trim().split("\\s+");

        return palabras.length;
    }

    // Método que convierte una cadena a mayúsculas
    // TODO: Implementar el método para convertir una cadena a mayúsculas.
    public String convertirAMayusculas(String cadena) {

        return cadena.toUpperCase();
    }

    // Método que convierte una cadena a minúsculas
    // TODO: Implementar el método para convertir una cadena a minúsculas.
    public String convertirAMinusculas(String cadena) {

        return cadena.toLowerCase();
    }

    // Método que reemplaza una subcadena en una cadena
    // TODO: Implementar el método para reemplazar una subcadena.
    public String reemplazarSubcadena(String cadena, String antigua, String nueva) {

        return cadena.replace(antigua, nueva);
    }

    // Método que busca una subcadena
    // TODO: Implementar el método para buscar una subcadena.
    public int buscarSubcadena(String cadena, String subcadena) {

        return cadena.indexOf(subcadena);
    }

    // Método que valida un correo electrónico
    // TODO: Implementar el método para validar un correo electrónico.
    public static boolean validarCorreoElectronico(String correo) {

        return correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }

    // Método que calcula el promedio de una lista
    // TODO: Implementar el método para calcular el promedio.
    public double promedioLista(List<Integer> lista) {

        if (lista == null || lista.isEmpty()) return 0.0;

        int suma = 0;

        for (int n : lista) {
            suma += n;
        }

        return (double) suma / lista.size();
    }

    // Método que convierte a binario
    // TODO: Implementar el método para convertir a binario.
    public String convertirABinario(int numero) {

        if (numero < 0) {
            return "-" + Integer.toBinaryString(Math.abs(numero));
        }

        return Integer.toBinaryString(numero);
    }

    // Método que convierte a hexadecimal
    // TODO: Implementar el método para convertir a hexadecimal.
    public String convertirAHexadecimal(int numero) {

        if (numero < 0) {
            return "-" + Integer.toHexString(Math.abs(numero)).toUpperCase();
        }

        return Integer.toHexString(numero).toUpperCase();
    }

    // Método para el juego Piedra Papel Tijera Lagarto Spock
    // TODO: Implementar el juego.
    public boolean jugarPiedraPapelTijeraLagartoSpock(String p1, String p2) {

        if (p1.equals("piedra") && (p2.equals("tijera") || p2.equals("lagarto"))) return true;
        if (p1.equals("papel") && (p2.equals("piedra") || p2.equals("spock"))) return true;
        if (p1.equals("tijera") && (p2.equals("papel") || p2.equals("lagarto"))) return true;
        if (p1.equals("lagarto") && (p2.equals("spock") || p2.equals("papel"))) return true;
        if (p1.equals("spock") && (p2.equals("tijera") || p2.equals("piedra"))) return true;

        return false;
    }

    public String pptls2(String game[]) {

        String p1 = game[0];
        String p2 = game[1];

        if (p1.equals(p2)) return "Tie";

        boolean p1Gana =
                (p1.equals("R") && (p2.equals("S") || p2.equals("L"))) ||
                (p1.equals("P") && (p2.equals("R") || p2.equals("V"))) ||
                (p1.equals("S") && (p2.equals("P") || p2.equals("L"))) ||
                (p1.equals("L") && (p2.equals("V") || p2.equals("P"))) ||
                (p1.equals("V") && (p2.equals("S") || p2.equals("R")));

        return p1Gana ? "Player 1" : "Player 2";
    }

    // Calcular área del círculo
    public static double areaCirculo(double radio) {

        return Math.PI * radio * radio;
    }

    // Signo zodiacal
    public String zoodiac(int d, int m) {

        if (m < 1 || m > 12 || d < 1 || d > 31) return "Invalid Date";

        if ((m == 3 && d >= 21) || (m == 4 && d <= 19)) return "Aries";
        if ((m == 4 && d >= 20) || (m == 5 && d <= 20)) return "Tauro";
        if ((m == 5 && d >= 21) || (m == 6 && d <= 20)) return "Géminis";
        if ((m == 6 && d >= 21) || (m == 7 && d <= 22)) return "Cáncer";
        if ((m == 7 && d >= 23) || (m == 8 && d <= 22)) return "Leo";
        if ((m == 8 && d >= 23) || (m == 9 && d <= 22)) return "Virgo";
        if ((m == 9 && d >= 23) || (m == 10 && d <= 22)) return "Libra";
        if ((m == 10 && d >= 23) || (m == 11 && d <= 21)) return "Escorpio";
        if ((m == 11 && d >= 22) || (m == 12 && d <= 21)) return "Sagitario";
        if ((m == 12 && d >= 22) || (m == 1 && d <= 19)) return "Capricornio";
        if ((m == 1 && d >= 20) || (m == 2 && d <= 18)) return "Acuario";

        return "Piscis";
    }
}