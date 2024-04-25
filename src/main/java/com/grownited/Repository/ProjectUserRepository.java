package com.grownited.Repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grownited.Entity.ProjectUserEntity;



@Repository
public interface ProjectUserRepository extends JpaRepository<ProjectUserEntity, Integer> {

	ProjectUserEntity findByProjectIdAndUserId(Integer projectId, Integer userId);

}
