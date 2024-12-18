package com.exe.Product_Marketer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name="Marketing")
public class model {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer pmarketId;

    @NotBlank(message = "Marketer person name is reqired")
    private String name;

    @NotBlank(message = "funds provided for marketing campign must be filled")
    private String funds;
    
    @NotBlank(message = "Marketing cost must be filled up")
    private String marketingcost;

    @NotBlank(message = "Insert likes of the reel or post of promotion")
    private long likes;

    @NotBlank(message = "Insert views of the reel or post of promotion")
    private long views;

    @NotBlank(message = "Select the categary that you had spent for marketing")
    private String categary;

    @NotBlank(message = "Name of the places that installed holding must be filled")
    private String installedpla;

    @NotBlank(message = "Free samples give for brand prmotion must be filled up")
    private Integer samplegiven;
    
}
