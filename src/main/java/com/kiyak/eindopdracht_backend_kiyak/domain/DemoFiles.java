package com.kiyak.eindopdracht_backend_kiyak.domain;

import javax.persistence.Entity;
        import javax.persistence.GeneratedValue;
        import javax.persistence.Id;
        import javax.persistence.Lob;
        import javax.persistence.Table;

        import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "files")
public class DemoFiles {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String demoname;

    private String demotype;

    @Lob
    private byte[] demodata;

    public DemoFiles() {
    }

    public DemoFiles(String demoname, String demotype, byte[] demodata) {
        this.demoname = demoname;
        this.demotype = demotype;
        this.demodata = demodata;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return demoname;
    }

    public void setName(String demoname) {
        this.demoname = demoname;
    }

    public String getType() {
        return demotype;
    }

    public void setType(String demotype) {
        this.demotype = demotype;
    }

    public byte[] getData() {
        return demodata;
    }

    public void setData(byte[] demodata) {
        this.demodata = demodata;
    }

}