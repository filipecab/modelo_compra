package app;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.time.format.DateTimeFormatter;
import cliente.Cliente;
import ordemDeServico.ordem;
import status.Status;
import item.Item;
import produto.Produto;
import java.text.ParseException;


public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        boolean c=true;
        ordem compra=new ordem();
        Cliente cl=new Cliente();
        Produto p=new Produto();
        Item item=new Item();
        List<Item> c1=new ArrayList<>();
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

            cl=new Cliente(nome,email,LocalDate.of(ano,mes,dia));
            System.out.println();
            System.out.println("Enter ordem data: ");
            System.out.print("Status: ");
            System.out.print("1 para Aguardando pagamento, 2 para Processando, 3 para Enviado, 4 para Entregue:");
            int opc=sc.nextInt();
            String status="";
            switch (opc){
                case 1:
                    status="AGUARDANDO_PAGAMENTO";
                    break;
                case 2:
                    status="PROCESSANDO";
                    break;
                case 3:
                    status="ENVIADO";
                    break;
                case 4:
                    status="ENTREGUE";
                    break;
                default:
                    System.out.println("Erro ao executar!");
                    c=false;

            }
        

            System.out.print("how many items to this order?");
            int n=sc.nextInt();
            System.out.println();
            for (int i=0;i<n;i++){
                System.out.println("Enter "+i+1+"item data:");
                System.out.print("Product name: ");
                sc.nextLine();
                String P_name=sc.nextLine();
                System.out.println();
                System.out.print("Product price: ");
                double preco_p=sc.nextDouble();
                System.out.println();
                System.out.print("Quantity: ");
                int q=sc.nextInt();
                System.out.println();
                LocalDate momento=LocalDate.now();
                compra=new ordem(momento,Status.valueOf(status));
                p=new Produto(P_name,preco_p);
                item=new Item(q,p.getPrecoP(),p);
                compra.addItem(item);
                c1.add(item);
            }

            System.out.println("ORDER SUMMARY");
            System.out.println("ORDER MOMENT"+compra.getMomento());
            System.out.println("ORDER STATUS: "+compra.getSt());
            System.out.println("Cliente: "+cl.toString(dataSF));
            System.out.println("ORDER SERVICE: ");
            
            for (Item x:c1){
                System.out.println(x.getProduto().getNomeP()+", $"+x.getPrecoi()+", Quantity: "+x.getQuantidadeI()+", Subtotal"+x.totalvalor());
            }
            System.out.println("Total price: $"+compra.totalTudo());          
            
            System.out.println("continuar s ou n?");
            char opc2=sc.next().charAt(0);

            if (opc2=='n'){
                System.out.println("Obrigado por usar este programa");
                c=false;
            }

            sc.nextLine();



        }





    }
}
