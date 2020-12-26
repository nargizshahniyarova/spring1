package az.com.bk.repository;

import az.com.bk.mapper.CardMapper;
import az.com.bk.model.CardModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class CardRepositoryImpl implements CardRepository {
    @Autowired
    private DataSource dataSource;

    @Override
    public void save(CardModel cardModel) {
        JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
        jdbcTemplate.update("insert  into card_info (pan,mbr,currency,uid,account) values(?,?,?,?,?)",new Object[]{cardModel.getPan(),cardModel.getMba(),cardModel.getCurrency(),cardModel.getUid() ,cardModel.getAccount()});
        System.out.println("save");
    }

    @Override
    public CardModel getID(int i) {
        JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
        return jdbcTemplate.queryForObject("select id,pan,mbr,currency,uid,account from card_info where  id=?",new Object[]{i},new CardMapper());
    }

    @Override
    public List<CardModel> findAll() {
        JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
        return jdbcTemplate.query("select id,pan,mbr,currency,uid,account from card_info",new CardMapper());

    }

    @Override
    public void delete(Integer id) {
        JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
        jdbcTemplate.update("delete from card_info where  id=?",new Object[]{id});
    }
}
