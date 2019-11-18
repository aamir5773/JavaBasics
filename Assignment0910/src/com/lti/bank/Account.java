package com.lti.bank;

public class Account {
	
	static String bankName="BOI";
	int accid;
	String accName;
	double balAmt;
	
	@Override
	public String toString() {
		return "Account [bankName=" + bankName + ", accid=" + accid + ", accName=" + accName + ", balAmt=" + balAmt
				+ "]";
	}


	public Account(String bankName, int accid, String accName, double balAmt) {
		super();
		this.accid = accid;
		this.accName = accName;
		this.balAmt = balAmt;
	}




}
