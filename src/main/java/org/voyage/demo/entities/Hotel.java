package org.voyage.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idHotel;
	private String nameHotel;
	@ManyToOne
	private Ville ville  ;
	@OneToMany(mappedBy = "hotel")
	@JsonIgnore
	private List<ReservationHotel> reservationHotels ;

	public Hotel(String nameHotel, Ville ville) {
		this.nameHotel = nameHotel;
		this.ville = ville;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public String getNameHotel() {
		return nameHotel;
	}

	public void setNameHotel(String nameHotel) {
		this.nameHotel = nameHotel;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public List<ReservationHotel> getReservationHotels() {
		return reservationHotels;
	}

	public void setReservationHotels(List<ReservationHotel> reservationHotels) {
		this.reservationHotels = reservationHotels;
	}
}
