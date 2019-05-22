package tw.com.rex.leave_system.model.dao.base;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
public class Mobile implements Serializable {

    private String id;
    private String mobile;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Mobile)) {
            return false;
        }
        Mobile mobile1 = (Mobile) o;
        return id.equals(mobile1.id) && mobile.equals(mobile1.mobile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mobile);
    }
}
