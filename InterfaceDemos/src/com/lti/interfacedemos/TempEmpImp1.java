package com.lti.interfacedemos;

public class TempEmpImp1 implements IPerson {

	int tempid;
	double salPerDay;
	int noDays;
	
	@Override
	public void calc() {
		double tsal= salPerDay*noDays;
		System.out.println("Temp Employee Total sal \t" + tsal);
	}

	public int getTempid() {
		return tempid;
	}

	public void setTempid(int tempid) {
		this.tempid = tempid;
	}

	public double getSalPerDay() {
		return salPerDay;
	}

	public void setSalPerDay(double salPerDay) {
		this.salPerDay = salPerDay;
	}

	public int getNoDays() {
		return noDays;
	}

	public void setNoDays(int noDays) {
		this.noDays = noDays;
	}

	@Override
	public String toString() {
		return "TempEmpImp1 [tempid=" + tempid + ", salPerDay=" + salPerDay + ", noDays=" + noDays + "]";
	}
	
	

	
}
