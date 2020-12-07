package Entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ADMINISTRATORS", schema = "GOLZAR", catalog = "")
public class AdministratorsEntity {
    private long adminid;
    private String username;
    private String password;

    @Id
    @Column(name = "ADMINID", nullable = false, precision = 0)
    public long getAdminid() {
        return adminid;
    }

    public void setAdminid(long adminid) {
        this.adminid = adminid;
    }

    @Basic
    @Column(name = "USERNAME", nullable = true, length = 200)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = true, length = 200)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdministratorsEntity that = (AdministratorsEntity) o;
        return adminid == that.adminid &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminid, username, password);
    }
}
