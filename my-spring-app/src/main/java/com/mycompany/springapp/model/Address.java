package com.mycompany.springapp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Address {
	
	private static final long serialVersionUID = -1308795024262635690L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String firstLine;

	@Column
	private String lastLine;
	
	/*private Person person;
	
	@OneToOne(cascade = CascadeType.ALL, 
             fetch = FetchType.LAZY)
    @JoinColumn(name="person_id")
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}*/

	public Address() {
	}

	public Address(String firstLine, String lastLine) {
		super();
		this.firstLine = firstLine;
		this.lastLine = lastLine;
	}	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstLine() {
		return firstLine;
	}

	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}

	public String getLastLine() {
		return lastLine;
	}

	public void setLastLine(String lastLine) {
		this.lastLine = lastLine;
	}

	@Override
	public String toString() {

		return super.toString() + " Line = " + firstLine + " " + lastLine
				+ " id = " + id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstLine == null) ? 0 : firstLine.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((lastLine == null) ? 0 : lastLine.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (firstLine == null) {
			if (other.firstLine != null)
				return false;
		} else if (!firstLine.equals(other.firstLine))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastLine == null) {
			if (other.lastLine != null)
				return false;
		} else if (!lastLine.equals(other.lastLine))
			return false;
		return true;
	}

}
