package sanyipos.sdk.api;

import java.io.Serializable;

/**
 * 注册信息 存储到SharePreference中
 * 
 * @author admin
 * 
 */
public class RegisteData implements Serializable {


	public RegisteData() {

	}

	private String salt;
	private int deviceId;
	private int shopId;
	private String accessCode;
	private boolean isMaster;
	private boolean deviceRegistered;
	private String posName;
	private long printerId;

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getAccessCode() {
		return accessCode;
	}

	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}

	public boolean isMaster() {
		return isMaster;
	}

	public void setMaster(boolean isMaster) {
		this.isMaster = isMaster;
	}

	public boolean isDeviceRegistered() {
		return deviceRegistered;
	}

	public void setDeviceRegistered(boolean deviceRegistered) {
		this.deviceRegistered = deviceRegistered;
	}

	public String getPosName() {
		return posName;
	}

	public void setPosName(String posName) {
		this.posName = posName;
	}

	public long getPrinterId() {
		return printerId;
	}

	public void setPrinterId(long printerId) {
		this.printerId = printerId;
	}

}
