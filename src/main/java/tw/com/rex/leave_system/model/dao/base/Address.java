package tw.com.rex.leave_system.model.dao.base;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Address implements Serializable {

    private String zip;
    private String address;

}
