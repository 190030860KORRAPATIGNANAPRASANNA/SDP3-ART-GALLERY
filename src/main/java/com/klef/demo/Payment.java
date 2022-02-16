package com.klef.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name="payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	@Column(nullable=false, length=50)
	  private String CardholderName;
	@Column(nullable=false, length=16)
	  private Long CardNumber;
	@Column(nullable=false, length=16)
	  private String CardType;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCardholderName() {
		return CardholderName;
	}
	public void setCardholderName(String cardholderName) {
		CardholderName = cardholderName;
	}
	public Long getCardNumber() {
		return CardNumber;
	}
	public void setCardNumber(Long cardNumber) {
		CardNumber = cardNumber;
	}
	public String getCardType() {
		return CardType;
	}
	public void setCardType(String cardType) {
		CardType = cardType;
	}
	public String getExpiry() {
		return Expiry;
	}
	public void setExpiry(String expiry) {
		Expiry = expiry;
	}
	public String getCVV() {
		return CVV;
	}
	public void setCVV(String cVV) {
		CVV = cVV;
	}
	@Column(nullable=false, length=16)
	  private String Expiry;
	@Column(nullable=false, length=16)
	  private String CVV;






}
