package com.example.practice.repository;

import com.example.practice.Address;
import org.springframework.data.jpa.repository.JpaRepository;




public interface AddressMySQLRepository extends JpaRepository<Address, Integer> {

}