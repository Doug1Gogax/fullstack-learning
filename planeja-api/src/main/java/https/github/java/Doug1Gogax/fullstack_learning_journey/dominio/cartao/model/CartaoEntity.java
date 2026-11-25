package https.github.java.Doug1Gogax.fullstack_learning_journey.dominio.cartao.model;

import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Generatedvalue;

@Entity
@Table (name= "cartao")
public abstract class CartaoEntity {

    @Id
    @Generatedvalue (stratege = GenerationType.UUID)
    private UUID id;
    @Column 
    
    @Column(name="nome", nullable = false, length = 30)
    private String nome;

}
