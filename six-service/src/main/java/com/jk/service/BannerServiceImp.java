package com.jk.service;

import com.jk.entity.Banner;
import com.jk.mapper.BannerMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dell on 2017/5/24.
 */
@Service
public class BannerServiceImp implements BannerService {

    @Resource
    private BannerMapper bannerMapper;

    @Override
    public void test() {
        System.out.println(2);
        List<Banner> list = bannerMapper.selectBannerList();
        for (Banner b: list)
            System.out.println(b.getT_imgpath());
    }

    @Override
    public List<Banner> selectBannerMessageList() {
        return bannerMapper.selectBannerList();
    }
}
