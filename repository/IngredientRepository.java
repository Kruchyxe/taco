package pl.kruchyxe.taco.repository;

import org.springframework.data.repository.CrudRepository;
import pl.kruchyxe.taco.pojo.Ingredient;

public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {

}
