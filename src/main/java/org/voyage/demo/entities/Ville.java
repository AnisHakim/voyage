package org.voyage.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.security.PrivateKey;
import java.util.List;

@Entity
public class Ville {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idVille;
	private String  nameVille;
	private String  capitalVillename  ;
	@OneToMany(mappedBy = "ville_depart")
	@JsonIgnore
	private List<Vol> departVols ;
	@OneToMany(mappedBy = "ville_arrive")
	@JsonIgnore
	private List<Vol> arriveVols ;
	@OneToMany(mappedBy = "ville")
	@JsonIgnore
	private List<Hotel> hotels ;

	public Ville(String nameVille, String capitalVillename) {
		this.nameVille = nameVille;
		this.capitalVillename = capitalVillename;
	}

	public int getIdVille() {
		return idVille;
	}

	public void setIdVille(int idVille) {
		this.idVille = idVille;
	}

	public String getNameVille() {
		return nameVille;
	}

	public void setNameVille(String nameVille) {
		this.nameVille = nameVille;
	}

	public String getCapitalVillename() {
		return capitalVillename;
	}

	public void setCapitalVillename(String capitalVillename) {
		this.capitalVillename = capitalVillename;
	}

	public List<Vol> getDepartVols() {
		return departVols;
	}

	public void setDepartVols(List<Vol> departVols) {
		this.departVols = departVols;
	}

	public List<Vol> getArriveVols() {
		return arriveVols;
	}

	public void setArriveVols(List<Vol> arriveVols) {
		this.arriveVols = arriveVols;
	}

	public List<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}
}
