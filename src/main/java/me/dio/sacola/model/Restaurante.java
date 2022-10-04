package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;
@AllArgsConstructor //Criar construtor com todos os atributos.
@Builder  //Criar objeto de forma simples.
@Data //Criar métodos Getters e Setters e alem disso os métodos Equals e HashCode.
@Entity //Converter a Classe em uma tabela no Banco de Dados e Salva-los. Classe "Modelo" por isso fica na Package "model".
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) //Ignorar erros que aparecem por estar usando o hibernate em modo preguiçoso (lazy).
@NoArgsConstructor //Criar construtor vazio.
public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private String nome;
    @OneToMany(cascade = CascadeType.ALL) //OneToMany (Nesse caso, um restaurante tem vários Produtos). CascadeTyple.ALL nesse caso significa se excluir restaurante, exclui tudo.
    private List<Produto> cardapio;
    @Embedded
    private Endereco endereco;


}
