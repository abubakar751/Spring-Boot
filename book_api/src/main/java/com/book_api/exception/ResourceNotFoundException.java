package com.book_api.exception;

public class ResourceNotFoundException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	String failmassage;
	String massagecode;
	long fieldvalue;
	public String getFailmassage() {
		return failmassage;
	}
	public void setFailmassage(String failmassage) {
		this.failmassage = failmassage;
	}
	public String getMassagecode() {
		return massagecode;
	}
	public void setMassagecode(String massagecode) {
		this.massagecode = massagecode;
	}
	public long getFieldvalue() {
		return fieldvalue;
	}
	public void setFieldvalue(long fieldvalue) {
		this.fieldvalue = fieldvalue;
	}
	public ResourceNotFoundException(String failmassage,long fieldvalue, String massagecode) {
		super(String.format(failmassage, massagecode, fieldvalue));
		this.failmassage = failmassage;
		this.massagecode = massagecode;
		this.fieldvalue = fieldvalue;
	}
	

}