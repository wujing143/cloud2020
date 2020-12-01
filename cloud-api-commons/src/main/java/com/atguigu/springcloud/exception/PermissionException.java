package com.atguigu.springcloud.exception;



/**
 * @author: HHF
 * @date: 2020/8/27
 **/
public class PermissionException extends ServiceException {

    /**
     * 权限相关
     */
    public static final ServiceException PERMISSION_FAIL = new ServiceException("PERMISSION_FAIL", "权限验证失败", "权限验证失败：%s");
    public static final ServiceException PERMISSION_FAIL_REMOTE_VALIDATION = new ServiceException("PERMISSION_FAIL_REMOTE_VALIDATION", "远程权限验证失败", "远程权限验证失败：%s");
    public static final ServiceException PERMISSION_FAIL_VALIDATION = new ServiceException("PERMISSION_FAIL_VALIDATION", "权限验证失败", "权限验证失败：%s");
    public static final ServiceException PERMISSION_FAIL_EXPIRED = new ServiceException("PERMISSION_FAIL_EXPIRED", "登录已失效", "登录已失效：%s");
    public static final ServiceException PERMISSION_FAIL_TOKEN_ERROR = new ServiceException("PERMISSION_FAIL_TOKEN_ERROR", "权限验证失败", "权限验证失败：%s");

    public PermissionException(String code, String message, String templateMessage) {
        super(code, message, templateMessage);
    }
}
