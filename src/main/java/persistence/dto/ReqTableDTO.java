package persistence.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class ReqTableDTO implements Serializable {
    private static final long serialVersionUID = 2L;
    private String forex; //외화종류
}
