package org.binus.intern.controller;

import java.util.ArrayList;
import java.util.List;

//import org.binus.intern.dao.StudentDAO;
import org.binus.intern.dto.HelloWorldDTO;
import org.binus.intern.entity.Mahasiswa;
import org.binus.intern.service.SpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	
	private static final String PREFIX = "/hello";
	
//	//ini jangan dipake
//	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
//	StudentDAO studentDAO = (StudentDAO) context.getBean("studentDAO");
//	//dilarang
	
//	@Autowired	
//	private StudentDAO studentDAO;
	
	@Autowired
	private SpringService springService;
	
//	@ResponseBody
//	@RequestMapping(path = PREFIX + "/say-something", method = RequestMethod.GET, 
//	produces = {"application/json;charset=UTF-8"})
//	public List<HelloWorldDTO> sayHello(@RequestParam("nim") String nim) {
		
		//List<HelloWorldDTO> listDTO = new ArrayList<HelloWorldDTO>();
		
		// INSERT
        // Mahasiswa mahasiswa = new Mahasiswa("1801413716", 30, "Kevin");
        // studentDAO.insert(mahasiswa);
		
		// List<Mahasiswa> listStudent = studentDAO.findAllStudents();
//		List<Mahasiswa> listStudent = springService.getAllMahasiswaExcept(nim); //studentDAO.findAllStudents();
//        
//        for (Mahasiswa mhs : listStudent)
//        {
//        	HelloWorldDTO mhsDTO = new HelloWorldDTO();
//        	mhsDTO.setTitle(mhs.getNim() + " - " + mhs.getAge() + " - " + mhs.getName());
//        	listDTO.add(mhsDTO);
//        }
//        
//        return listDTO;
		
		// HelloWorldDTO dto = new HelloWorldDTO();
		
		//for (Mahasiswa mahasiswa : service.getAllMahasiswaExcept("1801413716")) {
			//System.out.println("Hello, " + mahasiswa.getName() + "!"); 
			//dto.setTitle("Hello, " + mahasiswa.getName() + "!");
		//}
		
		//return dto;
	//}
	
//	@ResponseBody
//	@RequestMapping(path = PREFIX + "/getAllStudents", method = RequestMethod.GET, 
//	produces = {"application/json;charset=UTF-8"})
//	public List<HelloWorldDTO> getAllStudents() {
//		List<HelloWorldDTO> listDTO = new ArrayList<HelloWorldDTO>();
//		
//		List<Mahasiswa> listOfStudents = new ArrayList<Mahasiswa>();
//		listOfStudents = springService.getAllMahasiswa();
//
//		for (Mahasiswa mhs : listOfStudents)
//		{
//			HelloWorldDTO mhsDTO = new HelloWorldDTO();
//			mhsDTO.setTitle(mhs.getNim() + " - " + mhs.getAge() + " - " + mhs.getName());
//			listDTO.add(mhsDTO);
//		}
//		
//		return listDTO;
//	}
	
//	@ResponseBody
//	@RequestMapping(path = PREFIX + "/insertStudent", method = RequestMethod.GET )
//	public String insertMhs(@RequestParam("nim") String nim, @RequestParam("age") String age, @RequestParam("name") String name) {
//		Mahasiswa mhs = new Mahasiswa(nim, Integer.parseInt(age), name);
//		
//		return springService.insertStudentData(mhs);
//	}
	
//	@ResponseBody
//	@RequestMapping(path = PREFIX + "/getAllStudentsWithJPA", method = RequestMethod.GET, 
//	produces = {"application/json;charset=UTF-8"})
//	public List<HelloWorldDTO> getAllStudents() {
//		List<HelloWorldDTO> listDTO = new ArrayList<HelloWorldDTO>();
//		
//		List<Mahasiswa> listOfStudents = springService.getAllMahasiswa();
//		
//		for (Mahasiswa mhs : listOfStudents)
//		{
//			HelloWorldDTO mhsDTO = new HelloWorldDTO();
//			mhsDTO.setTitle(mhs.getNim() + " - " + mhs.getAge() + " - " + mhs.getName());
//			listDTO.add(mhsDTO);
//		}
//		
//		return listDTO;
//	}
	
	@ResponseBody
	@RequestMapping(path = PREFIX + "/getStudentWithJPAByNIM", method = RequestMethod.GET, 
	produces = {"application/json;charset=UTF-8"})
	public HelloWorldDTO getStudentWithJPAByNIM(@RequestParam("nim") String nim) {
		
		HelloWorldDTO mhsDTO = new HelloWorldDTO();
		
		Mahasiswa mhs = springService.getMahasiswaByNIM(nim);
		
		mhsDTO.setTitle(mhs.getNim() + " - " + mhs.getAge() + " - " + mhs.getName());
		
		return mhsDTO;
	}

}