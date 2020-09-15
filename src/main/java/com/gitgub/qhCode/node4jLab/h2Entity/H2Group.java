package com.gitgub.qhCode.node4jLab.h2Entity;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Data
@Entity
public class H2Group {
	
	@Id
	private String id = UUID.randomUUID().toString();
	
	private String name;
	
	private String description;
	
	
	@OneToMany
	private List<H2Person> members;

}
