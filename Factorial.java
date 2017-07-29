
import java.util.Scanner;
/**
 * Programa para hallar el factorial de un número
 *
 * @author Luis Cobo
 */
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);  // Para leer desde el teclado
        int f = 1, n;
        
        System.out.print("Ingrese un número: ");
        n = teclado.nextInt();
        for (int i = 1; i <= n; ++i)
        {
            f = f * i;
        }
        System.out.println("El factorial de " + n + " es " + f);
    }
}
