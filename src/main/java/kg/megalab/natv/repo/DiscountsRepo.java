package kg.megalab.natv.repo;

import kg.megalab.natv.models.entity.Discounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiscountsRepo extends JpaRepository<Discounts, Long> {
    @Query(value = "select * from discounts where current_date between start_date and end_date order by min_days", nativeQuery = true )
    List<Discounts> allActiveChannelDiscounts(Long id);

    @Query(value = "select * from discounts d where d.min_days = (select MAX(min_days) from discounts d where d.min_days <= ?1) and current_timestamp between start_date and end_date and d.id_channels = ?2", nativeQuery = true)
    Discounts findByChannelAndMinDays(int days, Long id);
}
