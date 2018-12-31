package org.voyage.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Vol {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idVol;
	private String dateDepart;
	private String dateArrive;
	private float prix ;
	@ManyToOne
	private Ville ville_depart ;
	@ManyToOne
	private Ville ville_arrive ;
	@OneToMany(mappedBy = "vol")
	@JsonIgnore
	private List<ReservationVol> reservationVols ;

	public List<ReservationVol> getReservationVols() {
		return reservationVols;
	}

	public void setReservationVols(List<ReservationVol> reservationVols) {
		this.reservationVols = reservationVols;
	}

	public Vol(String dateDepart, String dateArrive, float prix, Ville ville_depart, Ville ville_arrive) {
		this.dateDepart = dateDepart;
		this.dateArrive = dateArrive;
		this.prix = prix;
		this.ville_depart = ville_depart;
		this.ville_arrive = ville_arrive;
	}

	public int getIdVol() {
		return idVol;
	}

	public void setIdVol(int idVol) {
		this.idVol = idVol;
	}

	public String getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(String dateDepart) {
		this.dateDepart = dateDepart;
	}

	public String getDateArrive() {
		return dateArrive;
	}

	public void setDateArrive(String dateArrive) {
		this.dateArrive = dateArrive;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Ville getVille_depart() {
		return ville_depart;
	}

	public void setVille_depart(Ville ville_depart) {
		this.ville_depart = ville_depart;
	}

	public Ville getVille_arrive() {
		return ville_arrive;
	}

	public void setVille_arrive(Ville ville_arrive) {
		this.ville_arrive = ville_arrive;
	}
}
