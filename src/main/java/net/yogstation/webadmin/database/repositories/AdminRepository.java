package net.yogstation.webadmin.database.repositories;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

import com.fasterxml.jackson.annotation.JsonView;
import net.yogstation.webadmin.database.entities.AdminEntity;
import org.springframework.data.repository.CrudRepository;

@JsonView
public interface AdminRepository extends CrudRepository<AdminEntity, Long> {

}