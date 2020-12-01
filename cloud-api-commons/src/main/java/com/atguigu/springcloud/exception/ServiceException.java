package com.atguigu.springcloud.exception;


import com.atguigu.springcloud.entities.common.ResError;

/**
 * 业务错误
 *
 * @author: HHF
 * @date: 2020/8/15
 **/
public class ServiceException extends RuntimeException{

    /**
     * 基本错误提示
     */
    public final static com.atguigu.springcloud.exception.ServiceException BASE_SERVICE_EXCEPTION = new com.atguigu.springcloud.exception.ServiceException("BASE_SERVICE_EXCEPTION", "请求失败", "请求失败：%s");
    public final static com.atguigu.springcloud.exception.ServiceException FUNCTION_IN_DEVELOPMENT = new com.atguigu.springcloud.exception.ServiceException("FUNCTION_IN_DEVELOPMENT", "功能开发中", "功能开发中：%s");
    public final static com.atguigu.springcloud.exception.ServiceException ARGUMENTS_INCORRECT = new com.atguigu.springcloud.exception.ServiceException("FUNCTION_IN_DEVELOPMENT", "参数错误", "参数错误：%s");
    public final static com.atguigu.springcloud.exception.ServiceException FUNCTION_INACTIVE = new com.atguigu.springcloud.exception.ServiceException("FUNCTION_INACTIVE", "功能已停用", "功能已停用：%s");
    public final static com.atguigu.springcloud.exception.ServiceException SERVICE_CALL_EXCEPTION = new com.atguigu.springcloud.exception.ServiceException("SERVICE_CALL_EXCEPTION", "服务调用异常!", "服务调用异常：%s");
    public final static com.atguigu.springcloud.exception.ServiceException SERVICE_CALL_FAIl = new com.atguigu.springcloud.exception.ServiceException("SERVICE_CALL_FAIl", "服务调用失败!", "服务调用失败：%s");
    public final static com.atguigu.springcloud.exception.ServiceException NOT_SUPPORTED_EXCEPTION = new com.atguigu.springcloud.exception.ServiceException("NOT_SUPPORTED_EXCEPTION", "不支持的功能!", "不支持的功能：%s");


    /**
     * 权限相关
     */
    public static final com.atguigu.springcloud.exception.ServiceException INSUFFICIENT_PERMISSION = new com.atguigu.springcloud.exception.ServiceException("INSUFFICIENT_PERMISSION", "权限不足", "权限不足：%s");


    /**
     * 登录等相关
     */
    public final static com.atguigu.springcloud.exception.ServiceException USER_NOT_LOGIN = new com.atguigu.springcloud.exception.ServiceException("USER_NOT_LOGIN", "用户未登录", "用户未登录");
    public final static com.atguigu.springcloud.exception.ServiceException USER_LOGIN_FAIL = new com.atguigu.springcloud.exception.ServiceException("USER_LOGIN_FAIL", "登录失败", "登录失败：%s");
    public final static com.atguigu.springcloud.exception.ServiceException USERNAME_PASSWORD_INCONSISTENT = new com.atguigu.springcloud.exception.ServiceException("USERNAME_PASSWORD_INCONSISTENT", "账号密码不一致", "账号密码不一致：%s");
    public final static com.atguigu.springcloud.exception.ServiceException UNKNOWN_USER_TYPE = new com.atguigu.springcloud.exception.ServiceException("UNKNOWN_USER_TYPE", "未知的用户类型", "未知的用户类型：%s");
    public final static com.atguigu.springcloud.exception.ServiceException USER_NOT_SIGN_IN = new com.atguigu.springcloud.exception.ServiceException("USER_NOT_SIGN_IN", "用户未注册", "用户未注册");
    public final static com.atguigu.springcloud.exception.ServiceException USER_PASSWORD_UNSET = new com.atguigu.springcloud.exception.ServiceException("USER_PASSWORD_UNSET", "用户密码未设置", "用户密码未设置");
    public final static com.atguigu.springcloud.exception.ServiceException USER_REGISTER_FAIL = new com.atguigu.springcloud.exception.ServiceException("USER_REGISTER_FAIL", "注册失败!", "注册失败：%s!");
    public final static com.atguigu.springcloud.exception.ServiceException USER_ALREADY_REGISTERED = new com.atguigu.springcloud.exception.ServiceException("USER_ALREADY_REGISTERED", "用户已注册!");
    public final static com.atguigu.springcloud.exception.ServiceException USER_PASSWORD_UPDATE_FAIL = new com.atguigu.springcloud.exception.ServiceException("USER_PASSWORD_UPDATE_FAIL", "用户密码修改失败!");
    public final static com.atguigu.springcloud.exception.ServiceException USER_OUT_BOUND = new com.atguigu.springcloud.exception.ServiceException("USER_OUT_BOUND", "用户已绑定!");
    public final static com.atguigu.springcloud.exception.ServiceException USER_OUT_UN_BIND_ERROR = new com.atguigu.springcloud.exception.ServiceException("USER_OUT_UN_BIND_ERROR", "用户解绑失败!");
    public final static com.atguigu.springcloud.exception.ServiceException LOGIN_AUTO_WX_ERROR = new com.atguigu.springcloud.exception.ServiceException("LOGIN_AUTO_WX_ERROR", "微信用户自动登录失败!");

