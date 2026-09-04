package com.ZendoSuporte.Zendo.Tenants.Repository;

import com.ZendoSuporte.Zendo.Tenants.Model.RolesModel;
import com.ZendoSuporte.Zendo.Tenants.Model.TeamMembersModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RolesRepository extends JpaRepository<RolesModel, UUID> {
}
