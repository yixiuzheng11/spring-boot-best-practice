package cn.javastack.service;

import cn.javastack.dto.SysLogDto;

/**
 * @author 0164631
 */
public interface SysLogService {
    /**
     * 新增用户
     *
     * @param sysLogDto 查询参数
     * @return
     */
    int addLog(SysLogDto sysLogDto);
}
