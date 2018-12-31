package org.voyage.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name="ID")
public class Client extends User{

    @OneToMany(mappedBy = "client")
    @JsonIgnore
    private List<ReservationVol>  reservationVols ;

    @OneToMany(mappedBy = "client")
    @JsonIgnore
    private List<ReservationHotel> reservationHotels ;

    public Client(String nom, String prenom, String email, String telephone) {
        super(nom, prenom, email, telephone);
    }

    public List<ReservationVol> getReservationVols() {
        return reservationVols;
    }

    public void setReservationVols(List<ReservationVol> reservationVols) {
        this.reservationVols = reservationVols;
    }

    public List<ReservationHotel> getReservationHotels() {
        return reservationHotels;
    }

    public void setReservationHotels(List<ReservationHotel> reservationHotels) {
        this.reservationHotels = reservationHotels;
    }
}
