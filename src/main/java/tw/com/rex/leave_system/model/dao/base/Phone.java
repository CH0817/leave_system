package tw.com.rex.leave_system.model.dao.base;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
public class Phone implements Serializable {

    private String id;
    private String areaCode;
    private String phone;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Phone)) {
            return false;
        }
        Phone phone1 = (Phone) o;
        return areaCode.equals(phone1.areaCode) && phone.equals(phone1.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, phone);
    }
}
