package com.RR.demo.Repository;

import com.RR.demo.Model.ProgCard;
import com.RR.demo.Model.Register;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Petrine
 */
public interface RegisterRepo extends JpaRepository<Register, String> {
}