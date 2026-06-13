package net.engineeringdigest.journalapp.entity;

public class JournalEntry
{
    private long id;
    private String tital;
    private String contant;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTital() {
        return tital;
    }

    public void setTital(String tital) {
        this.tital = tital;
    }

    public String getContant() {
        return contant;
    }

    public void setContant(String contant) {
        this.contant = contant;
    }
}