    /**
     * 验证码相关
     */
    public static final com.atguigu.springcloud.exception.ServiceException SMS_SEND_FAIL = new com.atguigu.springcloud.exception.ServiceException("SMS_SEND_FAIL", "发送短信失败！", "发送短信失败：%s！");
    public static final com.atguigu.springcloud.exception.ServiceException SMS_CODE_EXPIRED = new com.atguigu.springcloud.exception.ServiceException("SMS_CODE_EXPIRED", "验证码已失效！");
    public static final com.atguigu.springcloud.exception.ServiceException SMS_CODE_NOT_VALID = new com.atguigu.springcloud.exception.ServiceException("SMS_CODE_NOT_VALID", "验证码不正确！");
    public static final com.atguigu.springcloud.exception.ServiceException SMS_CODE_NOT_SEND = new com.atguigu.springcloud.exception.ServiceException("SMS_CODE_NOT_SEND", "未发送验证码或验证码已过期！");
    public static final com.atguigu.springcloud.exception.ServiceException SMS_SEND_TIMES_OF_DAY_EXCEEDED = new com.atguigu.springcloud.exception.ServiceException("SMS_SEND_TIMES_OF_DAY_EXCEEDED", "超过日发送次数限制！", "超过日发送次数限制，当前已发送：%d次");

    /**
     * 充电卡
     */
    /**
     *
     */
    public static final com.atguigu.springcloud.exception.ServiceException ChargeCard_NO_DELETE = new com.atguigu.springcloud.exception.ServiceException("NO_DELETE","不能删除","不能删除:%s");

    /**
     * 站点
     */
    /**
     *
     */
    public static final com.atguigu.springcloud.exception.ServiceException DELETE_PROMPT = new com.atguigu.springcloud.exception.ServiceException("DELETE_PROMPT","不能删除","不能删除:%s");
    public static final com.atguigu.springcloud.exception.ServiceException DATA_NOT_EXIST = new com.atguigu.springcloud.exception.ServiceException("DATA_NOT_EXIST","数据不存在","数据不存在:%s");
    public static final com.atguigu.springcloud.exception.ServiceException DATA_EXIST = new com.atguigu.springcloud.exception.ServiceException("DATA_EXIST","数据已存在","DATA_EXIST:%s");
    public static final com.atguigu.springcloud.exception.ServiceException DATA_TYPE_EXIST = new com.atguigu.springcloud.exception.ServiceException("DATA_EXIST","相同类型数据已存在","DATA_EXIST:%s");
    public static final com.atguigu.springcloud.exception.ServiceException NOT_SETMEAL = new com.atguigu.springcloud.exception.ServiceException("NOT_SETMEAL","没有关联套餐","没有关联套餐:%s");
    public static final com.atguigu.springcloud.exception.ServiceException LC_DATA_NOT = new com.atguigu.springcloud.exception.ServiceException("LC_DATA_NOT","临充有且只有一种","临充有且只有一种:%s");
    public static final com.atguigu.springcloud.exception.ServiceException YK_DATA_NOT = new com.atguigu.springcloud.exception.ServiceException("YK_DATA_NOT","同一时间段内，无法购买同一功率的套餐","同一时间段内，无法购买同一功率的套餐:%s");
    public static final com.atguigu.springcloud.exception.ServiceException GENERATE_MONTHLY_CARD_ERROR = new com.atguigu.springcloud.exception.ServiceException("YK_DATA_NOT","生成月卡错误","生成月卡错误:%s");


