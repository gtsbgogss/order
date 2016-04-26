package sanyipos.sdk.model;

public interface PaymentWrapper {

	public Long getPaymentId() ;
	
	public String getPayMentStaffId() ;

	public int getPaymentType() ;

	public String getPaymentAmount() ;

	public String getPaymentChange() ;

	public String getPaymentReceipt() ;
	

	public int getRowNo() ;

	public void setRowNo(int rowNo) ;
	
	public Double getValue();

	public String getSn();

	public Long getCustomPaymentType();
	
	public Long getVoucherTypeId();
}
