package kr.hs.emrim.tjdusdlfkrhd.internship;

import okhttp3.MultipartBody;

public class Article {
    private int id;
    private String title;
    private String contents;
    private MultipartBody.Part file;
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MultipartBody.Part getFile() {
        return file;
    }

    public void setFile(MultipartBody.Part file) {
        this.file = file;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ",title="+title+
                ", contents='" + contents + '\'' +
                ", User=" + user +
                ", file=" + file +
                '}';
    }
}
