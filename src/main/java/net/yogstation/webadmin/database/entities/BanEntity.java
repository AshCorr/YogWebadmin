package net.yogstation.webadmin.database.entities;

import com.fasterxml.jackson.annotation.JsonView;
import net.yogstation.webadmin.Constants;
import net.yogstation.webadmin.Views;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = Constants.TABLE_PREFIX + "ban")
public class BanEntity {

    @JsonView(Views.Public.class)
    private int id;
    @JsonView(Views.Public.class)
    private Timestamp bantime;
    @JsonView(Views.Admin.class)
    private String serverip;
    @JsonView(Views.Public.class)
    private String bantype;
    @JsonView(Views.Public.class)
    private String reason;
    @JsonView(Views.Public.class)
    private String job;
    @JsonView(Views.Public.class)
    private int duration;
    @JsonView(Views.Public.class)
    private Integer rounds;
    @JsonView(Views.Public.class)
    private Timestamp expirationTime;
    @JsonView(Views.Public.class)
    private String ckey;
    @JsonView(Views.Admin.class)
    private String computerid;
    @JsonView(Views.Admin.class)
    private String ip;
    @JsonView(Views.Public.class)
    private String aCkey;
    @JsonView(Views.Admin.class)
    private String aComputerid;
    @JsonView(Views.Admin.class)
    private String aIp;
    @JsonView(Views.Public.class)
    private String who;
    @JsonView(Views.Public.class)
    private String adminwho;
    @JsonView(Views.Public.class)
    private String edits;
    @JsonView(Views.Public.class)
    private Integer unbanned;
    @JsonView(Views.Public.class)
    private Timestamp unbannedDatetime;
    @JsonView(Views.Public.class)
    private String unbannedCkey;
    @JsonView(Views.Admin.class)
    private String unbannedComputerid;
    @JsonView(Views.Admin.class)
    private String unbannedIp;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "bantime")
    public Timestamp getBantime() {
        return bantime;
    }

    public void setBantime(Timestamp bantime) {
        this.bantime = bantime;
    }

    @Basic
    @Column(name = "serverip")
    public String getServerip() {
        return serverip;
    }

    public void setServerip(String serverip) {
        this.serverip = serverip;
    }

    @Basic
    @Column(name = "bantype")
    public String getBantype() {
        return bantype;
    }

    public void setBantype(String bantype) {
        this.bantype = bantype;
    }

    @Basic
    @Column(name = "reason")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Basic
    @Column(name = "job")
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Basic
    @Column(name = "duration")
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Basic
    @Column(name = "rounds")
    public Integer getRounds() {
        return rounds;
    }

    public void setRounds(Integer rounds) {
        this.rounds = rounds;
    }

    @Basic
    @Column(name = "expiration_time")
    public Timestamp getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Timestamp expirationTime) {
        this.expirationTime = expirationTime;
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
    @Column(name = "computerid")
    public String getComputerid() {
        return computerid;
    }

    public void setComputerid(String computerid) {
        this.computerid = computerid;
    }

    @Basic
    @Column(name = "ip")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Basic
    @Column(name = "a_ckey")
    public String getaCkey() {
        return aCkey;
    }

    public void setaCkey(String aCkey) {
        this.aCkey = aCkey;
    }

    @Basic
    @Column(name = "a_computerid")
    public String getaComputerid() {
        return aComputerid;
    }

    public void setaComputerid(String aComputerid) {
        this.aComputerid = aComputerid;
    }

    @Basic
    @Column(name = "a_ip")
    public String getaIp() {
        return aIp;
    }

    public void setaIp(String aIp) {
        this.aIp = aIp;
    }

    @Basic
    @Column(name = "who")
    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    @Basic
    @Column(name = "adminwho")
    public String getAdminwho() {
        return adminwho;
    }

    public void setAdminwho(String adminwho) {
        this.adminwho = adminwho;
    }

    @Basic
    @Column(name = "edits")
    public String getEdits() {
        return edits;
    }

    public void setEdits(String edits) {
        this.edits = edits;
    }

    @Basic
    @Column(name = "unbanned")
    public Integer getUnbanned() {
        return unbanned;
    }

    public void setUnbanned(Integer unbanned) {
        this.unbanned = unbanned;
    }

    @Basic
    @Column(name = "unbanned_datetime")
    public Timestamp getUnbannedDatetime() {
        return unbannedDatetime;
    }

    public void setUnbannedDatetime(Timestamp unbannedDatetime) {
        this.unbannedDatetime = unbannedDatetime;
    }

    @Basic
    @Column(name = "unbanned_ckey")
    public String getUnbannedCkey() {
        return unbannedCkey;
    }

    public void setUnbannedCkey(String unbannedCkey) {
        this.unbannedCkey = unbannedCkey;
    }

    @Basic
    @Column(name = "unbanned_computerid")
    public String getUnbannedComputerid() {
        return unbannedComputerid;
    }

    public void setUnbannedComputerid(String unbannedComputerid) {
        this.unbannedComputerid = unbannedComputerid;
    }

    @Basic
    @Column(name = "unbanned_ip")
    public String getUnbannedIp() {
        return unbannedIp;
    }

    public void setUnbannedIp(String unbannedIp) {
        this.unbannedIp = unbannedIp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BanEntity that = (BanEntity) o;
        return id == that.id &&
                duration == that.duration &&
                Objects.equals(bantime, that.bantime) &&
                Objects.equals(serverip, that.serverip) &&
                Objects.equals(bantype, that.bantype) &&
                Objects.equals(reason, that.reason) &&
                Objects.equals(job, that.job) &&
                Objects.equals(rounds, that.rounds) &&
                Objects.equals(expirationTime, that.expirationTime) &&
                Objects.equals(ckey, that.ckey) &&
                Objects.equals(computerid, that.computerid) &&
                Objects.equals(ip, that.ip) &&
                Objects.equals(aCkey, that.aCkey) &&
                Objects.equals(aComputerid, that.aComputerid) &&
                Objects.equals(aIp, that.aIp) &&
                Objects.equals(who, that.who) &&
                Objects.equals(adminwho, that.adminwho) &&
                Objects.equals(edits, that.edits) &&
                Objects.equals(unbanned, that.unbanned) &&
                Objects.equals(unbannedDatetime, that.unbannedDatetime) &&
                Objects.equals(unbannedCkey, that.unbannedCkey) &&
                Objects.equals(unbannedComputerid, that.unbannedComputerid) &&
                Objects.equals(unbannedIp, that.unbannedIp);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, bantime, serverip, bantype, reason, job, duration, rounds, expirationTime, ckey, computerid, ip, aCkey, aComputerid, aIp, who, adminwho, edits, unbanned, unbannedDatetime, unbannedCkey, unbannedComputerid, unbannedIp);
    }
}
