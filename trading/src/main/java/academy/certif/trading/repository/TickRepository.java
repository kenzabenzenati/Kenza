package academy.certif.trading.repository;

import academy.certif.trading.domain.Tick;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TickRepository extends JpaRepository<Tick, Long> {
}
