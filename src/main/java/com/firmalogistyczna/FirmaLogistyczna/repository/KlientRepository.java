package com.firmalogistyczna.FirmaLogistyczna.repository;

import com.firmalogistyczna.FirmaLogistyczna.entity.Klient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KlientRepository extends JpaRepository<Klient,Long> {

}
