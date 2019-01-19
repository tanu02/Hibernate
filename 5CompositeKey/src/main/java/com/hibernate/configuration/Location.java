package com.hibernate.configuration;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "LOCATION")
public class Location {

	@Embedded
	@EmbeddedId
	@Column(name = "LOCATION_ID")
	LocationId locId;

	public LocationId getLocId() {
		return locId;
	}

	public void setLocId(LocationId locId) {
		this.locId = locId;
	}

}
