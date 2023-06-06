import java.io.*;

public class Factorial {
    public static void main (String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese numero: ");
        String input = buffer.readLine();
        int dato = Integer.parseInt(input);
        String print = "";

        for (int i = dato; i >= 0; i--) {
            if (i == dato) {
                print += input;
            } else {
                print = print + "*" + String.valueOf(i);
            }
            System.out.println(print + "!");
        }
    }
}