    // ***********************
    // 套餐相关
    // ***********************
    public static final com.atguigu.springcloud.exception.ServiceException SML_GET_ERROR = new com.atguigu.springcloud.exception.ServiceException("SML_GET_ERROR", "获取套餐失败", "获取套餐失败:%s");
    public static final com.atguigu.springcloud.exception.ServiceException SML_MODIFY_ERROR = new com.atguigu.springcloud.exception.ServiceException("SML_MODIFY_ERROR", "套餐编辑失败", "套餐编辑失败：%s");


    // ***********************
    // 账户相关
    // ***********************
    public static final com.atguigu.springcloud.exception.ServiceException ACCOUNT_GET_ERROR = new com.atguigu.springcloud.exception.ServiceException("ACCOUNT_GET_ERROR", "获取用户账户失败", "获取用户账户失败:%s");
    public static final com.atguigu.springcloud.exception.ServiceException ACCOUNT_AMOUNT_NOT_ENOUGH = new com.atguigu.springcloud.exception.ServiceException("ACCOUNT_AMOUNT_NOT_ENOUGH", "账户余额不足");
    public static final com.atguigu.springcloud.exception.ServiceException ACCOUNT_CONSUME_ERROR = new com.atguigu.springcloud.exception.ServiceException("ACCOUNT_CONSUME_ERROR", "消费金额错误");
    public static final com.atguigu.springcloud.exception.ServiceException ACCOUNT_RECHARGE_FINISHED = new com.atguigu.springcloud.exception.ServiceException("ACCOUNT_RECHARGE_FINISHED", "账户充值已完成");
    public static final com.atguigu.springcloud.exception.ServiceException RECHARGE_CREATE_ERROR = new com.atguigu.springcloud.exception.ServiceException("RECHARGE_CREATE_ERROR", "创建充值订单失败", "创建充值订单失败：%s");
    public static final com.atguigu.springcloud.exception.ServiceException RECHARGE_CHECK_ERROR = new com.atguigu.springcloud.exception.ServiceException("RECHARGE_CHECK_ERROR", "校验充值订单失败", "校验充值订单失败：%s");
    public static final com.atguigu.springcloud.exception.ServiceException RECHARGE_QUERY_ERROR = new com.atguigu.springcloud.exception.ServiceException("RECHARGE_QUERY_ERROR", "查询充值订单失败", "查询充值订单失败：%s");
    public static final com.atguigu.springcloud.exception.ServiceException RECHARGE_TYPE_UN_SUPPORT = new com.atguigu.springcloud.exception.ServiceException("RECHARGE_TYPE_UN_SUPPORT", "充值类型未支持");
    public static final com.atguigu.springcloud.exception.ServiceException RECHARGE_UN_SUCCESS = new com.atguigu.springcloud.exception.ServiceException("RECHARGE_UN_SUCCESS", "充值订单未完成");
    public static final com.atguigu.springcloud.exception.ServiceException RECHARGE_WAIT_PAY = new com.atguigu.springcloud.exception.ServiceException("RECHARGE_WAIT_PAY", "充值订单待支付");
    public static final com.atguigu.springcloud.exception.ServiceException RECHARGE_CLOSED = new com.atguigu.springcloud.exception.ServiceException("RECHARGE_CLOSED", "充值订单已关闭");
    public static final com.atguigu.springcloud.exception.ServiceException RECHARGE_FINISHED = new com.atguigu.springcloud.exception.ServiceException("RECHARGE_FINISHED", "充值订单已结束");

    // ***********************
    // 三方账户相关
    // ***********************
    public static final com.atguigu.springcloud.exception.ServiceException OUT_USER_UN_FOUND = new com.atguigu.springcloud.exception.ServiceException("OUT_USER_UN_FOUND", "查询不到三方绑定用户", "查询不到三方绑定用户:%s");

    // 用户业务

