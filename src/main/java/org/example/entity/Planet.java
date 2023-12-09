package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnTransformer;

@Data
@Entity
@Table(name = "planet")
public class Planet {
    @Id
    @Column(name = "id")
    String id;

    @Column(unique = true)
    String name;

    public void setId(String id) {
        this.id = (id != null) ? id.toUpperCase() : null;
    }
}
