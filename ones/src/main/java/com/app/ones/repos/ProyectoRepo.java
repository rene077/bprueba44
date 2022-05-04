
package com.app.ones.repos;

import com.app.ones.models.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepo extends JpaRepository<Proyecto,Long> {
    
}
