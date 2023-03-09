package springboot.rentACar.Entities.Concretes;

import jakarta.persistence.*;
import lombok.*;

@Table(name="Brands")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
}
