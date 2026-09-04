package com.ZendoSuporte.Zendo.Tenants.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "permissions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PermissionsModel {
    @Id
    @GeneratedValue( strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private String description;
}
