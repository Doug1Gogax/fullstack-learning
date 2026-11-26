package https.github.java.Doug1Gogax.fullstack_learning_journey.dominio.cartao.model;

import java.time.LocalDateTime;
import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Generatedvalue;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table (name= "cartao")
@Getter
@Setter
public abstract class CartaoEntity {

    @Id
    @Generatedvalue (stratege = GenerationType.UUID)
    @Column
    private UUID id;

    @Column(name="nome", nullable = false, length = 30)
    private String nome;

    @Column(name = "bandeira")
    @Enumerated(EnumType.STRING)
    private BandeiraCartao bandeira;

    @Column(name = "data_cadastro")
    private LocalDateTime dataCadastro;

}
