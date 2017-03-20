package org.binus.intern.controller;

//import static org.hamcrest.CoreMatchers.*;
//import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
//
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.verifyNoMoreInteractions;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.binus.intern.dao.StudentDAO;
//import org.binus.intern.dto.HelloWorldDTO;
//import org.binus.intern.entity.Mahasiswa;
//import org.binus.intern.service.SpringService;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;

//@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
//@ContextConfiguration
//(
//  {
//      "classpath*:src/main/webapp/WEB-INF/springmvc-context.xml"
//  }
//)
//@ContextConfiguration(classes = MyWebConfig.class)
public class HelloWorldControllerTest {
	
//	@Mock
//	private SpringService springService;
//	
//	@InjectMocks
//	private HelloWorldController helloWorldController;
// 
//	private MockMvc mockMvc;
// 
//	@Before
//	public void init() {
//		MockitoAnnotations.initMocks(this);
//		mockMvc = MockMvcBuilders.standaloneSetup(helloWorldController).build();
//	}
//        
//    @Test
//    public void testHelloWorld() throws Exception {
//    	
//    	//di layer service itu di test
//    	
//    	//maka yang di mock itu servicenya
//
//    	List<Mahasiswa> students = new ArrayList<Mahasiswa>();
//    	students.add(new Mahasiswa("1801413716", 20, "Kevin"));
//    	students.add(new Mahasiswa("1801448524", 19, "Jevon"));
//    	
//    	List<HelloWorldDTO> listDTO = new ArrayList<HelloWorldDTO>();
//        	 
//    	for (Mahasiswa mhs : students)
//    	{
//    		HelloWorldDTO mhsDTO = new HelloWorldDTO();
//    		mhsDTO.setTitle(mhs.getNim() + " - " + mhs.getAge() + " - " + mhs.getName());
//    		listDTO.add(mhsDTO);
//    	}
//    	
//    	Mockito.when(springService.getAllMahasiswaExcept("1801413716")).thenReturn(students);
//    	
//    	mockMvc.perform(get("/hello/say-something?nim=1801413716"))
//    			.andExpect(status().isOk())
//    			.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
//    			.andExpect(jsonPath("$", hasSize(2)))
//    			.andExpect(jsonPath("$[0].title", is(listDTO.get(0).getTitle())))
//    			.andExpect(jsonPath("$[1].title", is(listDTO.get(1).getTitle())));
//	   
//    	verify(springService, times(1)).getAllMahasiswaExcept("1801413716");
//    	verifyNoMoreInteractions(springService);  
//    }
//
//    @Test
//    public void testError404()throws Exception{
//		  //404 karena butuh parameter nim
//        mockMvc.perform(get("/hello/say-something")).andExpect(status().is(404));
//    }
}