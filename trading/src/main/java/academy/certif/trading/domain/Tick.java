package academy.certif.trading.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Tick {

    private @Id @GeneratedValue(strategy=GenerationType.IDENTITY) Long id;
    private String symbol;
    private LocalDateTime createdAt;
    private float price;

    Tick() {}

    Tick(String symbol, LocalDateTime createdAt, float price) {
        this.symbol = symbol;
        this.createdAt = createdAt;
        this.price = price;
    }


    public Long getId() {
        return this.id;
    }


    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}