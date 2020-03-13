package com.hibernate.one_many;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "STOCK")
public class Stock {
	// AUTO, IDENTITY, TABLE, SEQUENCE
	@GeneratedValue
	@Id
	@Column(name = "stock_id")
	private int sid;

	@Column(name = "name")
	private String sname;

	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "market_id")
	private Market market;

	public Stock(String sname) {
		this.sname = sname;
	}

	public Stock(String sname, Market market) {
		this.sname = sname;
		this.market = market;
	}

	public Stock(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}

	public int getsId() {
		return sid;
	}

	public void setsId(int sid) {
		this.sid = sid;
	}

	public String getsName() {
		return sname;
	}

	public void setsName(String sname) {
		this.sname = sname;
	}

	public Market getMarket() {
		return market;
	}

	public void setMarket(Market market) {
		this.market = market;
	}

	public String toString() {
		return sid + " - " + sname;
	}
}