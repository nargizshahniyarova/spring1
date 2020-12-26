package az.com.bk.service;

import az.com.bk.dto.CardDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CardService {
    void save(CardDto cardDto);

    CardDto getID(Integer id);
    List<CardDto> findAll();

    void delete(Integer id);
}
