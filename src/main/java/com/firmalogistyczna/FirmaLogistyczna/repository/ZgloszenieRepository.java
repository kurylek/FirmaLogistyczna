package com.firmalogistyczna.FirmaLogistyczna.repository;

import com.firmalogistyczna.FirmaLogistyczna.entity.Zgloszenie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZgloszenieRepository extends JpaRepository<Zgloszenie,Long> {

}
