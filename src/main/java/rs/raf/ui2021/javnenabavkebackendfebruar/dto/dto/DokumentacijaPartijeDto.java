package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

public class DokumentacijaPartijeDto {

    private Long id;
    private Byte[] doc1;
    private Byte[] doc2;
    private Long partija;

    public DokumentacijaPartijeDto(){}

    public DokumentacijaPartijeDto(Long id, Byte[] doc1, Byte[] doc2, Long partija) {
        this.id = id;
        this.doc1 = doc1;
        this.doc2 = doc2;
        this.partija = partija;
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

    public Long getPartija() {
        return partija;
    }

    public void setPartija(Long partija) {
        this.partija = partija;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
