package com.ZendoSuporte.Zendo.Tenants.Repository;

import com.ZendoSuporte.Zendo.Tenants.Model.TeamMembersModel;
import com.ZendoSuporte.Zendo.Tenants.Model.TeamsModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TeamMembersRepository extends JpaRepository<TeamMembersModel, UUID> {
}
