package com.gitgub.qhCode.node4jLab.entity;

import java.util.List;
import java.util.UUID;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.Required;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Data
@NodeEntity
public class Group {
	@Id
	private String id = UUID.randomUUID().toString();
	
	@Required
	private String name;
	
	private String description;
	
	
	@Relationship(type = "CONTAINS", direction= Relationship.OUTGOING)
	private List<Person> members;

}
