package cn.tedu.project2022106.Exception;

public class ServiceException extends RuntimeException{
    String code;
    public ServiceException(String code,String msg){
        super(msg);
        this.code = code;
    }

}
