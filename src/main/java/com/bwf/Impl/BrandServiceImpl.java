package com.bwf.Impl;

import com.bwf.bean.bo.BrandAddBo;
import com.bwf.bean.bo.BrandSearchBo;
import com.bwf.bean.po.Brand;
import com.bwf.mapper.BrandMapper;
import com.bwf.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * @author Hua
 */
@Service("brandService")
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> getBrandList(BrandSearchBo bo) {
        return brandMapper.getBrandList(bo);
    }

    @Override
    public int updateBrand(BrandSearchBo bo) {
        bo.setUpdateTime(String.valueOf(LocalDateTime.now()));
        return brandMapper.updateBrand(bo);
    }

    @Override
    public int addBrand(BrandAddBo bo) {
//        MultipartFile multipartFile = bo.getBrandImage();
//        final String uploadFileName = multipartFile.getOriginalFilename();
//        String url = "https://bwf-shopadmin.oss-cn-shanghai.aliyuncs.com/";
//        LocalDate dir = LocalDate.now();
//        String objectName = dir + "/" + uploadFileName;
//        try {
//            PutObjectResult result = ossClient.putObject("bwf-shopadmin", objectName, multipartFile.getInputStream());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        bo.setBrandLogoUrl(url + objectName);
        bo.setBrandId(UUID.randomUUID().toString().replace("-", ""));
        bo.setCreateTime(LocalDateTime.now());
        bo.setUpdateTime(LocalDateTime.now());
        return brandMapper.addBrand(bo);
    }

    @Override
    public int deleteBrand(String brandId) {
        return brandMapper.deleteBrand(brandId);
    }
}
