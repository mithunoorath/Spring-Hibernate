package mithun.learn.samples;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.EnableLoadTimeWeaving;

import oracle.sql.CHAR;

@Entity
@Table(name="LOCATIONS", schema="HR")
public class Locations implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name="location_id",unique=true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long locationId;
	@Column(name="street_address")
	private String streetAddress;
	@Column(name="postal_code")
	private String postalCode;
	@Column(name="city")
	private String city;
	@Column(name="state_province")
	private String stateProvince;
	@Column(name="Country_ID")
	private CHAR countryId;
	public Long getLocationId() {
		return locationId;
	}
	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStateProvince() {
		return stateProvince;
	}
	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}
	public CHAR getCountryId() {
		return countryId;
	}
	public void setCountryId(CHAR countryId) {
		this.countryId = countryId;
	}
	
	
	
}
