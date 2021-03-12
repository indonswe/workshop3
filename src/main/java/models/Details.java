package models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class  Details {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int detailsId;
        @Column(unique = true)
        private String email;
        private String name;
        private LocalDate birthDate;
        //@OneToOne(cascade = CascadeType.ALL)
        //@JoinColumn(name = "details_id", table = "app_user")
        //private Details userDetails;
        //private String role;


    public Details(int detailsId, String email, String name, LocalDate birthDate) {
        this.detailsId = detailsId;
        this.email = email;
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(int detailsId) {
        this.detailsId = detailsId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}

