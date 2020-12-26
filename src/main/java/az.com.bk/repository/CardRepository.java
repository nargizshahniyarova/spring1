package az.com.bk.repository;

import az.com.bk.model.CardModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository {
    void save(CardModel cardModel);

    CardModel getID(int i);

    List<CardModel> findAll();

    void delete(Integer id);
}
