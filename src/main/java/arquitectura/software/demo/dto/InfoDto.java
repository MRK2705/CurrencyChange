package arquitectura.software.demo.dto;

import java.math.BigDecimal;
import java.math.BigInteger;

public class InfoDto {
    private BigInteger timestamp;
    private BigDecimal rate;

    public BigInteger getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(BigInteger timestamp) {
        this.timestamp = timestamp;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "InfoDto{" +
                "timestamp=" + timestamp +
                ", rate=" + rate +
                '}';
    }

}
