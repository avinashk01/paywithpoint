package com.barclaysbank.rewards.resource.beans;

import org.springframework.stereotype.Component;

@Component("reso_bal_req")
public class Resource_BalanceReq {
	private Resource_ServiceDtls svcDtls;
	private Resource_RequestHeader clientContext;
	private Resource_CustomerContext custContext;
	public Resource_ServiceDtls getSvcDtls() {
		return svcDtls;
	}
	public void setSvcDtls(Resource_ServiceDtls svcDtls) {
		this.svcDtls = svcDtls;
	}
	public Resource_RequestHeader getClientContext() {
		return clientContext;
	}
	public void setClientContext(Resource_RequestHeader clientContext) {
		this.clientContext = clientContext;
	}
	public Resource_CustomerContext getCustContext() {
		return custContext;
	}
	public void setCustContext(Resource_CustomerContext custContext) {
		this.custContext = custContext;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Resource_BalanceReq [svcDtls=");
		builder.append(svcDtls);
		builder.append(", clientContext=");
		builder.append(clientContext);
		builder.append(", custContext=");
		builder.append(custContext);
		builder.append("]");
		return builder.toString();
	}
			
}
