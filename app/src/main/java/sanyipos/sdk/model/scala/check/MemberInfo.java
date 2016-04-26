package sanyipos.sdk.model.scala.check;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * 会员信息实体
 *
 * @author ming.cheng
 * @date 2015/06/10
 */
public class MemberInfo implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @SerializedName("id")
    public int id;

    @SerializedName("sn")
    public String sn;

    @SerializedName("name")
    public String name;

    @SerializedName("memberType")
    public int memberType;

    @SerializedName("memberTypeName")
    public String memberTypeName;

    @SerializedName("mobile")
    public String mobile;

    @SerializedName("balance")
    public double balance;

    @SerializedName("gift")
    public double gift;

    @SerializedName("card")
    public String card;

    @SerializedName("point")
    public Long point;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemberType() {
        return memberType;
    }

    public void setMemberType(int memberType) {
        this.memberType = memberType;
    }

    public String getMemberTypeName() {
        return memberTypeName;
    }

    public void setMemberTypeName(String memberTypeName) {
        this.memberTypeName = memberTypeName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getGift() {
        return gift;
    }

    public void setGift(double gift) {
        this.gift = gift;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

}
