package org.voyage.demo.entities;

import javax.persistence.*;

@Entity
public class ReservationVol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReservation;
    @ManyToOne
    private Client client ;
    private int nb_place ;
    @ManyToOne
    private Vol vol ;

    public ReservationVol(Client client, int nb_place, Vol vol) {
        this.client = client;
        this.nb_place = nb_place;
        this.vol = vol;
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

    public Vol getVol() {
        return vol;
    }

    public void setVol(Vol vol) {
        this.vol = vol;
    }
}