    public static final com.atguigu.springcloud.exception.ServiceException ACCOUNT_UN_ENOUGH_ERROR = new com.atguigu.springcloud.exception.ServiceException("ACCOUNT_UN_ENOUGH_ERROR", "账户余额不足");
    public static final com.atguigu.springcloud.exception.ServiceException DEDUCTION_FEE_ERROR = new com.atguigu.springcloud.exception.ServiceException("ACCOUNT_UN_ENOUGH_ERROR", "扣费失败");
    public static final com.atguigu.springcloud.exception.ServiceException UNSUPPORTED_PAY_TYPE_ERROR = new com.atguigu.springcloud.exception.ServiceException("UNSUPPORTED_PAY_TYPE_ERROR", "不支持的计费支付方式");
    public static final com.atguigu.springcloud.exception.ServiceException UNSUPPORTED_REFUND_ERROR = new com.atguigu.springcloud.exception.ServiceException("UNSUPPORTED_REFUND_ERROR", "暂不支持该退款方式");
    public static final com.atguigu.springcloud.exception.ServiceException UNSUPPORTED_PAY_TYPE_ERROR_MORE_MESSAGE = new com.atguigu.springcloud.exception.ServiceException("UNSUPPORTED_PAY_TYPE_ERROR", "不支持的计费支付方式，%s");
    public static final com.atguigu.springcloud.exception.ServiceException UNSUPPORTED_CHARGE_TYPE_ERROR = new com.atguigu.springcloud.exception.ServiceException("UNSUPPORTED_CHARGE_TYPE_ERROR", "不支持的充电方式");
    public static final com.atguigu.springcloud.exception.ServiceException UNSUPPORTED_CHARGE_MODE_ERROR = new com.atguigu.springcloud.exception.ServiceException("UNSUPPORTED_CHARGE_MODE_ERROR", "不支持的充电模式");
    public static final com.atguigu.springcloud.exception.ServiceException UNKNOWN_CHARGE_PAY_STATE_ERROR = new com.atguigu.springcloud.exception.ServiceException("UNKNOWN_CHARGE_PAY_STATE_ERROR", "未知的充电订单支付状态");
    public static final com.atguigu.springcloud.exception.ServiceException UNKNOWN_CHARGE_PAY_ORDER_STATE_ERROR = new com.atguigu.springcloud.exception.ServiceException("UNKNOWN_CHARGE_PAY_ORDER_STATE_ERROR", "未知的充电支付订单状态");
    public static final com.atguigu.springcloud.exception.ServiceException UNKNOWN_TRADE_REFUND_STATE_ERROR = new com.atguigu.springcloud.exception.ServiceException("UNKNOWN_TRADE_REFUND_STATE_ERROR", "未知的退款订单状态");
    public static final com.atguigu.springcloud.exception.ServiceException UNKNOWN_ORDER_SOURCE_ERROR = new com.atguigu.springcloud.exception.ServiceException("UNKNOWN_ORDER_SOURCE_ERROR", "未知的订单来源");
    public static final com.atguigu.springcloud.exception.ServiceException UNKNOWN_SYS_TYPE_ERROR = new com.atguigu.springcloud.exception.ServiceException("UNKNOWN_SYS_TYPE_ERROR", "未知的系统类型");
    public static final com.atguigu.springcloud.exception.ServiceException UNKNOWN_USER_OUT_GENDER_ERROR = new com.atguigu.springcloud.exception.ServiceException("UNKNOWN_USER_OUT_GENDER_ERROR", "未知的外置用户性别类型");
    public static final com.atguigu.springcloud.exception.ServiceException PLUG_NOT_ONLINE_ERROR = new com.atguigu.springcloud.exception.ServiceException("PLUG_NOT_ONLINE_ERROR", "插座设备不在线，无法充电！");
    public static final com.atguigu.springcloud.exception.ServiceException GATEWAY_MALFUNCTION_ERROR = new com.atguigu.springcloud.exception.ServiceException("GATEWAY_MALFUNCTION_ERROR", "网关设备故障，无法充电！");
    public static final com.atguigu.springcloud.exception.ServiceException TIMEOUT_NOT_REPORTED_ERROR = new com.atguigu.springcloud.exception.ServiceException("TIMEOUT_NOT_REPORTED_ERROR", "超时未上报，启动充电失败！");
    public static final com.atguigu.springcloud.exception.ServiceException BACKSTAGE_PLUG_CONNECTION_FAIL = new com.atguigu.springcloud.exception.ServiceException("BACKSTAGE_PLUG_CONNECTION_FAIL", "后台与设备连接失败！");
    public static final com.atguigu.springcloud.exception.ServiceException PLUG_EXIST_UN_FINISH_ORDER = new com.atguigu.springcloud.exception.ServiceException("PLUG_EXIST_UN_FINISH_ORDER", "当前插孔存在未完成订单，无法充电！");

    // 订单信息

