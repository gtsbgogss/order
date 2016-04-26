package sanyipos.sdk.model.scala.check;


public class CashierAction {
    public final static int C_BEGIN = 1; // 进入结账
    public final static int C_END = 2;// 结账完成
    public final static int C_USESURCHARGE = 3;// 使用服务费
    public final static int C_UNDOSURCHARGE = 4;// 取消服务费
    public final static int C_USEMINCHARGE = 5;// 使用低消差
    public final static int C_UNDOMINCHARGE = 6;// 取消低消差
    public final static int C_USEDISCOUNT = 7;// 使用折扣
    public final static int C_UNDODISCOUNT = 8;// 取消使用 折扣
    public final static int C_UNDOPAY = 9;// 撤销支付
    public final static int C_PREPRINT = 10;// 预打印
    public final static int C_REPRINT = 20;// 重打
    public final static int C_USEPROMOTION = 21;// 使用促销活动
    public final static int C_UNDOPROMOTION = 22;// 取消促销活动
    public final static int C_USEMEMBER = 23;
    public final static int C_UNDOMEMBER = 24;

    public final static int Z_USECASH = 11; // 现金
    public final static int Z_USECARD = 12; // 银行卡
    public final static int Z_USESTOREVALUE = 13;// 充值卡
    public final static int Z_USEALIPAY = 14;// 支付宝
    public final static int Z_USETENPAY = 15;// 微信
    public final static int Z_USEWAIVE = 16;// 免单
    public final static int Z_USECUSTOM = 17;// 自定义
    public final static int Z_USEVOUCHER = 18; // 有号码代金券
    public final static int Z_USENOSNVOUCHER = 19;// 无号码代金券

    public String getActionById(int action) {
        switch (action) {
            case C_BEGIN:
                return "BeginCashier";
            case C_END:
                return "EndCashier";
            case C_USESURCHARGE:
                return "UseSurcharge";
            case C_UNDOSURCHARGE:
                return "UndoSurcharge";
            case C_USEMINCHARGE:
                return "UseMinCharge";
            case C_UNDOMINCHARGE:
                return "UndoMinCharge";
            case C_USEDISCOUNT:
                return "UseDiscount";
            case C_UNDODISCOUNT:
                return "UndoDiscount";
            case C_UNDOPAY:
                return "UndoPay";
            case Z_USECASH:
                return "UseCash";
            case Z_USECARD:
                return "UseCard";
            case Z_USESTOREVALUE:
                return "UseStoreValue";
            case Z_USEALIPAY:
                return "UseAlipay";
            case Z_USETENPAY:
                return "UseTenpay";
            case Z_USEWAIVE:
                return "UseWaive";
            case Z_USECUSTOM:
                return "UseCustom";
            case C_PREPRINT:
                return "Preprint";
            case C_REPRINT:
                return "Reprint";
            case Z_USEVOUCHER:
                return "UseVoucher";
            case Z_USENOSNVOUCHER:
                return "UseNoSNVoucher";
            case C_USEPROMOTION:
                return "UsePromotion";
            case C_UNDOPROMOTION:
                return "UndoPromotion";
            case C_UNDOMEMBER:
                return "UndoMember";
            case C_USEMEMBER:
                return "UseMember";
            default:
                break;
        }
        return null;

    }

    public CashierAction(int action, long staffId) {
        this.action = getActionById(action);
        this.authStaff = staffId;
    }

    public CashierAction(int action, long staffId, long param) {
        this.action = getActionById(action);
        this.authStaff = staffId;

        switch (action) {
            case Z_USESTOREVALUE:
                this.voucher = param;
                break;
            case C_USEDISCOUNT:
            case C_UNDODISCOUNT:
                this.discount = param;
                break;
        }
    }

    public CashierAction(int action, long staffId, int iParam, long lParam) {
        this.action = getActionById(action);
        this.authStaff = staffId;
        switch (action) {
            case Z_USEVOUCHER:
                this.count = iParam;
                this.voucher = lParam;
            case Z_USENOSNVOUCHER:
                this.count = iParam;
                this.voucherType = lParam;
                break;
            case C_UNDOPAY:
                this.paymentType = iParam;
                this.payment = lParam;
                break;

            default:
                break;
        }

    }

    public CashierAction(int action, long staffId, double value, double change, String transaction) {
        this.action = getActionById(action);
        this.authStaff = staffId;
        this.value = value;
        this.change = change;
        this.transaction = transaction;
    }

    public CashierAction(int action, long staffId, double value, long paymentMode) {
        this.action = getActionById(action);
        this.authStaff = staffId;
        this.value = value;
        this.paymentMode = paymentMode;
    }

    public CashierAction(long promotionId, long memberId, long authStaffId) {
        this.action = getActionById(C_USEPROMOTION);
        this.authStaff = authStaffId;
        this.promotion = promotionId;
        if (memberId != -1)
            this.member = memberId;
    }

    public CashierAction(long promotion_payment_Id, long authStaffId) {
        this.action = getActionById(C_UNDOPROMOTION);
        this.authStaff = authStaffId;
        this.payment = promotion_payment_Id;
    }

    public CashierAction(long member) {
        this.action = getActionById(C_USEMEMBER);
        this.member = member;
        this.authStaff = 1;
    }

    public CashierAction(long staffId, long memberId, double value, String psd) {
        this.action = getActionById(Z_USESTOREVALUE);
        this.member = memberId;
        this.authStaff = staffId;
        this.value = value;
        this.password = psd;
    }

    /**
     * 微信支付
     *
     * @param action
     * @param staffId
     * @param authCode
     * @param value
     */
    public CashierAction(int action, long staffId, String authCode, double value) {
        this.action = getActionById(action);
        this.authCode = authCode;
        this.authStaff = staffId;
        this.value = value;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public long getAuthStaff() {
        return authStaff;
    }

    public void setAuthStaff(long authStaff) {
        this.authStaff = authStaff;
    }

    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getChange() {
        return change;
    }

    public void setChange(Double change) {
        this.change = change;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public Long getPayment() {
        return payment;
    }

    public void setPayment(Long payment) {
        this.payment = payment;
    }

    public long getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(long paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Long getVoucher() {
        return voucher;
    }

    public void setVoucher(Long voucher) {
        this.voucher = voucher;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public long getPromotion() {
        return promotion;
    }

    public void setPromotion(int promotion) {
        this.promotion = promotion;
    }

    public long getMember() {
        return member;
    }

    public void setMember(long member) {
        this.member = member;
    }


    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }


    public String action;

    public long authStaff;

    public Long discount;

    public Double value;

    public Double change;

    public String authCode;

    public Integer paymentType;

    public Long payment;

    public long paymentMode;

    public Long voucher;

    public String transaction;

    public int count;

    public Long voucherType;

    public long promotion;

    public long member;

    public String password;
}
