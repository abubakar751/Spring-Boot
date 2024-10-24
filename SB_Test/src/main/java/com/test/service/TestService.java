package com.test.service;

import com.test.dao.TestRepo;
import com.test.enitit.TestEntity;
import jdk.dynalink.beans.StaticClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    private TestRepo testRepo;
    public TestEntity addData(TestEntity data) {
        TestEntity save = testRepo.save(data);

        return save;
    }
    public TestEntity getData(int id) {
        return testRepo.findById(id).get();
    }
    public List<TestEntity> getAllData() {

        return testRepo.findAll();

    }
    public TestEntity updateData( TestEntity data,int id) {
        TestEntity find = testRepo.findById(id).get();
        TestEntity entitySave = null;
        if (find != null) {
            find.setId(find.getId());
            find.setName(find.getName());
            find.setAge(find.getAge());
            entitySave = testRepo.save(find);


        }
        return entitySave;
    }
    public String  deleteData(int id) {
        testRepo.deleteById(id);
        return "Deleted";
    }
}
