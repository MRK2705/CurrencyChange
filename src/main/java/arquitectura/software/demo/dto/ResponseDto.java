package arquitectura.software.demo.dto;

public class ResponseDto<T> {

    private T data;
    private boolean success;
    private String message;

    public ResponseDto() {
    }
    public ResponseDto(T data, boolean success, String message) {
        this.data = data;
        this.success = success;
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResponseDto{" +
                "data=" + data +
                ", success=" + success +
                ", message='" + message + '\'' +
                '}';
    }
}
