package com.zdl.demojpa;

import com.zdl.demojpa.entity.Address;
import com.zdl.demojpa.entity.People;
import com.zdl.demojpa.repository.AddressRepository;
import com.zdl.demojpa.repository.PeopleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PeopleRepositoryTests {


    @Autowired
    PeopleRepository peopleRepository;

    @Autowired
    AddressRepository addressRepository;


    /**
     * 增加
     */

    @Test
    public void add() {
        Set<People> peopleSet = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            People people = new People();
            people.setName("aa");
            Timestamp d = new Timestamp(System.currentTimeMillis());
            people.setBirthday(d);
            people.setSex("男");
            Address address = new Address();
            address.setAddress("aaasdasd"+i+"i"+i+2);
            address.setPhone("1255454554"+3);
            address.setZipcode("444"+"a"+i);
            people.setAddress(address);
            peopleSet.add(people);
        }
        peopleRepository.saveAll(peopleSet);
    }


    /**
     * 删除
     */
    @Test
    public void del() {
        List<People> all = peopleRepository.findAll();

        if (all.size() > 0) {
            peopleRepository.delete(all.get(0));
        }

    }


    /**
     * 修改
     */
    @Test
    public void edit() {
        People people = peopleRepository.findById(Long.valueOf("2")).get();
        Address address = people.getAddress();
        address.setZipcode("123456");
        people.setAddress(address);
        peopleRepository.save(people);
    }


    /**
     * 删除全部
     */
    @Test
    public void delAll() {
        peopleRepository.deleteAll();
    }


    @Test
    public void seladresstopeo() {
        Address address = addressRepository.findById(Long.valueOf("1")).get();
        System.out.println(address.getPeople().toString());


    }




}
