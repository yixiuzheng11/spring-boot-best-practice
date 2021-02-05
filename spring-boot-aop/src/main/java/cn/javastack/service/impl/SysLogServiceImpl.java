package cn.javastack.service.impl;

import cn.javastack.dto.SysLogDto;
import cn.javastack.entity.SysLog;
import cn.javastack.entity.User;
import cn.javastack.mapper.SysLogMapper;
import cn.javastack.service.SysLogService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 0164631
 */
@Service
public class SysLogServiceImpl implements SysLogService {
    @Autowired
    private SysLogMapper sysLogMapper;

    @Override
    public int addLog(SysLogDto sysLogDto) {
        SysLog sysLog = new SysLog();
        BeanUtils.copyProperties(sysLogDto, sysLog);
        return sysLogMapper.insert(sysLog);
    }
}
