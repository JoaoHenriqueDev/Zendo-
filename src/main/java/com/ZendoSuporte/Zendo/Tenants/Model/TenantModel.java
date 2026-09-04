package com.ZendoSuporte.Zendo.Tenants.Model;

import io.lettuce.core.dynamic.annotation.CommandNaming;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tenant")
public class TenantModel {
    @Id
    @GeneratedValue( strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private String document;
    private String email;
    private String status;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
