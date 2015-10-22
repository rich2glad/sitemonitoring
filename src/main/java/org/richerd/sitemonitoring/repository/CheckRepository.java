package org.richerd.sitemonitoring.repository;

import org.richerd.sitemonitoring.entity.Check;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckRepository extends JpaRepository<Check, Integer>{

}
