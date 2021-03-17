package com.poolsawat.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "town")
public class Town implements Serializable{

	private static final long serialVersionUID = -8202919413273036031L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "town_name")
	private String townName;
	
	@OneToOne
	@JoinColumn(name = "city_id", referencedColumnName = "id")
	private City city;
}
