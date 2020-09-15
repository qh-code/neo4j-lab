package com.gitgub.qhCode.node4jLab.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gitgub.qhCode.node4jLab.entity.Person;

@RepositoryRestResource(exported = true)
public interface PersonRepository extends Neo4jRepository<Person, String>{
	
	public Person getPersonByName(String name);

}
