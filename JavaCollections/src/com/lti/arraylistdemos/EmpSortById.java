package com.lti.arraylistdemos;

import java.util.Comparator;

public class EmpSortById implements Comparator<Employee>{

	@Override
    public int compare(Employee e1, Employee e2) 
    {
        if(e1.getEmpid()< e2.getEmpid()){
            return 1;
        } else {
            return -1;
        }
    }
}
