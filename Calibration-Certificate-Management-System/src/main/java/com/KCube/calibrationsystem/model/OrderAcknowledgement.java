package com.KCube.calibrationsystem.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_acknowledgements")
public class OrderAcknowledgement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderAckNo;
    private LocalDate date;
    private String poNo;           // Purchase Order No.
    private String contactPerson;
    private String contactNumber;
    private String email;

    // Many acknowledgements can belong to one contract
    @ManyToOne
    @JoinColumn(name = "contract_id")
    private Contract contract;

    // One order can have multiple line items
    @OneToMany(mappedBy = "orderAcknowledgement", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems = new ArrayList<>();

    // Constructors, getters, setters...
}

