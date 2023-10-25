import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable { // Serializable é necessário para que o objeto possa ser serializado,
    // serializar é o processo de transformar um objeto em uma sequência de bytes para que ele possa ser gravado em um arquivo, passado pela rede e etc.

    // JPA é uma especificação, Hibernate é uma implementação da especificação JPA
    // Hibernate é um framework ORM (Object Relational Mapping), ou seja, ele mapeia objetos para o banco de dados
    // ORM é uma técnica de programação que mapeia objetos para tabelas de banco de dados

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo", nullable = false)
    private BigInteger id;

    @Column (name = "nome", nullable = false, length = 255)
    private String nome;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}