package com.firmalogistyczna.FirmaLogistyczna.repository;

import com.firmalogistyczna.FirmaLogistyczna.entity.PlanPrzewozowy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanPrzewozowyRepository extends JpaRepository<PlanPrzewozowy,Long> {

}
