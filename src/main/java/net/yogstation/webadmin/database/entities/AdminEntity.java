package net.yogstation.webadmin.database.entities;

import com.fasterxml.jackson.annotation.JsonView;
import net.yogstation.webadmin.Constants;
import net.yogstation.webadmin.Views;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = Constants.TABLE_PREFIX + "admin")
public class AdminEntity {
    @JsonView(Views.Admin.class)
    private int id;
    @JsonView(Views.Admin.class)
    private String ckey;
    @JsonView(Views.Admin.class)
    private String rank;
    @JsonView(Views.Admin.class)
    private int level;
    @JsonView(Views.Admin.class)
    private int flags;
    @JsonView(Views.Admin.class)
    private String email;
    @JsonView(Views.Internal.class)
    private String password;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ckey")
    public String getCkey() {
        return ckey;
    }

    public void setCkey(String ckey) {
        this.ckey = ckey;
    }

    @Basic
    @Column(name = "rank")
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Basic
    @Column(name = "level")
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Basic
    @Column(name = "flags")
    public int getFlags() {
        return flags;
    }

    public void setFlags(int flags) {
        this.flags = flags;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "password")
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
        AdminEntity that = (AdminEntity) o;
        return id == that.id &&
                level == that.level &&
                flags == that.flags &&
                Objects.equals(ckey, that.ckey) &&
                Objects.equals(rank, that.rank) &&
                Objects.equals(email, that.email) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, ckey, rank, level, flags, email, password);
    }
}
