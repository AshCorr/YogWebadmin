package net.yogstation.webadmin.database.repositories;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

import com.fasterxml.jackson.annotation.JsonView;
import net.yogstation.webadmin.database.entities.AdminEntity;
import net.yogstation.webadmin.database.entities.BanEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

//@JsonView
public interface BanRepository extends PagingAndSortingRepository<BanEntity, Long> {
    List<BanEntity> findAllByCkey(String username, Pageable pageable);
}