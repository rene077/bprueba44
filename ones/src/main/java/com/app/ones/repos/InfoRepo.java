
package com.app.ones.repos;

import com.app.ones.models.Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepo extends JpaRepository<Info,Long> {
    
}
