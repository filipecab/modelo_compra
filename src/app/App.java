package app;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import cliente.Cliente;
import ordemDeServico.ordem;
import java.text.ParseException;


public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        boolean c=true;
        
        while (c){
            System.out.println("Enter cliente data: ");
            System.out.print("name: ");
            String nome=sc.nextLine();
            System.out.println();
            System.out.print("e-mail: ");
            String email=sc.next();
            System.out.println();
            System.out.print("Birth date: (DD/MM/YYYY)");
            String dataSF=sc.next();
            int dia=Integer.parseInt(dataSF.substring(0,2));
            int mes=Integer.parseInt(dataSF.substring(3,5));
            int ano=Integer.parseInt(dataSF.substring(6,9));

            Cliente cl=new Cliente(nome,email,LocalDate.of(ano,mes,dia));
            System.out.println();
            System.out.println("Enter ordem data: ");


        }





    }
}
