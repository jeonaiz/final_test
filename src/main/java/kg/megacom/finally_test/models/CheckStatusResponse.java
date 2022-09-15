package kg.megacom.finally_test.models;

import lombok.Data;

import java.util.List;

@Data
public class CheckStatusResponse {

    private Long timestamp;
    private List<User> users;
}
