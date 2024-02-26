package com.springauth.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springauth.dto.userDto;

@Repository
public interface userDao extends JpaRepository<userDto,Integer>{

}
