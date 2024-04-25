package com.grownited.Repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grownited.Entity.ModuleEntity;


@Repository
public interface ModuleRepository extends JpaRepository<ModuleEntity, Integer> {

	List<ModuleEntity> findByProjectId(Integer projectId);

}
