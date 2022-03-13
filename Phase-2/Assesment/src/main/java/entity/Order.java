package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="OrderDetails")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="OrderId")
	private int oid;
	
	@OneToOne
	@JoinColumn(name="FlightId")
	private Flight fid;
	
	@ManyToOne
	@JoinColumn(name="CustomerId")
	private Customer cid;

	public Order() {
		
	}

	public Order(int oid, Flight fid, Customer cid) {
		super();
		this.oid = oid;
		this.fid = fid;
		this.cid = cid;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public Flight getFid() {
		return fid;
	}

	public void setFid(Flight fid) {
		this.fid = fid;
	}

	public Customer getCid() {
		return cid;
	}

	public void setCid(Customer cid) {
		this.cid = cid;
	}
	
	
}
