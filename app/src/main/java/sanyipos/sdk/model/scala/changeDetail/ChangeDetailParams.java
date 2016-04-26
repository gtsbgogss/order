package sanyipos.sdk.model.scala.changeDetail;

import java.util.ArrayList;
import java.util.List;

public class ChangeDetailParams {

	public List<ChangeDetailAction> details = new ArrayList<ChangeDetailAction>();

	public List<ChangeDetailAction> getDetails() {
		return details;
	}

	public void setDetails(List<ChangeDetailAction> details) {
		this.details = details;
	}

}
