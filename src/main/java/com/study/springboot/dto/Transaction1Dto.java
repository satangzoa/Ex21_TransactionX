package com.study.springboot.dto;

import lombok.Data;

@Data
public class Transaction1Dto {
    private String consumerId;
    private int amount;
    
    public Transaction1Dto() {}
	public Transaction1Dto(String consumerId, int amount) {
		super();
		this.consumerId = consumerId;
		this.amount = amount;
	}
	public String getConsumerId() {
		return consumerId;
	}
	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
    
    
}
