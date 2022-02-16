package rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto;

import javax.validation.constraints.NotEmpty;

public class DokumentacijaPartijeCreateDto {

    private Byte[] doc1;
    private Byte[] doc2;

    @NotEmpty(message = "Id partije je obavezan.")
    private Long partija;

    public DokumentacijaPartijeCreateDto(Byte[] doc1, Byte[] doc2, Long partija) {
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


}
