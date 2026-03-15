import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Workshop {

    public static void main(String[] args) {
        // main vacío como lo entregan normalmente
    }

    // Suma dos números
    public int sumarDosNumeros(int a, int b) {
        return a + b;
    }

    // Mayor de tres números
    public int mayorDeTresNumeros(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        if (b >= c) return b;
        return c;
    }

    // Tabla de multiplicar
    public int[] tablaMultiplicar(int numero, int limite) {
        int[] tabla = new int[limite];
        for (int i = 0; i < limite; i++) {
            tabla[i] = numero * (i + 1);
        }
        return tabla;
    }

    // Factorial
    public int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Número negativo");
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Número primo
    public boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    // Serie Fibonacci
    public int[] serieFibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("Número negativo");
        int[] fib = new int[n];
        if (n > 0) fib[0] = 0;
        if (n > 1) fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    // Suma de elementos
    public int sumaElementos(int[] arreglo) {
        int suma = 0;
        for (int n : arreglo) {
            suma += n;
        }
        return suma;
    }

    // Promedio
    public double promedioElementos(int[] arreglo) {
        if (arreglo.length == 0) return 0;
        return (double) sumaElementos(arreglo) / arreglo.length;
    }

    // Mayor del arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        int mayor = arreglo[0];
        for (int n : arreglo) {
            if (n > mayor) mayor = n;
        }
        return mayor;
    }

    // Menor del arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        int menor = arreglo[0];
        for (int n : arreglo) {
            if (n < menor) menor = n;
        }
        return menor;
    }

    // Buscar elemento
    public boolean buscarElemento(int[] arreglo, int elemento) {
        for (int n : arreglo) {
            if (n == elemento) return true;
        }
        return false;
    }

    // Invertir arreglo
    public int[] invertirArreglo(int[] arreglo) {
        int[] invertido = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }
        return invertido;
    }

    // Ordenar arreglo
    public int[] ordenarArreglo(int[] arreglo) {
        int[] copia = arreglo.clone();
        for (int i = 0; i < copia.length - 1; i++) {
            for (int j = i + 1; j < copia.length; j++) {
                if (copia[i] > copia[j]) {
                    int temp = copia[i];
                    copia[i] = copia[j];
                    copia[j] = temp;
                }
            }
        }
        return copia;
    }

    // Eliminar duplicados
    public int[] eliminarDuplicados(int[] arreglo) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int n : arreglo) {
            if (!lista.contains(n)) lista.add(n);
        }
        int[] resultado = new int[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            resultado[i] = lista.get(i);
        }
        return resultado;
    }

    // Combinar arreglos
    public int[] combinarArreglos(int[] a, int[] b) {
        int[] combinado = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) combinado[i] = a[i];
        for (int i = 0; i < b.length; i++) combinado[a.length + i] = b[i];
        return combinado;
    }

    // Rotar arreglo
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        int n = arreglo.length;
        int[] rotado = new int[n];
        for (int i = 0; i < n; i++) {
            rotado[i] = arreglo[(i + posiciones) % n];
        }
        return rotado;
    }

    // Contar caracteres
    public int contarCaracteres(String cadena) {
        return cadena.length();
    }

    // Invertir cadena
    public String invertirCadena(String cadena) {
        String invertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertida += cadena.charAt(i);
        }
        return invertida;
    }

    // Palíndromo
    public boolean esPalindromo(String cadena) {
        String limpia = cadena.replace(" ", "").toLowerCase();
        return limpia.equals(invertirCadena(limpia));
    }

    // Contar palabras
    public int contarPalabras(String cadena) {
        if (cadena.trim().isEmpty()) return 0;
        return cadena.trim().split("\\s+").length;
    }

    // Mayúsculas
    public String convertirAMayusculas(String cadena) {
        return cadena.toUpperCase();
    }

    // Minúsculas
    public String convertirAMinusculas(String cadena) {
        return cadena.toLowerCase();
    }

    // Reemplazar subcadena
    public String reemplazarSubcadena(String cadena, String vieja, String nueva) {
        return cadena.replace(vieja, nueva);
    }

    // Buscar subcadena
    public int buscarSubcadena(String cadena, String subcadena) {
        return cadena.indexOf(subcadena);
    }

    // Validar correo
    public boolean validarCorreoElectronico(String correo) {
        return correo.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
    }

    // Promedio lista
    public double promedioLista(List<Integer> lista) {
        if (lista.isEmpty()) return 0;
        int suma = 0;
        for (int n : lista) suma += n;
        return (double) suma / lista.size();
    }

    // Binario
    public String convertirABinario(int numero) {
        return Integer.toBinaryString(numero);
    }

    // Hexadecimal
    public String convertirAHexadecimal(int numero) {
        return Integer.toHexString(numero).toUpperCase();
    }

    // Piedra Papel Tijera Lagarto Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String user) {
        String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};
        String cpu = opciones[new Random().nextInt(opciones.length)];

        if (user.equalsIgnoreCase(cpu)) return "Empate";

        if (
            (user.equalsIgnoreCase("Piedra") && (cpu.equals("Tijera") || cpu.equals("Lagarto"))) ||
            (user.equalsIgnoreCase("Papel") && (cpu.equals("Piedra") || cpu.equals("Spock"))) ||
            (user.equalsIgnoreCase("Tijera") && (cpu.equals("Papel") || cpu.equals("Lagarto"))) ||
            (user.equalsIgnoreCase("Lagarto") && (cpu.equals("Spock") || cpu.equals("Papel"))) ||
            (user.equalsIgnoreCase("Spock") && (cpu.equals("Tijera") || cpu.equals("Piedra")))
        ) {
            return "Ganaste (CPU eligió " + cpu + ")";
        }

        return "Perdiste (CPU eligió " + cpu + ")";
    }

    public String pptls2(String[] game) {
        if (game[0].equals(game[1])) return "Empate";
        return "Juego válido";
    }

    // Área círculo
    public double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    // Zodiaco
    public String zoodiac(int d, int m) {
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