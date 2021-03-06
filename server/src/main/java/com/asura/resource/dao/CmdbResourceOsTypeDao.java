package com.asura.resource.dao;
import com.asura.framework.base.paging.PagingResult;
import com.asura.framework.base.paging.SearchMap;
import com.asura.framework.dao.mybatis.base.MybatisDaoContext;
import com.asura.framework.dao.mybatis.paginator.domain.PageBounds;
import com.asura.common.dao.BaseDao;
import com.asura.resource.entity.CmdbResourceOsTypeEntity;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;


/**
 * <p></p>
 * <p/>
 * <PRE>
 * <BR>
 * <BR>-----------------------------------------------
 * <BR>
 * </PRE>
 *
 * @author zhaozq14
 * @version 1.0
 * @date 2016-07-28 11:31:44
 * @since 1.0
 */
@Repository("com.asura.resource.dao.CmdbResourceOsTypeDao")
public class CmdbResourceOsTypeDao extends BaseDao<CmdbResourceOsTypeEntity>{

    @Resource(name="monitor.MybatisDaoContext")
     private MybatisDaoContext mybatisDaoContext;


    /**
     * 所有信息
     * @param searchMap
     * @param pageBounds
     * @return
     */
    public PagingResult<CmdbResourceOsTypeEntity> findAll(SearchMap searchMap, PageBounds pageBounds){
        return mybatisDaoContext.findForPage(this.getClass().getName()+".selectByAll",CmdbResourceOsTypeEntity.class,searchMap,pageBounds);
    }
}
