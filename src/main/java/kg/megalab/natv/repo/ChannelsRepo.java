package kg.megalab.natv.repo;

import kg.megalab.natv.models.dto.ChannelsDto;
import kg.megalab.natv.models.entity.Channels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelsRepo extends JpaRepository<Channels, Long> {
    @Query(value = "select * from channel c where c.id = ?1 and active = true ", nativeQuery = true)
    Channels findByActiveAndId(Long id);
}
