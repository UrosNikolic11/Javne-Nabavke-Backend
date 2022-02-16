package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import javax.persistence.*;

@Entity
@Table(name = "KonkursnaDokumentacija")
public class KonkursnaDokumentacija {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Lob
    @Column(name = "doc1", columnDefinition="BLOB")
    private byte[] doc1;
    @Lob
    @Column(name = "doc2", columnDefinition="BLOB")
    private byte[] doc2;
    @JoinColumn(name="JavnaNabavka_id", referencedColumnName = "id")
    @ManyToOne
    private JavnaNabavka javnaNabavka;

    public KonkursnaDokumentacija() {
    }

    public KonkursnaDokumentacija(Long id, byte[] doc1, byte[] doc2, JavnaNabavka javnaNabavka) {
        this.id = id;
        this.doc1 = doc1;
        this.doc2 = doc2;
        this.javnaNabavka = javnaNabavka;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getDoc1() {
        return doc1;
    }

    public void setDoc1(byte[] doc1) {
        this.doc1 = doc1;
    }

    public byte[] getDoc2() {
        return doc2;
    }

    public void setDoc2(byte[] doc2) {
        this.doc2 = doc2;
    }

    public JavnaNabavka getJavnaNabavka() {
        return javnaNabavka;
    }

    public void setJavnaNabavka(JavnaNabavka javnaNabavka) {
        this.javnaNabavka = javnaNabavka;
    }
}