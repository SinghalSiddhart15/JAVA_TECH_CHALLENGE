package com.siddhart.domain;

public class ReturnSuccess {

	
	private boolean success;
	private String accountIdentifier;
	
		public ReturnSuccess() {
			super();
		}
		
		public ReturnSuccess(boolean success, String accountIdentifier)
		{
			super();
			this.success = success;
			this.accountIdentifier = accountIdentifier;	
		}
	
		public boolean isSuccess() {
			return success;
		}
		public void setSuccess(boolean success) {
			this.success = success;
		}
		public String getAccountIdentifier() {
			return accountIdentifier;
		}
		public void setAccountIdentifier(String accountIdentifier) {
			this.accountIdentifier = accountIdentifier;
		}
		
}
