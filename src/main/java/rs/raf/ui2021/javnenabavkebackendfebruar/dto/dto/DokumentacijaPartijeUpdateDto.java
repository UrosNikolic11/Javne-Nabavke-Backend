package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

public class DokumentacijaPartijeUpdateDto {

    private Byte[] doc1;
    private Byte[] doc2;

    public DokumentacijaPartijeUpdateDto() {
    }

    public DokumentacijaPartijeUpdateDto(Byte[] doc1, Byte[] doc2) {
        this.doc1 = doc1;
        this.doc2 = doc2;
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
}
