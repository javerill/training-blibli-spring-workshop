package org.binus.intern.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.binus.intern.dao.StudentDAO;
import org.binus.intern.entity.Mahasiswa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SpringServiceImpl implements SpringService {
	
//	private static final List<Mahasiswa> MAHASISWAS = new ArrayList<>();
    
    @Autowired
    private StudentDAO studentDAO;
    
	public StudentDAO getStudentDAO() {
		return studentDAO;
	}

	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	public SpringServiceImpl()
    {
//        MAHASISWAS.add(new Mahasiswa("1801448524", 10, "Jevon"));
//        MAHASISWAS.add(new Mahasiswa("1801413716", 12, "Kevin"));
//        MAHASISWAS.add(new Mahasiswa("1801408792", 14, "Ivan"));
    }

//    @Override
//    public List<Mahasiswa> getAllMahasiswaExcept(String nim) {
//		List<Mahasiswa> result = new ArrayList<>();	

//		for(Mahasiswa mahasiswa : MAHASISWAS)
//		for(Mahasiswa mahasiswa : getStudentDAO().getAllMahasiswaExcept(nim))
//		for(Mahasiswa mahasiswa : studentDAO.findAllStudents())
//        {
//            if(!mahasiswa.getNim().equals(nim))
//            {
//                result.add(mahasiswa);
//            }
//        }
//        
//      return result;
//    }
    
    @Override
	public List<Mahasiswa> getAllMahasiswaExcept(String nim) {
		//List<Mahasiswa> result = new ArrayList<>();
		List<Mahasiswa> result = studentDAO.findAll();
		//for (Mahasiswa mahasiswa : studentDAO.findAllStudents())
		for (Mahasiswa mahasiswa : result)
		{
			if (!mahasiswa.getNim().equals(nim)) 
			{
				result.add(mahasiswa);
			}
		}
		
		return result;
	}

	@Override
	public List<Mahasiswa> getAllMahasiswa() {
//		List<Mahasiswa> result = new ArrayList<>();
		List<Mahasiswa> result = studentDAO.findAll(); //fungsi bawaan JPA
//		for (Mahasiswa mahasiswa : studentDAO.findAllStudents()) 
//		{
//				result.add(mahasiswa);
//		}
		
		return result;
	}

//	@Override
//	public String insertStudentData(Mahasiswa mahasiswa) {
//		studentDAO.insertStudentData(mahasiswa);
//		
//		return "Insert Student Data Success!";
//	}

	@Override
	public Mahasiswa getMahasiswaByNIM(String nim) {
		Mahasiswa result = studentDAO.findOne(nim); //fungsi bawaan JPA
		
		return result;
	}
    
}
