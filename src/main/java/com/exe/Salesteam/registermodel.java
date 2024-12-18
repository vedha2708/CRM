package com.exe.Salesteam;

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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="sales" , uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class registermodel {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer salesId;

    @NotBlank(message="Name of the sales person can't be blank")
    private String name;

    @NotBlank(message="Agency of the salesperson must be filled up")
    private String agencyname;

    @NotBlank(message=" Fill the total product items. ")
    private Integer items;

    @NotBlank(message="At the start of the day stock item that you had")
    private String stocksstart;

    @NotBlank(message="The number of items sold today")
    private String solditems;

    @NotBlank(message="The total revenue generated today.")
    private String revenuegenrate;

    @NotBlank(message="The total profit generted by solding the items")
    private String profit;
    
}
