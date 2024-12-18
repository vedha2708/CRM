package com.exe.Manager;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="manager" , uniqueConstraints = @UniqueConstraint(columnNames = "email") )
public class registermodel {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer managerId;

    @NotBlank(message="Manager name can't be blank")
    private String  fullname;

    @NotBlank(message="Manager Photo should be uploaded")
    private String photoId;

    @NotBlank(message="Manager's postiton must be filled")
    private String postion;

    @NotBlank(message="Manager's work email must be filled")
    private String email;

    @NotBlank(message="Manager's work no. must be filled")
    private String phoneno;

    @NotBlank(message="Department of the manager must be selected")
    private String department;
    
    @NotBlank(message="Upload the digital signature of the manager")
    private String signature; 

    
}
