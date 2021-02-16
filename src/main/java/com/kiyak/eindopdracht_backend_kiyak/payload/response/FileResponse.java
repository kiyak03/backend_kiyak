package com.kiyak.eindopdracht_backend_kiyak.payload.response;

public class FileResponse {

    private String name;
    private String url;
    private String type;
    private long size;
    private String id;
    private String contenttype;

    public FileResponse(String name, String url, String type, long size, String id, String contenttype) {
        this.name = name;
        this.url = url;
        this.type = type;
        this.size = size;
        this.id = id;
        this.contenttype = contenttype;
    }

    public FileResponse() {

    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContenttype() {
        return contenttype;
    }

    public void setContenttype(String contenttype) {
        this.contenttype = contenttype;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
