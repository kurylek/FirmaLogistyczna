package com.firmalogistyczna.FirmaLogistyczna.repository;

import com.firmalogistyczna.FirmaLogistyczna.entity.Paczka;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaczkaRepository extends JpaRepository<Paczka,Long> {

}
