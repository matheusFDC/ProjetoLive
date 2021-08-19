package com.dio.ProjetoLive.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Empresa {
    @Id
    private long id;
    private String descricao;
    private String cnpj;
    private String endereco;
    private String banco;
    private String cidade;
    private String estado;
    private String telefone;
}
