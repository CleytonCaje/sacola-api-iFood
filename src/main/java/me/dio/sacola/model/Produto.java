package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@AllArgsConstructor //Criar construtor com todos os atributos.
@Builder  //Criar objeto de forma simples.
@Data //Criar métodos Getters e Setters e alem disso os métodos Equals e HashCode.
@Entity
//Converter a Classe em uma tabela no Banco de Dados e Salva-los. Classe "Modelo" por isso fica na Package "model".
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) //Ignorar erros que aparecem por estar usando o hibernate em modo preguiçoso (lazy).
@NoArgsConstructor //Criar construtor vazio
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Double valorUnitario;
    @Builder.Default //Indica (Caso o produto sempre for True) que assim que for criado ele já estará disponível.
    private boolean disponivel = true;
    @ManyToOne
    @JsonIgnore
    private Restaurante restaurante;
}
