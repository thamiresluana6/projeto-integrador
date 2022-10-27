package dto;

import com.example.projetointegrador.models.Carteira;
import com.example.projetointegrador.models.Documento;
import com.example.projetointegrador.models.Endereco;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
public class PessoaDTO {
    @Column(name = "id")
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "documento")
    private Documento documento;
    @Column(name = "endereco")
    private Endereco endereco;
    @Column(name = "genero")
    private String genero;
    @Column(name = "idade")
    private Integer idade;
    @Column(name = "rendimentoMensal")
    private Double rendimentoMensal;
    @Column(name = "estadoCivil")
    private String estadoCivil;
    @Column(name = "dependentes")
    private String dependentes;
    @Column(name = "carteira")
    private Carteira carteira;
}
