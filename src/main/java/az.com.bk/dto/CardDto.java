package az.com.bk.dto;

import az.com.bk.model.CardModel;

public class CardDto {
    private  Integer id;
    private String pan;
    private Integer mba;
    private String uid;
    private String account;
    private Integer currency;

    public CardDto(CardModel cardModel) {
        if(cardModel!=null){
        this.id=cardModel.getId();
        this.pan = cardModel.getPan();
        this.mba = cardModel.getMba();
        this.uid = cardModel.getUid();
        this.account = cardModel.getAccount();
        this.currency = cardModel.getCurrency();
        }
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
        return "CardDto{" +
                "id=" + id +
                ", pan='" + pan + '\'' +
                ", mba='" + mba + '\'' +
                ", uid='" + uid + '\'' +
                ", account='" + account + '\'' +
                ", currency=" + currency +
                '}';
    }
}
