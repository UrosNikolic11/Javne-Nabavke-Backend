package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ObjavaPlana {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date datumObjave;

    @Column(length = 200, nullable = false)
    private String statusObjave;

    public ObjavaPlana() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDatumObjave() {
        return datumObjave;
    }

    public void setDatumObjave(Date datumObjave) {
        this.datumObjave = datumObjave;
    }

    public String getStatusObjave() {
        return statusObjave;
    }

    public void setStatusObjave(String statusObjave) {
        this.statusObjave = statusObjave;
    }
}
