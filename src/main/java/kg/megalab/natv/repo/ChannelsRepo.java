package kg.megalab.natv.repo;

import kg.megalab.natv.models.entity.Channels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelsRepo extends JpaRepository<Channels, Long> {

}
