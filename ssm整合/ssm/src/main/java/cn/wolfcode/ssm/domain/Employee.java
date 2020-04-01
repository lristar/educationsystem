package cn.wolfcode.ssm.domain;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter@Getter@ToString
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Employee {
    private Long id;

    private String username;

    private String password;

    private Boolean admain;

    private String email;
}