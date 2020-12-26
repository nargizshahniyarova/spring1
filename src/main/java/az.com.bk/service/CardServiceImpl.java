package az.com.bk.service;


import az.com.bk.dto.CardDto;
import az.com.bk.model.CardModel;
import az.com.bk.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CardServiceImpl implements CardService {
   private final CardRepository cardRepository;

    public CardServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public void save(CardDto cardDto) {
        CardModel cardModel=new CardModel(cardDto);
        cardRepository.save(cardModel);
    }

    @Override
    public CardDto getID(Integer i) {
        CardModel cardModel=cardRepository.getID(i);
        return new CardDto(cardModel);
    }

    @Override
    public List<CardDto> findAll() {
        List<CardModel> cardModels=cardRepository.findAll();
        return cardModels.stream().map(CardDto::new).collect(Collectors.toList());
    }

    @Override
    public void delete(Integer id) {
        cardRepository.delete(id);
    }
}
