package sanyipos.sdk.model.scala.openTable;


import java.io.Serializable;
import java.util.List;

import sanyipos.sdk.api.bean.TableOrderInfo;
import sanyipos.sdk.model.OrderDetail;

public class OpenTableDetail implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TableOrderInfo info;
	
	public List<OrderDetail> ods;
	
}
