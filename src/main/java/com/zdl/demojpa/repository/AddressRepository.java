package com.zdl.demojpa.repository;

import com.zdl.demojpa.entity.Address;
import com.zdl.demojpa.entity.Book;
import com.zdl.demojpa.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {



}
