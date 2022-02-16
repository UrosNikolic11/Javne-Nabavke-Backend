package rs.raf.ui2021.javnenabavkebackendfebruar.dto.createDto;

import javax.validation.constraints.NotNull;

public class KonkursnaDokumentacijaCreateDto {
    private byte[] doc1;
    private byte[] doc2;
    @NotNull
    private Long javnaNabavkaId;

    public KonkursnaDokumentacijaCreateDto() {
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

    public Long getJavnaNabavkaId() {
        return javnaNabavkaId;
    }

    public void setJavnaNabavkaId(Long javnaNabavkaId) {
        this.javnaNabavkaId = javnaNabavkaId;
    }
}