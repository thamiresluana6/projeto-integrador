package dto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
public class DocumentoDTO {
    private String cpf;
    private String cnpj;
    private String identidade;
}
