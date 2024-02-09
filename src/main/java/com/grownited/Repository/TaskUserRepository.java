package com.grownited.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grownited.Entity.TaskUserEntity;

public interface TaskUserRepository extends JpaRepository<TaskUserEntity, Integer>{

}
