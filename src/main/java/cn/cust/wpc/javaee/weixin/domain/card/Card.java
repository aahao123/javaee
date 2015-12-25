package cn.cust.wpc.javaee.weixin.domain.card;

/**
 * Created by wpc on 15/12/25.
 */
public class Card {
    private String card_type;
    private CreateMemberCardJSON member_card;

    public String getCard_type() {
        return card_type;
    }

    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }

    public CreateMemberCardJSON getMember_card() {
        return member_card;
    }

    public void setMember_card(CreateMemberCardJSON member_card) {
        this.member_card = member_card;
    }
}