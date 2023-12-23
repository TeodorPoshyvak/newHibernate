package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
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

    @Override
    public String toString() {
        return "Planet{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
