package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.Resident;

import java.util.List;

@Mapper
public interface ResidentMapper {
    List<Resident> getAllResidents();
}