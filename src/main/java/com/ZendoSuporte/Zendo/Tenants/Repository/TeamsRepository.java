package com.ZendoSuporte.Zendo.Tenants.Repository;

import com.ZendoSuporte.Zendo.Tenants.Model.TeamsModel;
import com.ZendoSuporte.Zendo.Tenants.Model.TenantModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TeamsRepository extends JpaRepository<TeamsModel, UUID> {
}
