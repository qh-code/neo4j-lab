package com.gitgub.qhCode.node4jLab.h2Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gitgub.qhCode.node4jLab.h2Entity.H2Person;

@RepositoryRestResource(exported=true)
public interface H2PersonRepository extends JpaRepository<H2Person, String>{

}
