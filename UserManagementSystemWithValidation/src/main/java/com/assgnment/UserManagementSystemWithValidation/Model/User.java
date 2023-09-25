package com.assgnment.UserManagementSystemWithValidation.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class User {
    @Id
    private Long userId;

    @NotBlank
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z]).+$")
    private String userName;

    @Pattern(regexp = "^(0[1-9]|1[0-2])/(0[1-9]|1[0-9]|2[0-9]|3[0-1])/(19|20)\\d{2}$")
    private String doB;

    @Email(message = "Enter vail email")
    private String email;

    @Size(min = 12, max = 12)
    @Pattern(regexp = "91[0-9]+", message = "Enter a valid Phone Number")
    private Long phoneNumber;

    private LocalDate date;

    private LocalTime time;
}
