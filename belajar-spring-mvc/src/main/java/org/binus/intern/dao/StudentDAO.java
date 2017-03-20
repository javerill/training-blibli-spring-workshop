package org.binus.intern.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.binus.intern.entity.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

// @Repository dan @Transaction ketika tidak menggunakan jbdcTemplate, tetapi menggunakan SpringDataJPA (ORM - Hibernate Concept)
@Repository
@Transactional
//<entity, tipe data primary key>
public interface StudentDAO extends JpaRepository<Mahasiswa, String> {
	
	//public List<Mahasiswa> getAllMahasiswaExcept(String string);
	
	//@Query("SELECT ...") //custom Query
	//public List<Mahasiswa> findAllStudents();
	
	//public List<Mahasiswa> findStudentByNIM(String nim);
	
	//public void insertStudentData(Mahasiswa mahasiswa);
}