    public static final com.atguigu.springcloud.exception.ServiceException CHARGE_ORDER_NO_DELETE = new com.atguigu.springcloud.exception.ServiceException("CHARGE_ORDER_NO_DELETE", "该订单不可删除");
    public static final com.atguigu.springcloud.exception.ServiceException CHARGE_ORDER_UNDEFINED_ERROR = new com.atguigu.springcloud.exception.ServiceException("CHARGE_ORDER_UNDEFINED_ERROR", "订单不存在");
    public static final com.atguigu.springcloud.exception.ServiceException CHARGE_ORDER_OVER_ERROR = new com.atguigu.springcloud.exception.ServiceException("CHARGE_ORDER_OVER_ERROR", "订单已完成");
    public static final com.atguigu.springcloud.exception.ServiceException CHARGE_ORDER_START_FAIL_ERROR = new com.atguigu.springcloud.exception.ServiceException("CHARGE_ORDER_START_FAIL_ERROR", "启动失败");
    public static final com.atguigu.springcloud.exception.ServiceException CHARGE_ORDER_STOP_FAIL_ERROR = new com.atguigu.springcloud.exception.ServiceException("CHARGE_ORDER_STOP_FAIL_ERROR", "停止失败");
    public static final com.atguigu.springcloud.exception.ServiceException CHARGE_ORDER_NOT_COMPLETED_ERROR = new com.atguigu.springcloud.exception.ServiceException("CHARGE_ORDER_NOT_COMPLETED_ERROR", "有未完成订单");
    public static final com.atguigu.springcloud.exception.ServiceException CHARGE_ORDER_CANCELED_ERROR = new com.atguigu.springcloud.exception.ServiceException("CHARGE_ORDER_CANCELED_ERROR", "订单已取消");
    public static final com.atguigu.springcloud.exception.ServiceException CHARGE_ORDER_CAN_NOT_CANCEL_ERROR = new com.atguigu.springcloud.exception.ServiceException("CHARGE_ORDER_CAN_NOT_CANCEL_ERROR", "订单非可取消状态");
    public static final com.atguigu.springcloud.exception.ServiceException CHARGE_ORDER_PAY_NOT_COMPLETED_ERROR = new com.atguigu.springcloud.exception.ServiceException("CHARGE_ORDER_NOT_COMPLETED_ERROR", "订单未支付完成");
    public static final com.atguigu.springcloud.exception.ServiceException CHARGE_ORDER_PAY_FAIL = new com.atguigu.springcloud.exception.ServiceException("CHARGE_ORDER_PAY_FAIL", "订单支付失败", "订单支付失败：%s");
    public static final com.atguigu.springcloud.exception.ServiceException CHARGE_ORDER_NOT_PAY_STATE = new com.atguigu.springcloud.exception.ServiceException("CHARGE_ORDER_NOT_PAY_STATE", "订单非可支付状态");
    public static final com.atguigu.springcloud.exception.ServiceException CHARGE_ORDER_PAID = new com.atguigu.springcloud.exception.ServiceException("CHARGE_ORDER_PAID", "订单已支付完成，不可重复支付");
    public static final com.atguigu.springcloud.exception.ServiceException CHARGE_ORDER_CAN_NOT_COMPLETE_ERROR = new com.atguigu.springcloud.exception.ServiceException("CHARGE_ORDER_CAN_NOT_COMPLETE_ERROR", "订单非可完成状态");
    public final static com.atguigu.springcloud.exception.ServiceException NO_USER_ORDER = new com.atguigu.springcloud.exception.ServiceException("NO_USER_ORDER", "非当前用户订单!");

