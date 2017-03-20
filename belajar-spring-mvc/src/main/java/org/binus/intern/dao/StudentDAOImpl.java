package org.binus.intern.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

import org.binus.intern.dao.StudentDAO;
import org.binus.intern.entity.Mahasiswa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

//@Component
//public class StudentDAOImpl implements StudentDAO {
	
//	@Autowired
//	private JdbcTemplate jdbcTemplateObject;
	
//	private DataSource studentDAO;
	
//	public void setDataSource(DataSource dataSource)
//	{
//		this.ds = dataSource;
//	}

//	public JdbcTemplate getJdbcTemplateObject() {
//		return jdbcTemplateObject;
//	}
//
//	public void setJdbcTemplateObject(JdbcTemplate jdbcTemplateObject) {
//		this.jdbcTemplateObject = jdbcTemplateObject;
//	}

//	@Override
//	public List<Mahasiswa> findAllStudents() {
//		 String readSQL = "SELECT * FROM student";
//		 List <Mahasiswa> students = jdbcTemplateObject.query(readSQL, new StudentDAOMapper());
//		 return students;
//	}

//	@Override
//	public List<Mahasiswa> getAllMahasiswaExcept(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
//	@Autowired
//	private EntityManagerFactory entityManagerFactory;
//	
//	@PersistenceContext
//	private EntityManager entityManager;
//	
//	public void setEntityManagerFactory(EntityManagerFactory emf)
//	{
//		this.entityManagerFactory = emf;
//	}
//	
//	@Override
//	public List<Mahasiswa> findAllStudents() {
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		entityManager.getTransaction().begin();
//		
//		List<Mahasiswa> userList = entityManager.createQuery("from Mahasiswa", Mahasiswa.class).getResultList();
//
//		entityManager.getTransaction().commit();
//		entityManager.close();
//		
//		return userList;
//	}
//	
//	@Override
//	public List<Mahasiswa> findStudentByNIM(String nim) {
//		return entityManager.createQuery("from Mahasiswa m where m.nim=:nim").setParameter("nim", nim).getResultList();
//		//getSingleResult (kalau bukan list)
//	}
//
//	@Override
//	public void insertStudentData(Mahasiswa mahasiswa) {
//		entityManager.persist(mahasiswa);
//	}
//	
//}
