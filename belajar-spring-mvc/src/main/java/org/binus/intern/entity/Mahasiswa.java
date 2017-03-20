package org.binus.intern.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Mahasiswa")
public class Mahasiswa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="nim")
	String nim;	
	
	@Column(name="age")
	int age;
	
	@Column(name="name")
	String name;	
	
	// Default Constructor
	public Mahasiswa() {
		// super();
	}
	
	// untuk JUnitTest
	public Mahasiswa(String nim, Integer age, String name) {
		// super();
		this.nim = nim;
		this.age = age;
		this.name = name;
	}	
	
//	private String nim;
//	private Integer age;
//	private String name;
	
	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nim == null) ? 0 : nim.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mahasiswa other = (Mahasiswa) obj;
		if (nim == null) {
			if (other.nim != null)
				return false;
		} else if (!nim.equals(other.nim))
			return false;
		return true;
	}

}