    // 二维码相关
    public static final com.atguigu.springcloud.exception.ServiceException CODE_SCAN_FAIL = new com.atguigu.springcloud.exception.ServiceException("CODE_SCAN_FAIL", "扫码失败！", "扫码失败：%s!");
    public static final com.atguigu.springcloud.exception.ServiceException GET_EQUIPMENT_FAIL = new com.atguigu.springcloud.exception.ServiceException("GET_EQUIPMENT_FAIL", "获取设备信息失败！", "获取设备信息失败：%s!");
    public static final com.atguigu.springcloud.exception.ServiceException UNDEFINED_EQUIPMENT = new com.atguigu.springcloud.exception.ServiceException("UNDEFINED_EQUIPMENT", "获取不到设备信息！", "获取不到设备信息：%s!");
    public static final com.atguigu.springcloud.exception.ServiceException GET_PLATFORM_URL_ERROR = new com.atguigu.springcloud.exception.ServiceException("GET_PLATFORM_URL_ERROR", "获取平台入口失败！", "获取平台入口失败：%s！");
    public static final com.atguigu.springcloud.exception.ServiceException GET_WX_MENU_ERROR = new com.atguigu.springcloud.exception.ServiceException("GET_WX_MENU_ERROR", "获取微信菜单地址失败！", "获取微信菜单地址失败：%s！");
    public static final com.atguigu.springcloud.exception.ServiceException PLATFORM_NONSUPPORT_ERROR = new com.atguigu.springcloud.exception.ServiceException("PLATFORM_NONSUPPORT_ERROR", "未支持的平台入口", "未支持的平台入口：%s！");
    public static final com.atguigu.springcloud.exception.ServiceException PLUG_UN_BIND_GATEWAY = new com.atguigu.springcloud.exception.ServiceException("PLUG_UN_BIND_GATEWAY", "设备未绑定网关，暂不可用", "设备未绑定网关，暂不可用：%s！");


    // ***********************
    // 运营入口相关
    // ***********************
    public static final com.atguigu.springcloud.exception.ServiceException UN_SUPPORT_PLATFORM_TYPE = new com.atguigu.springcloud.exception.ServiceException("UN_SUPPORT_PLATFORM_TYPE", "未知的运营入口类型", "未知的运营入口类型：%s");
    public static final com.atguigu.springcloud.exception.ServiceException GET_OPERATOR_FAIL = new com.atguigu.springcloud.exception.ServiceException("GET_OPERATOR_FAIL", "获取运营商失败", "获取运营商失败：%s");
    public static final com.atguigu.springcloud.exception.ServiceException PLATFORM_ENTRANCE_NOT_OPEN_ERROR = new com.atguigu.springcloud.exception.ServiceException("PLATFORM_ENTRANCE_NOT_OPEN_ERROR", "平台入口未开放，请使用其他方式", "平台入口未开放，请使用其他方式");
    public static final com.atguigu.springcloud.exception.ServiceException PLATFORM_ENTRANCE_UNDEFINED_ERROR = new com.atguigu.springcloud.exception.ServiceException("PLATFORM_ENTRANCE_UNDEFINED_ERROR", "运营入口获取失败", "运营入口获取失败：%s");
//    public static final ServiceException CHANNEL_UNDEFINED_ERROR = new ServiceException("CHANNEL_UNDEFINED_ERROR", "查询不到渠道商信息，请联系管理员");
//    public static final ServiceException CHANNEL_FILE_UNDEFINED_ERROR = new ServiceException("CHANNEL_FILE_UNDEFINED_ERROR", "查询不到渠道商图片信息，请联系管理员");
//    public static final ServiceException REGISTER_BIND_UNLIKE_ERROR = new ServiceException("REGISTER_BIND_UNLIKE_ERROR", "注册和绑定运营商不一致");


    // 微信相关
    public static final com.atguigu.springcloud.exception.ServiceException WX_ERROR = new com.atguigu.springcloud.exception.ServiceException("WX_ERROR", "请求微信信息错误", "请求微信信息错误：%s!");



