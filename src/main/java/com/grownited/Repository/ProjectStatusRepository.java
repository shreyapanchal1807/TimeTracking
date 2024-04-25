package com.grownited.Repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.grownited.Entity.ProjectStatusEntity;



public interface ProjectStatusRepository extends JpaRepository<ProjectStatusEntity, Integer> {

	ProjectStatusEntity findByStatus(String status);

}
