package it.softwareinside.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.softwareinside.app.models.Pc;

public interface PcRepository extends JpaRepository<Pc, Integer>{

}
