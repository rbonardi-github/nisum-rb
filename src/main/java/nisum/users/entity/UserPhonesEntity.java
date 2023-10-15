package nisum.users.entity;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@ToString
@Builder
@Entity
public class UserPhonesEntity implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPhone;

    @Column(nullable = false)
    private String numberPhone;

    @Column(nullable = false)
    private String cityCode;

    @Column(nullable = false)
    private String countryCode;

}