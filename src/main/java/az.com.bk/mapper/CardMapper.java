package az.com.bk.mapper;

import az.com.bk.model.CardModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CardMapper implements RowMapper<CardModel> {

    @Override
    public CardModel mapRow(ResultSet resultSet, int i) throws SQLException {
        System.out.println(resultSet);
        return new CardModel(resultSet.getInt(1),resultSet.getString(2),resultSet.getInt(3),resultSet.getString(5),resultSet.getString(6),resultSet.getInt(4));
    }
}
