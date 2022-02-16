package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Komisija {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 45)
    private String glavni;

    public Komisija() {}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGlavni() {
        return glavni;
    }

    public void setGlavni(String glavni) {
        this.glavni = glavni;
    }
}
