package item;


import produto.Produto;

public class Item {
    private Integer quantidadeI;
    private Double precoi;
    
    
    private Produto produto;
    
    
    
    public Item() {
    }

   
    public Item(Integer quantidadeI, Double precoi,Produto produto) {
        this.quantidadeI = quantidadeI;
        this.precoi = produto.getPrecoP();
        this.produto = produto;
    }
    public Integer getQuantidadeI() {
        return quantidadeI;
    }
    public void setQuantidadeI(Integer quantidadeI) {
        this.quantidadeI = quantidadeI;
    }
    public Double getPrecoi() {
        return precoi;
    }
    public void setPrecoi(Double precoi) {
        this.precoi = precoi;
    }


    public Produto getProduto() {
        return produto;
    }


    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double totalvalor(){
        Double total=quantidadeI*precoi;
        return total;
    }
    

    
    
}
