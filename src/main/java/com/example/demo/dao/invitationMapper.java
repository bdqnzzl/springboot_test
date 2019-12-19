package com.example.demo.dao;
import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.example.demo.entity.Invitation ;

public interface invitationMapper {
	public List<Invitation> getUserList(Invitation user);
	public int deleteUserById(@Param("id") Integer id);
}
