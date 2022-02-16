package rs.raf.ui2021.javnenabavkebackendfebruar.dto.dto;

public class KonkursnaDokumentacijaUpdateDto {
    private byte[] doc1;
    private byte[] doc2;
    private Long javnaNabavkaId;

    public KonkursnaDokumentacijaUpdateDto() {
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