    // ***********************
    // 移动端相关
    // ***********************
    public static final com.atguigu.springcloud.exception.ServiceException QUERY_ERROR = new com.atguigu.springcloud.exception.ServiceException("QUERY_ERROR", "查询失败", "查询失败：%s!");
    public static final com.atguigu.springcloud.exception.ServiceException QUERY_TOPUP_ERROR = new com.atguigu.springcloud.exception.ServiceException("QUERY_TOPUP_ERROR", "查询充值配置失败", "查询充值配置失败：%s!");
    public static final com.atguigu.springcloud.exception.ServiceException VERIFY_CODE_ERROR = new com.atguigu.springcloud.exception.ServiceException("VERIFY_CODE_ERROR", "校验设备编号失败", "校验设备编号失败：%s!");
    public static final com.atguigu.springcloud.exception.ServiceException MONTH_CARD_QUERY_ERROR = new com.atguigu.springcloud.exception.ServiceException("MONTH_CARD_QUERY_ERROR", "查询月卡信息失败", "查询月卡信息失败：%s!");
    public static final com.atguigu.springcloud.exception.ServiceException MONTH_CARD_BUY_ERROR = new com.atguigu.springcloud.exception.ServiceException("MONTH_CARD_BUY_ERROR", "购买月卡失败", "购买月卡失败：%s!");
    public static final com.atguigu.springcloud.exception.ServiceException CHARGE_ORDER_CANCEL_ERROR = new com.atguigu.springcloud.exception.ServiceException("CHARGE_ORDER_CANCEL_ERROR", "取消充电订单失败", "取消充电订单失败：%s!");
    public static final com.atguigu.springcloud.exception.ServiceException CHARGE_ORDER_START_ERROR = new com.atguigu.springcloud.exception.ServiceException("CHARGE_ORDER_START_ERROR", "启动充电订单失败", "启动充电订单失败：%s!");
    public static final com.atguigu.springcloud.exception.ServiceException CHARGE_ORDER_STOP_ERROR = new com.atguigu.springcloud.exception.ServiceException("CHARGE_ORDER_STOP_ERROR", "停止充电订单失败", "停止充电订单失败：%s!");
    public static final com.atguigu.springcloud.exception.ServiceException CHARGE_RECORD_QUERY_ERROR = new com.atguigu.springcloud.exception.ServiceException("CHARGE_RECORD_QUERY_ERROR", "查询充电记录失败", "查询充电记录失败：%s!");
    public static final com.atguigu.springcloud.exception.ServiceException AREA_QUERY_ERROR = new com.atguigu.springcloud.exception.ServiceException("AREA_QUERY_ERROR", "获取充电片区失败", "获取充电片区失败：%s!");
    public static final com.atguigu.springcloud.exception.ServiceException STATION_SML_QUERY_ERROR = new com.atguigu.springcloud.exception.ServiceException("STATION_SML_QUERY_ERROR", "获取站点套餐信息失败", "获取站点套餐信息失败：%s!");
    public static final com.atguigu.springcloud.exception.ServiceException RECHARGE_CONSUME_ERROR = new com.atguigu.springcloud.exception.ServiceException("RECHARGE_CONSUME_ERROR", "充值/消费失败", "充值/消费失败：%s!");
    public static final com.atguigu.springcloud.exception.ServiceException CHARGE_PAY_ERROR = new com.atguigu.springcloud.exception.ServiceException("CHARGE_PAY_ERROR", "充电订单支付失败", "充电订单支付失败：%s!");
//    public static final ServiceException RECHARGE_CHECK_ERROR = new ServiceException("RECHARGE_CHECK_ERROR", "充值订单校验失败", "充值订单校验失败：%s!");
//    public static final ServiceException RECHARGE_CREATE_ERROR = new ServiceException("RECHARGE_CREATE_ERROR", "创建充值订单失败", "创建充值订单失败：%s");
    public static final com.atguigu.springcloud.exception.ServiceException ACCOUNT_QUERY_ERROR = new com.atguigu.springcloud.exception.ServiceException("ACCOUNT_QUERY_ERROR", "查询用户账户信息失败", "查询用户账户信息失败：%s!");

    private String code;
    private String templateMessage;

    public static com.atguigu.springcloud.exception.ServiceException ServiceException(String message){
        return ServiceException(BASE_SERVICE_EXCEPTION, message);
    }

    public static com.atguigu.springcloud.exception.ServiceException ServiceException(ResError resError){
        return new com.atguigu.springcloud.exception.ServiceException(resError.getCode(), resError.getMessage());
    }

    public static com.atguigu.springcloud.exception.ServiceException ServiceException(com.atguigu.springcloud.exception.ServiceException serviceException, String message){
        String templateMsg = serviceException.getTemplateMessage();
        if(null == templateMsg || "".equals(templateMsg)){
            return new com.atguigu.springcloud.exception.ServiceException(serviceException.getCode(), serviceException.getMessage());
        }
        return new com.atguigu.springcloud.exception.ServiceException(serviceException.getCode(), String.format(templateMsg, message));
    }

    public ServiceException(String code, String message) {
        super(message);
        this.code = code;
    }

    public ServiceException(String code, String message, String templateMessage) {
        super(message);
        this.code = code;
        this.templateMessage = templateMessage;
    }

    public ServiceException(ResError resError) {
        super(resError.getMessage());
        this.code = resError.getCode();
    }
    public String getCode() {
        return code;
    }

    public String getTemplateMessage() {
        return templateMessage;
    }

    public com.atguigu.springcloud.exception.ServiceException message(String message){
        return ServiceException(this, message);
    }
}
