package pl.kruchyxe.taco.repository;

import org.springframework.data.repository.CrudRepository;
import pl.kruchyxe.taco.pojo.Order;

public interface OrderRepository
        extends CrudRepository<Order, Long> {
}
