package cbse.EcoMap.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.time.Instant;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Litter {
	@Id
    @GeneratedValue
    private Long id;
	@Builder.Default
	private Instant date_created = Instant.now();
    private String title;
    private String description;
    @ManyToMany
    private Set<User> user;
}