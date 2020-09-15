package com.gitgub.qhCode.node4jLab.h2Entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;


@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Data
@Entity
public class H2Person {
	@Id
	private String id = UUID.randomUUID().toString();
	
	private String name;
	
	private String description;
	
	

}
