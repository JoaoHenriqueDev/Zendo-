package com.ZendoSuporte.Zendo.Tenants.Repository;

import com.ZendoSuporte.Zendo.Tenants.Model.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsersRepository extends JpaRepository<UsersModel, UUID> {
}
