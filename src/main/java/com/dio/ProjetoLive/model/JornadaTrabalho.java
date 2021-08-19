package com.dio.ProjetoLive.model;

import lombok.*;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class JornadaTrabalho {
    @Id
    @GeneratedValue
    private long id;
    private String descricao;

}
