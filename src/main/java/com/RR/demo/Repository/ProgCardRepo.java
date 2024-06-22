package com.RR.demo.Repository;

import com.RR.demo.Model.ProgCard;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


/**
 * @author Petrine
 */
public interface ProgCardRepo extends JpaRepository<ProgCard, Integer> {

   
}
