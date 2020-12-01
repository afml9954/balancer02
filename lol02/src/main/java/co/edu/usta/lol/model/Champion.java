package co.edu.usta.lol.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(catalog = "db_champions", schema = "public", name = "champions")
public class Champion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "champion_id")
    private Integer championId;

    @Basic(optional = false)
    private String name;

    @Basic(optional = false)
    private String description;

    public Champion() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getChampionId() {
        return championId;
    }

    public void setChampionId(Integer championId) {
        this.championId = championId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Champion champion = (Champion) o;
        return Objects.equals(championId, champion.championId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(championId);
    }

    @Override
    public String toString() {
        return "Champion{" +
                "championId=" + championId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
