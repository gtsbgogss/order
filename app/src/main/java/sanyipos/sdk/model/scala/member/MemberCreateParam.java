package sanyipos.sdk.model.scala.member;

/**
 * 会员创建参数
 */
public class MemberCreateParam {

    // 会员类型
    private Long member_type_id;
    // 姓名
    private String name;
    // 性别
    private String sex;
    // 证件类型
    private Long id_type;
    // 证件号
    private String id_no;

    // 生日
    private String birthday;
    // 手机号
    private String mobile;
    //
    private String ali;
    // 邮箱
    private String email;
    // 创建者
    private Long sale_staff;
    // 会员卡
    private CreateMemberCard card;
    //
    private int point = 0;

    private long creator;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public long getCreator() {
        return creator;
    }


    public void setCreator(long creator) {
        this.creator = creator;
    }


    public Long getMember_type_id() {
        return member_type_id;
    }


    public void setMember_type_id(Long member_type_id) {
        this.member_type_id = member_type_id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getSex() {
        return sex;
    }


    public void setSex(String sex) {
        this.sex = sex;
    }

    public Long getId_type() {
        return id_type;
    }


    public void setId_type(Long id_type) {
        this.id_type = id_type;
    }


    public String getId_no() {
        return id_no;
    }


    public void setId_no(String id_no) {
        this.id_no = id_no;
    }

    public String getBirthday() {
        return birthday;
    }


    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getMobile() {
        return mobile;
    }


    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAli() {
        return ali;
    }


    public void setAli(String ali) {
        this.ali = ali;
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public Long getSale_staff() {
        return sale_staff;
    }


    public void setSale_staff(Long sale_staff) {
        this.sale_staff = sale_staff;
    }

    public CreateMemberCard getCard() {
        return card;
    }


    public void setCard(CreateMemberCard card) {
        this.card = card;
    }

    public int getPoint() {
        return point;
    }


    public void setPoint(int point) {
        this.point = point;
    }

    public static class CreateMemberCard {
        // 卡号
        private String card_no;

        private String rfid;

        public String getCard_no() {
            return card_no;
        }

        public void setCard_no(String card_no) {
            this.card_no = card_no;
        }

        public String getRfid() {
            return rfid;
        }

        public void setRfid(String rfid) {
            this.rfid = rfid;
        }


    }
}
