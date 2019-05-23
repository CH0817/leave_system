package tw.com.rex.leave_system.model.dao.base;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
public class Fax implements Serializable {

    private String id;
    private String areaCode;
    private String fax;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Fax)) {
            return false;
        }
        Fax fax1 = (Fax) o;
        return areaCode.equals(fax1.areaCode) && fax.equals(fax1.fax);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, fax);
    }
}
