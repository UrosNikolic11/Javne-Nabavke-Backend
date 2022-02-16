package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import javax.persistence.*;

@Entity
@Table
public class DokumentacijaPartije {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Column(columnDefinition = "BLOB")
    private Byte[] doc1;

    @Lob
    @Column(columnDefinition = "BLOB")
    private Byte[] doc2;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Partija_id", referencedColumnName = "id")
    private Partija partija;

    public DokumentacijaPartije() {}

    public DokumentacijaPartije(Long id, Byte[] doc1, Byte[] doc2, Partija partija) {
        this.id = id;
        this.doc1 = doc1;
        this.doc2 = doc2;
        this.partija = partija;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte[] getDoc1() {
        return doc1;
    }

    public void setDoc1(Byte[] doc1) {
        this.doc1 = doc1;
    }

    public Byte[] getDoc2() {
        return doc2;
    }

    public void setDoc2(Byte[] doc2) {
        this.doc2 = doc2;
    }

    public Partija getPartija() {
        return partija;
    }

    public void setPartija(Partija partija) {
        this.partija = partija;
    }
}