package com.demo.repository;

import com.demo.entity.Sach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SachRepository extends JpaRepository<Sach, Integer>{

}
