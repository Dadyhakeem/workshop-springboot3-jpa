package dev.Hakeem.SpringWeb.entities;

import java.io.Serializable;
import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "tb_Order")
public class Order implements Serializable {
    private static final long  serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant moment;
    
    @ManyToOne
    @JoinColumn(name = "client_id")
    private User cliente;
    public Order(){
        
    }
    
    public Order(Long id, Instant date, User cliente) {
        this.id = id;
        this.moment = date;
        this.cliente = cliente;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Instant getDate() {
        return moment;
    }
    public void setDate(Instant date) {
        this.moment = date;
    }
    public User getCliente() {
        return cliente;
    }
    public void setCliente(User cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Order other = (Order) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
   




}