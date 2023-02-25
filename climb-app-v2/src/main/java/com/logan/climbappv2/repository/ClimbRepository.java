package com.logan.climbappv2.repository;

import com.logan.climbappv2.model.Climb;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClimbRepository extends JpaRepository<Climb, Long>{

    Climb save(Climb climb);

    List<Climb> findAll();

    List<Climb> findByIsSent(boolean isSent);

    List<Climb> findByDiscipline(String discipline);
}
