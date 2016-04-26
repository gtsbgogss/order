package sanyipos.sdk.model.rest;


import java.util.Date;

import sanyipos.sdk.utils.ConstantsUtil;

public class StaffRest {

	public Long id;

	public Long shop;

	public String sn;

	public Role role;

	public String name;

	public Double creditUsedMonth;

	public Date birthday;

	public Date workday;

	public String sex;

	public Double salary;

	public Long state;

	public Date createon;

	public String password;

	public String rfid;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRfid() {
		return rfid;
	}

	public void setRfid(String rfid) {
		this.rfid = rfid;
	}

	public Long getShop() {
		return shop;
	}

	public void setShop(Long shop) {
		this.shop = shop;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCreditUsedMonth() {
		return creditUsedMonth;
	}

	public void setCreditUsedMonth(Double creditUsedMonth) {
		this.creditUsedMonth = creditUsedMonth;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getWorkday() {
		return workday;
	}

	public void setWorkday(Date workday) {
		this.workday = workday;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Long getState() {
		return state;
	}

	public void setState(Long state) {
		this.state = state;
	}

	public Date getCreateon() {
		return createon;
	}

	public void setCreateon(Date createon) {
		this.createon = createon;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/////////////////////////////////集合方法/////////////////////////////////
	
	/**
	 * 判断是否有会员权限
	 * @return
	 */
	public boolean hasPermissonOfMember(){
		for(Long permission: role.perms){
			if (permission == ConstantsUtil.PERMISSION_MEMBER_QUERY
					|| permission == ConstantsUtil.PERMISSION_MEMBER_HAND_OUT_CARD
					|| permission == ConstantsUtil.PERMISSION_MEMBER_RECHARGE
					|| permission == ConstantsUtil.PERMISSION_MEMBER_RETURN_CARD
					|| permission == ConstantsUtil.PERMISSION_MEMBER_TRANSFER)
				return true;
		}
		return false;
	}
	
	/**
	 * 是否具有某种权限
	 * @param permission
	 * @return
	 */
	public boolean hasPermissionOf(int permission){
		for(Long p: role.perms){
			if (p == permission)
				return true;
		}
		return false;
	}
	
	/**
	 * 是否具有某种折扣权限
	 * @param discount
	 * @return
	 */
	public boolean hasDiscountPermission(long discount){
		for(Long dis: role.discounts){
			if(dis == discount){
				return true;
			}
		}
		return false;
	}
	
}
