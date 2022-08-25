package cliente;
import java.time.LocalDate;

public class Cliente {
    private String nome;
    private String email;
    private LocalDate data_nasc;
    
    public Cliente() {
    }

    public Cliente(String nome, String email, LocalDate data_nasc) {
        this.nome = nome;
        this.email = email;
        this.data_nasc = data_nasc;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getData_nasc() {
        return data_nasc;
    }
    public void setData_nasc(LocalDate data_nasc) {
        this.data_nasc = data_nasc;
    }
    public String toString(String dataNsc){
        return nome+" "+"("+dataNsc+")"+" - "+email;
    }


}
