package com.grownited.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grownited.Entity.ProjectStatusEntity;
import com.grownited.controller.ProjectStatusController;

@Repository
public interface ProjectStatusRepository extends JpaRepository<ProjectStatusEntity, Integer>{

}
