package com.ZendoSuporte.Zendo.Tenants.Repository;

import com.ZendoSuporte.Zendo.Tenants.Model.PermissionsModel;
import com.ZendoSuporte.Zendo.Tenants.Model.RolePermissionsModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PermissionsRepository extends JpaRepository<PermissionsModel, UUID> {
}
