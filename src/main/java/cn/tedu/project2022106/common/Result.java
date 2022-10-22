package cn.tedu.project2022106.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private String code;
    private String msg;//错误提示信息
    private Object data;
    public static Result success(){
        return new Result(ConStants.CODE_200,"","");
    }
    public static Result error(){
        return new Result(ConStants.CODE_500,"","");
    }
    public static Result success(Object data){
        return new Result(ConStants.CODE_200,"",data);
    }
    public static Result error(String msg,String code){
        return new Result(code,msg,"");
    }
}
