package com.github.zuihou.authority.service.core;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.zuihou.authority.entity.core.Org;

/**
 * <p>
 * 业务接口
 *
 * </p>
 *
 * @author zuihou
 * @date 2019-07-03
 */
public interface OrgService extends IService<Org> {
    /**
     * 查询指定id集合下的所有子集
     *
     * @param ids
     * @return
     */
    List<Org> findChildren(List<Long> ids);
}
