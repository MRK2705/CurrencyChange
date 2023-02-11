package arquitectura.software.demo.dto;

import java.math.BigDecimal;

public class CurrencyDto {

    private boolean success;
    private RequestDto query;
    private InfoDto info;
    private String date;
    private BigDecimal result;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public RequestDto getQuery() {
        return query;
    }

    public void setQuery(RequestDto query) {
        this.query = query;
    }

    public InfoDto getInfo() {
        return info;
    }

    public void setInfo(InfoDto info) {
        this.info = info;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public BigDecimal getResult() {
        return result;
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "CurrencyDto{" +
                "success=" + success +
                ", query=" + query +
                ", info=" + info +
                '}';
    }
}
