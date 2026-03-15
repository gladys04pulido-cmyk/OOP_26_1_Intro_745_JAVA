import java.util.List;

public class Workshop {

    public static void main(String[] args) {

    }

    public static int sumarDosNumeros(int a, int b) {
        return a + b;
    }

    public static int mayorDeTresNumeros(int a, int b, int c) {

        if (a >= b && a >= c) return a;
        if (b >= c) return b;
        return c;
    }

    public static int[] tablaMultiplicar(int numero, int limite) {

        if (limite <= 0) return new int[0];

        int[] tabla = new int[limite];

        for (int i = 0; i < limite; i++) {
            tabla[i] = numero * (i + 1);
        }

        return tabla;
    }

    public static int factorial(int n) {

        if (n < 0) throw new IllegalArgumentException();

        int resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }

    public static boolean esPrimo(int numero) {

        if (numero <= 1) return false;

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }

        return true;
    }

    public static int[] serieFibonacci(int n) {

        if (n < 0) throw new IllegalArgumentException();

        int[] serie = new int[n];

        if (n >= 1) serie[0] = 0;
        if (n >= 2) serie[1] = 1;

        for (int i = 2; i < n; i++) {
            serie[i] = serie[i - 1] + serie[i - 2];
        }

        return serie;
    }

    public static int sumaElementos(int[] arreglo) {

        int suma = 0;

        for (int n : arreglo) {
            suma += n;
        }

        return suma;
    }

    public static double promedioElementos(int[] arreglo) {

        if (arreglo == null || arreglo.length == 0) return 0;

        int suma = 0;

        for (int n : arreglo) {
            suma += n;
        }

        return (double) suma / arreglo.length;
    }

    public static int encontrarElementoMayor(int[] arreglo) {

        int mayor = arreglo[0];

        for (int n : arreglo) {
            if (n > mayor) {
                mayor = n;
            }
        }

        return mayor;
    }

    public static int encontrarElementoMenor(int[] arreglo) {

        int menor = arreglo[0];

        for (int n : arreglo) {
            if (n < menor) {
                menor = n;
            }
        }

        return menor;
    }

    public static boolean buscarElemento(int[] arreglo, int elemento) {

        for (int n : arreglo) {
            if (n == elemento) return true;
        }

        return false;
    }

    public static int[] invertirArreglo(int[] arreglo) {

        int[] invertido = new int[arreglo.length];

        int j = 0;

        for (int i = arreglo.length - 1; i >= 0; i--) {
            invertido[j++] = arreglo[i];
        }

        return invertido;
    }

    public static int[] ordenarArreglo(int[] arreglo) {

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

    public static int[] eliminarDuplicados(int[] arreglo) {

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

    public static int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {

        int[] combinado = new int[arreglo1.length + arreglo2.length];

        for (int i = 0; i < arreglo1.length; i++) {
            combinado[i] = arreglo1[i];
        }

        for (int i = 0; i < arreglo2.length; i++) {
            combinado[arreglo1.length + i] = arreglo2[i];
        }

        return combinado;
    }

    public static int[] rotarArreglo(int[] arreglo, int posiciones) {

        int n = arreglo.length;

        int[] resultado = new int[n];

        posiciones = posiciones % n;

        for (int i = 0; i < n; i++) {
            resultado[(i + posiciones) % n] = arreglo[i];
        }

        return resultado;
    }

    public static int contarCaracteres(String cadena) {
        return cadena.length();
    }

    public static String invertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    public static boolean esPalindromo(String cadena) {

        cadena = cadena.replaceAll("\\s+", "").toLowerCase();

        String invertida = new StringBuilder(cadena).reverse().toString();

        return cadena.equals(invertida);
    }

    public static int contarPalabras(String texto) {

        if (texto == null || texto.trim().isEmpty()) return 0;

        String[] palabras = texto.trim().split("\\s+");

        return palabras.length;
    }

    public static String convertirAMayusculas(String cadena) {
        return cadena.toUpperCase();
    }

    public static String convertirAMinusculas(String cadena) {
        return cadena.toLowerCase();
    }

    public static String reemplazarSubcadena(String cadena, String antigua, String nueva) {
        return cadena.replace(antigua, nueva);
    }

    public static int buscarSubcadena(String cadena, String subcadena) {
        return cadena.indexOf(subcadena);
    }

    public static boolean validarCorreoElectronico(String correo) {
        return correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }

    public static double promedioLista(List<Integer> lista) {

        if (lista == null || lista.isEmpty()) return 0.0;

        int suma = 0;

        for (int n : lista) {
            suma += n;
        }

        return (double) suma / lista.size();
    }

    public static String convertirABinario(int numero) {

        if (numero < 0) {
            return "-" + Integer.toBinaryString(Math.abs(numero));
        }

        return Integer.toBinaryString(numero);
    }

    public static String convertirAHexadecimal(int numero) {

        if (numero < 0) {
            return "-" + Integer.toHexString(Math.abs(numero)).toUpperCase();
        }

        return Integer.toHexString(numero).toUpperCase();
    }

   public static String jugarPiedraPapelTijeraLagartoSpock(String jugador1, String jugador2) {

    if (jugador1.equals(jugador2)) return "Tie";

    if (jugador1.equals("R") && (jugador2.equals("S") || jugador2.equals("L"))) return "Player 1";
    if (jugador1.equals("P") && (jugador2.equals("R") || jugador2.equals("V"))) return "Player 1";
    if (jugador1.equals("S") && (jugador2.equals("P") || jugador2.equals("L"))) return "Player 1";
    if (jugador1.equals("L") && (jugador2.equals("V") || jugador2.equals("P"))) return "Player 1";
    if (jugador1.equals("V") && (jugador2.equals("S") || jugador2.equals("R"))) return "Player 1";

    return "Player 2";
}

public static String jugarPiedraPapelTijeraLagartoSpock(String game) {

    String jugador1 = game.substring(0,1);
    String jugador2 = game.substring(1,2);

    return jugarPiedraPapelTijeraLagartoSpock(jugador1, jugador2);
}
   

    public static double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static String zoodiac(int d, int m) {

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