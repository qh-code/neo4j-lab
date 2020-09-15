package com.gitgub.qhCode.node4jLab.h2Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gitgub.qhCode.node4jLab.h2Entity.H2Group;

@RepositoryRestResource(exported=true)
public interface H2GroupRepository extends JpaRepository<H2Group, String>{

}
