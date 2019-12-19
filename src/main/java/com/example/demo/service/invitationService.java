package com.example.demo.service;

import com.example.demo.entity.Invitation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface invitationService {
    public List<Invitation> getUserList(Invitation user);
    public int deleteUserById(@Param("id") Integer id);
}
