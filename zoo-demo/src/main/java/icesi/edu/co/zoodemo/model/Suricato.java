package icesi.edu.co.zoodemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "`suricato`")
public class Suricato {
    @Id
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID id;
    private String name;
    private String gender;
    private float weight;
    private int age;
    private float height;
    private Date arriveDate;
    private UUID fatherId;
    private UUID motherId;

    @PrePersist
    public void generateId() {
        this.id = UUID.randomUUID();
    }
}
