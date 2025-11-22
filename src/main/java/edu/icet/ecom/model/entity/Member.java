package edu.icet.ecom.model.entity;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Member {
    private String id;
    private String name;
    private String address;
    private String phoneNo;
}
