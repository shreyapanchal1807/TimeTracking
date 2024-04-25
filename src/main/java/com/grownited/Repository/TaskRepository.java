package com.grownited.Repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grownited.Entity.TaskEntity;



@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Integer>{

	List<TaskEntity> findByModuleId(Integer moduleId);

	
}
