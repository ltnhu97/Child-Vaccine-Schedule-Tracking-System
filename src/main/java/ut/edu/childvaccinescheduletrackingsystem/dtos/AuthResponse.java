package ut.edu.childvaccinescheduletrackingsystem.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class AuthResponse {
    private String token;
    public AuthResponse(String token) {
        this.token = token;
    }
    // Getter
}
