package com.gitgub.qhCode.node4jLab.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gitgub.qhCode.node4jLab.entity.Group;

@RepositoryRestResource(exported = true)
public interface GroupRepository extends Neo4jRepository<Group, String> {
	
	public Group getGroupByName(String name);
	

}
