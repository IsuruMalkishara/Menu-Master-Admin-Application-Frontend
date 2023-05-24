package com.oxcentra.menumaster.repository;

import com.oxcentra.menumaster.model.Business;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessRepository extends JpaRepository<Business,Integer> {
}
