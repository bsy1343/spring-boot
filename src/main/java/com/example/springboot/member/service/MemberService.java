package com.example.springboot.member.service;

import com.example.springboot.member.controller.dto.JoinRequest;

public interface MemberService {

    // String join (String id, String name, String phoneNumber);
    String join (JoinRequest joinRequest);
}
