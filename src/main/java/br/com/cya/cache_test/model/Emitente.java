package br.com.cya.cache_test.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Table(name = "emitente")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Emitente implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank(message = "Nome não pode ser vazio")
    @Size(max = 100, message = "Nome não pode ter mais de 100 caracteres")
    private String nome;

    @NotBlank(message = "CNPJ não pode ser vazio")
    @Size(min = 14, max = 14, message = "CNPJ deve ter 14 caracteres")
    @Column(unique = true)
    private String cnpj;

    @NotBlank(message = "Endereço não pode ser vazio")
    @Size(max = 255, message = "Endereço não pode ter mais de 255 caracteres")
    private String endereco;

    @NotBlank(message = "Telefone não pode ser vazio")
    @Size(max = 15, message = "Telefone não pode ter mais de 15 caracteres")
    private String telefone;

    @Email(message = "E-mail deve ser válido")
    @Size(max = 100, message = "E-mail não pode ter mais de 100 caracteres")
    private String email;

}
