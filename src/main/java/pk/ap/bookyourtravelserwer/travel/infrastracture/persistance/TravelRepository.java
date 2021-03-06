package pk.ap.bookyourtravelserwer.travel.infrastracture.persistance;

import pk.ap.bookyourtravelserwer.travel.domain.Ticket;
import pk.ap.bookyourtravelserwer.travel.domain.Travel;
import pk.ap.bookyourtravelserwer.travel.domain.dto.SearchConnectionDto;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

public interface TravelRepository {
    List<Travel> searchTravel(SearchConnectionDto searchConnectionDto) throws ParseException;

    Optional<Travel> getById(Long id);

}
