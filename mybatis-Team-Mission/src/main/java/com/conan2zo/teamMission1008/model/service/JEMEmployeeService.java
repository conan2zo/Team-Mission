package com.conan2zo.teamMission1008.model.service;

import org.apache.ibatis.session.SqlSession;

import static com.conan2zo.teamMission1008.common.Template.getSqlSession;

public class JEMEmployeeService {

    public void selectAllMember() {
        SqlSession sqlSession = getSqlSession();


    }
}
