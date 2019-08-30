package web;

import java.io.Serializable;

public class LogicBean implements Serializable{

	public ResultBean execute(String name,int year,int month,int date) {
         int len = name.length();

         int money = (len*year*month*date)%5+1;
         int love = (len+year)*month*date%5+1;
         int work =(len+year+month)*date%5+1;
		 int health =(len+year+month+date)%5+1;
	     int total = (int)(money+love+work+health)/4;

	     ResultBean bean = new ResultBean();
	     String[]str= {"","★","★★","★★★","★★★★","★★★★★"};
	     bean.setMoney(str [money]);
	     bean.setLove(str [love]);
	     bean.setWork(str [work]);
	     bean.setHealth(str [health]);
	     bean.setTotal(str [total]);

	     return bean;
	}
}
