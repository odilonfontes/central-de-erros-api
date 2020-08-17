package br.com.odilonfontes.errorcenterapi.repository;

import br.com.odilonfontes.errorcenterapi.domain.Event;
import br.com.odilonfontes.errorcenterapi.domain.enumeration.EventLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    Optional<Event> findByDescriptionAndSourceAndEventDateAndLevel(String description,
                                                                   String source,
                                                                   LocalDate eventDate,
                                                                   EventLevel level);

}
