package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

//FROM LOMBOK
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

//ORM
@Entity

public class Customer {

    @Id // for primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // for
    private int id;
    private String name;
    private String address;
}
