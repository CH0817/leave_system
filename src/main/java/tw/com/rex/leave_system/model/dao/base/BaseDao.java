package tw.com.rex.leave_system.model.dao.base;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
public class BaseDao implements Serializable {

    private String id;
    private Date createDate;
    private Date updateDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BaseDao)) {
            return false;
        }
        BaseDao baseDao = (BaseDao) o;
        return id.equals(baseDao.id) && Objects.equals(createDate, baseDao.createDate) && Objects.equals(updateDate,
                                                                                                         baseDao.updateDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createDate, updateDate);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
