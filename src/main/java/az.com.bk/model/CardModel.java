package az.com.bk.model;

import az.com.bk.dto.CardDto;

public class CardModel {
    private Integer id;
    private String pan;
    private Integer mba;
    private String uid;
    private String account;
    private Integer currency;

    public CardModel(Integer id,String pan, Integer mba, String uid, String account, Integer currency) {
        this.id=id;
        this.pan = pan;
        this.mba = mba;
        this.uid = uid;
        this.account = account;
        this.currency = currency;
    }

    public CardModel(CardDto cardDto) {
        this.id=cardDto.getId();
        this.pan = cardDto.getPan();
        this.mba = cardDto.getMba();
        this.uid = cardDto.getUid();
        this.account = cardDto.getAccount();
        this.currency = cardDto.getCurrency();
    }


    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public Integer getMba() {
        return mba;
    }

    public void setMba(Integer mba) {
        this.mba = mba;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Integer getCurrency() {
        return currency;
    }

    public void setCurrency(Integer currency) {
        this.currency = currency;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CardModel{" +
                "id=" + id +
                ", pan='" + pan + '\'' +
                ", mba='" + mba + '\'' +
                ", uid='" + uid + '\'' +
                ", account='" + account + '\'' +
                ", currency=" + currency +
                '}';
    }
}
