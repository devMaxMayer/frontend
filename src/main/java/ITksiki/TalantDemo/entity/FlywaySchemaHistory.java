package ITksiki.TalantDemo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "flyway_schema_history", schema = "public", catalog = "talant")
public class FlywaySchemaHistory extends BaseEntity {
    private int installedRank;
    private String version;
    private String description;
    private String type;
    private String script;
    private Integer checksum;
    private String installedBy;
    private Timestamp installedOn;
    private int executionTime;
    private boolean success;

    @Id
    @Column(name = "installed_rank")
    public int getInstalledRank() {
        return installedRank;
    }

    public void setInstalledRank(int installedRank) {
        this.installedRank = installedRank;
    }

    @Basic
    @Column(name = "version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "script")
    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    @Basic
    @Column(name = "checksum")
    public Integer getChecksum() {
        return checksum;
    }

    public void setChecksum(Integer checksum) {
        this.checksum = checksum;
    }

    @Basic
    @Column(name = "installed_by")
    public String getInstalledBy() {
        return installedBy;
    }

    public void setInstalledBy(String installedBy) {
        this.installedBy = installedBy;
    }

    @Basic
    @Column(name = "installed_on")
    public Timestamp getInstalledOn() {
        return installedOn;
    }

    public void setInstalledOn(Timestamp installedOn) {
        this.installedOn = installedOn;
    }

    @Basic
    @Column(name = "execution_time")
    public int getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(int executionTime) {
        this.executionTime = executionTime;
    }

    @Basic
    @Column(name = "success")
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
