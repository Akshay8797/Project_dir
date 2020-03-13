package com.hibernate.one_many;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MARKET")
public class Market {
	// AUTO, IDENTITY, TABLE, SEQUENCE
	@GeneratedValue
	@Id
	@Column(name = "market_id")
	private int mid;

	@Column(name = "name")
	private String mname;

	@OneToMany(cascade = { CascadeType.PERSIST }, fetch = FetchType.EAGER, mappedBy = "market")
	private Set<Stock> stock;

	public Market(String mname) {
		this.mname = mname;
	}

	public Market(int mid, String mname) {
		this.mname = mname;
	}

	public int getmId() {
		return mid;
	}

	public void seteId(int mid) {
		this.mid = mid;
	}

	public String getmName() {
		return mname;
	}

	public void setmName(String mname) {
		this.mname = mname;
	}

	public Set<Stock> getStock() {
		return stock;
	}

	public void setStock(Set<Stock> stock) {
		this.stock = stock;
	}

	public String toString() {
		return mid + " - " + mname;
	}
}
