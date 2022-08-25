package ordemDeServico;
import status.Status;
import java.time.LocalDate;
import item.Item;
import java.util.ArrayList;
import java.util.List;
import produto.Produto;

public class ordem {
    private LocalDate momento;
    private Status st;

    private List<Item> itens=new ArrayList<>();
    

    public ordem() {
    }
    public ordem(LocalDate momento, Status st) {
        this.momento = momento;
        this.st = st;
    }
    public LocalDate getMomento() {
        return momento;
    }
    public void setMomento(LocalDate momento) {
        this.momento = momento;
    }
    public Status getSt() {
        return st;
    }
    public void setSt(Status st) {
        this.st = st;
    }
    public List<Item> getItens() {
        return itens;
    }

    public void addItem(Item item){
        itens.add(item);
    }
    
    public void removeItem(Item item){
        itens.remove(item);
    }
    public Double totalTudo(){
        Double p=0.0;
        for (Item x: itens){
            p+=x.totalvalor();
        }
        return p;
    }
    
    
}
