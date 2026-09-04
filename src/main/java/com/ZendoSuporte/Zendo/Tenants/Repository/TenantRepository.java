package com.ZendoSuporte.Zendo.Tenants.Repository;

import com.ZendoSuporte.Zendo.Tenants.Model.TenantModel;
import com.ZendoSuporte.Zendo.Tenants.Model.UserRolesModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TenantRepository extends JpaRepository<TenantModel, UUID> {
}
