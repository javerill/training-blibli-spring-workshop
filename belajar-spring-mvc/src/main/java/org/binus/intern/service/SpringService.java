package org.binus.intern.service;

import java.util.List;

import org.binus.intern.entity.Mahasiswa;

public interface SpringService {

    public List<Mahasiswa> getAllMahasiswaExcept(String nim);
    
    public List<Mahasiswa> getAllMahasiswa();
    
	//public String insertStudentData(Mahasiswa m);
	
	public Mahasiswa getMahasiswaByNIM(String nim);
	
}