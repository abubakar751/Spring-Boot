package com.sb.test.service;


import java.util.List;
import java.util.Optional;

import javax.management.AttributeNotFoundException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.test.dto.TestDTO;
import com.sb.test.entity.TestEntity;
import com.sb.test.repository.TestRepo;
@Service
public class TestService {
	@Autowired
	private TestRepo testRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	public TestEntity insertData(TestDTO testDTO) {
		TestEntity map = modelMapper.map(testDTO, TestEntity.class);
		return testRepo.save(map);

	}
	
	public Optional<TestEntity> fetchById(int id) {
		modelMapper.map(id, TestEntity.class);
		return 	testRepo.findById(id);
		
		
	}
	
	public List<TestEntity> fetchAll(TestDTO testDTO){
		TestEntity map = modelMapper.map(testDTO, TestEntity.class);
		List<TestEntity> findAll = testRepo.findAll();
		return findAll;
		
		
	}
	public void deleteData(int id) throws Exception {
		TestEntity testEntity = testRepo.findById(id).orElseThrow(() -> new AttributeNotFoundException("id not founnd"+id));
		testRepo.delete(testEntity);
	   
	
	}
	public String  update(int id,TestDTO testDto ) throws Exception{
         TestDTO map = modelMapper.map(testDto,TestDTO.class);
         try {
          TestEntity testEntity = testRepo.findById(id).get();
          if (testEntity!=null) {
        	 testEntity.setName(testDto.getName());
        	 testEntity.setGmail(testDto.getGmail());
        	 testEntity.setGender(testDto.getGender());
        	testRepo.save(testEntity); 
			
	
          }
          }catch (Exception e) {
        	  throw new Exception("id not found") ;
			// TODO: handle exception
		}
		return "Data Updated";
	
         
       
    
	
	}
}
