package me.dio.sacola.resource.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor //Criar construtor com todos os atributos.
@Builder  //Criar objeto de forma simples.
@Data //Criar métodos Getters e Setters e alem disso os métodos Equals e HashCode.
@Embeddable //Significa que a Classe não será uma tabela no Banco de Dados e também para reutilizar o Código (ou Classe) em outras Classes.
@NoArgsConstructor //Criar construtor vazio.
public class ItemDto {
    private Long produtoId;
    private int quantidade;
    private Long idSacola;
}
