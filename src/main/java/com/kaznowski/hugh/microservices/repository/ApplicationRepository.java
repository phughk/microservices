package com.kaznowski.hugh.microservices.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kaznowski.hugh.microservices.domain.ApplicationItem;
import java.util.List;

/**
 * Created by MRomeh on 23/08/2017.
 */
@Repository
public interface ApplicationRepository extends JpaRepository<ApplicationItem, Long> {

    List<ApplicationItem> findApplicationEntriesByApplicationCode(String applicationCode);

}
