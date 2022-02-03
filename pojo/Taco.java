package pl.kruchyxe.taco.pojo;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Taco {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @NotNull
    @Size(min=5, message = "Nazwa musi składać się z przynajmniej pięciu znaków.")
    private String name;

    private Date createdAt;

    @ManyToMany
    @Size(min = 1, message = "Musisz wybrać przynajmniej jeden składnik.")
    private List<Ingredient> ingredients;

    @PrePersist
    void createdAt(){
        this.createdAt = new Date();
    }
}

