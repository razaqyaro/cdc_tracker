package com.razak.cdctracker.repository;


import com.razak.cdctracker.model.Advisee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdviseeRepository extends JpaRepository<Advisee, Long> {

}
