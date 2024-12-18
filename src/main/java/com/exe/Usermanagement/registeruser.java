package com.exe.Usermanagement;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user" , uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class registeruser {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pvt_id")
    private Integer id;
    
    @NotBlank(message = "Name of the user can't be blank")
    private String name;

    @Email
    @NotBlank(message = "Email can't be blank")
    private String email;

    @NotBlank(message = "Password must be filled")
    @Size(min = 8, message = "Password must be at least 8 characters long")
    private String password;

    @NotBlank(message = "Confirmpassword must be filled")
    @AssertTrue(message = "confirmpassword must be matched")
    private String confirmpassword;
}
