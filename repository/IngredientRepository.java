package pl.kruchyxe.taco.repository;

import org.springframework.data.repository.CrudRepository;
import pl.kruchyxe.taco.model.Ingredient;

public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {

}
