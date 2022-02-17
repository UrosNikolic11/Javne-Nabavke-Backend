package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import rs.raf.ui2021.javnenabavkebackendfebruar.exception.BadRequestException;

import javax.persistence.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class PlanJavneNabavke {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer godinaPlana;

    @Column(nullable = false, length = 200)
    private String statusPlana;

    @Column(nullable = false)
    private Integer verzijaPlana;

    @Column(nullable = false)
    private Date datumUsvajanja;

    @Column(nullable = false)
    private Date datumSlanjaNaObjavu;

    @ManyToOne
    @JoinColumn(name = "godisnjiPlanJavnihNabavki_id", nullable = false)
    private GodisnjiPlanJavnihNabavki godisnjiPlanJavnihNabavki;

    @OneToOne
    @JoinColumn(name = "predlogNabavke_id", nullable = false)
    private PredlogNabavke predlogNabavke;

    @OneToOne
    @JoinColumn(name = "objavaPlana_id")
    private ObjavaPlana objavaPlana;
    
    @ManyToOne
 	@JoinColumn(name = "narucilac_Id", nullable = false)
    private Narucilac narucilac; 

    public PlanJavneNabavke() {
    }

    public Date parseDate(String s){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sdf.parse(s);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        throw new BadRequestException("Pogresan unos datuma '"+s+"'");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getGodinaPlana() {
        return godinaPlana;
    }

    public void setGodinaPlana(Integer godinaPlana) {
        this.godinaPlana = godinaPlana;
    }

    public String getStatusPlana() {
        return statusPlana;
    }

    public void setStatusPlana(String statusPlana) {
        this.statusPlana = statusPlana;
    }

    public Integer getVerzijaPlana() {
        return verzijaPlana;
    }

    public void setVerzijaPlana(Integer verzijaPlana) {
        this.verzijaPlana = verzijaPlana;
    }

    public Date getDatumUsvajanja() {
        return datumUsvajanja;
    }

    public void setDatumUsvajanja(Date datumUsvajanja) {
        this.datumUsvajanja = datumUsvajanja;
    }

    public Date getDatumSlanjaNaObjavu() {
        return datumSlanjaNaObjavu;
    }

    public void setDatumSlanjaNaObjavu(Date datumSlanjaNaObjavu) {
        this.datumSlanjaNaObjavu = datumSlanjaNaObjavu;
    }

    public ObjavaPlana getObjavaPlana() {
        return objavaPlana;
    }

    public void setObjavaPlana(ObjavaPlana objavaPlana) {
        this.objavaPlana = objavaPlana;
    }

    public GodisnjiPlanJavnihNabavki getGodisnjiPlanJavnihNabavki() {
        return godisnjiPlanJavnihNabavki;
    }

    public void setGodisnjiPlanJavnihNabavki(GodisnjiPlanJavnihNabavki godisnjiPlanJavnihNabavki) {
        this.godisnjiPlanJavnihNabavki = godisnjiPlanJavnihNabavki;
    }

    public PredlogNabavke getPredlogNabavke() {
        return predlogNabavke;
    }

    public void setPredlogNabavke(PredlogNabavke predlogNabavke) {
        this.predlogNabavke = predlogNabavke;
    }

    public Narucilac getNarucilac() {
        return narucilac;
    }

    public void setNarucilac(Narucilac narucilac) {
        this.narucilac = narucilac;
    }
}
