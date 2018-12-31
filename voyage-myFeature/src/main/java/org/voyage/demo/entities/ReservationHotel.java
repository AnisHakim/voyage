package org.voyage.demo.entities;

import javax.persistence.*;

@Entity
public class ReservationHotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReservation;
    @ManyToOne
    private Client client ;
    private int nb_place ;
    @ManyToOne
    private Hotel hotel ;

    public ReservationHotel(Client client, int nb_place, Hotel hotel) {
        this.client = client;
        this.nb_place = nb_place;
        this.hotel = hotel;
    }

    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getNb_place() {
        return nb_place;
    }

    public void setNb_place(int nb_place) {
        this.nb_place = nb_place;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
