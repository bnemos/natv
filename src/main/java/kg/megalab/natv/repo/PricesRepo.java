package kg.megalab.natv.repo;

import kg.megalab.natv.models.entity.Prices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PricesRepo extends JpaRepository<Prices, Long> {
    @Query(value = "select * from prices p where p.id_channels = ?1", nativeQuery = true)
    Prices findByChannelsAndId(Long id);

}
