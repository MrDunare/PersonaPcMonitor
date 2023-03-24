package it.softwareinside.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.softwareinside.app.models.Monitor;

public interface MonitorRepository extends JpaRepository<Monitor, Integer>{

}
