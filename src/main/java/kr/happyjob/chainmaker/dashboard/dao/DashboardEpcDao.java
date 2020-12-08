package kr.happyjob.chainmaker.dashboard.dao;

import java.util.List;

import kr.happyjob.chainmaker.dashboard.model.ProductCategoryVO;
import kr.happyjob.chainmaker.dashboard.model.SlideProductInfoRequestDTO;
import kr.happyjob.chainmaker.dashboard.model.SlideProductInfoVO;

public interface DashboardEpcDao {

	// 슬라이드쇼 제품 정보 리스트 가져오기
	public List<SlideProductInfoVO> selectSlideProductInfo(SlideProductInfoRequestDTO slideProductInfoRequestDTO);
	
	// 제품 카테고리 리스트 가져오기
	public List<ProductCategoryVO> selectProductCategory();
}
