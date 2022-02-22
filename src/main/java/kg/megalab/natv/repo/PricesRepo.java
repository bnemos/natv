package kg.megalab.natv.repo;

import kg.megalab.natv.models.entity.Prices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PricesRepo extends JpaRepository<Prices, Long> {
}
