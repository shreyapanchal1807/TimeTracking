package com.grownited.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grownited.Entity.ProjectEntity;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Integer> {

}
