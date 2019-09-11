package com.danielabella.exemplo1;

import javax.persistence.*;
import lombok.*;

@Entity @NoArgsConstructor @Getter @Setter 
public class Person {

	@Id @GeneratedValue(strategy = GenerationType.AUTO) 
	private long id;

	private String firstName;
	private String lastName;
}


