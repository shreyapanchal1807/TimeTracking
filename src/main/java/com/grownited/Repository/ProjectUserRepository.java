package com.grownited.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grownited.Entity.ProjectStatusEntity;
import com.grownited.Entity.ProjectUserEntity;

public interface ProjectUserRepository extends JpaRepository<ProjectUserEntity, Integer> {

}
