package com.example.demo.service;
import com.example.demo.dao.invitationMapper;
import com.example.demo.entity.Invitation;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
@Service
public class invitationbServicelmp implements invitationService  {
    @Resource
    private invitationMapper Mapper;
    @Override
    public List<Invitation> getUserList(Invitation user) {
        return Mapper.getUserList(user);
    }

    @Override
    public int deleteUserById(Integer id) {
        return Mapper.deleteUserById(id);
    }
}
