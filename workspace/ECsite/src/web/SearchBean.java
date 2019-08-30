package web;

import java.io.Serializable;

public class SearchBean implements Serializable {

	private String name = null;
	private String price = null;

	public String getMoney() {
		 return name;
	  }

	  public void setMoney(String name) {
	   this.name = name ;
	  }

	  public String getLove() {
		 return price;
	  }

	  public void setLove(String love) {
		  this.price = love;
	  }
}
