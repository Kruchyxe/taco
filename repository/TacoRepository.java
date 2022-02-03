package pl.kruchyxe.taco.repository;

import org.springframework.data.repository.CrudRepository;
import pl.kruchyxe.taco.pojo.Taco;

public interface TacoRepository
        extends CrudRepository<Taco, Long> {

}
