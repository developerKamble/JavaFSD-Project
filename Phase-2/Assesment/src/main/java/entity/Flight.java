package entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FlightDetails")
public class Flight {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="FightId")
	private int fid;
	private String AirlineName;
	@Column(name="DateOpert")
	private Date date;
	private String Source;
	private String Destination;
	private BigDecimal t_price;
	
	public Flight() {
		
	}
	public Flight(int fid, String airlineName, Date date, String source, String destination, BigDecimal t_price) {
		super();
		this.fid = fid;
		AirlineName = airlineName;
		this.date = date;
		Source = source;
		Destination = destination;
		this.t_price = t_price;
	}
	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getAirlineName() {
		return AirlineName;
	}
	public void setAirlineName(String airlineName) {
		AirlineName = airlineName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public BigDecimal getT_price() {
		return t_price;
	}
	public void setT_price(BigDecimal t_price) {
		this.t_price = t_price;
	}
	
}
